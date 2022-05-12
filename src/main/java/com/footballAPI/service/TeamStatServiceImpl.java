package com.footballAPI.service;

import com.footballAPI.model.Match;
import com.footballAPI.model.Player;
import com.footballAPI.model.Ranking;
import com.footballAPI.model.Team;
import com.footballAPI.utils.Enums;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamStatServiceImpl implements ITeamStatService{

    @Value("${url.team}")
    public String URL_TEAM;

    @Value("${url.ranking}")
    public String URL_FIFA;

    @Autowired
    ConnectionService connectionService;

    @Override
    public Team getTeam(Enums.Country country) {

        Team team = new Team();

        Document docData = connectionService.getData(URL_TEAM,country);

        Elements divTeamData = docData.select("div.col-sm.act_comp_wrapper.teamInfo");
        String name = divTeamData.select("div.teamnav_teamname").text();
        team.setName(name);

        Elements divMatches = docData.select("div.compgrp");
        Elements tablesMatches = divMatches.select("table.blocks");
        team.setMatchList(getMatches(tablesMatches));



        return team;
    }

    public List<Match> getMatches(Elements tablesMatches){
        List<Match> matchList = new ArrayList<>();
        String urlGoals;
        for (Element table: tablesMatches.select("tr")) {
            if (table.select("td.acron").text().equals("WC")) {
                Match match = new Match();
                match.setDate(table.select("span.kick_t_dt").text());
                //date biggest at 2019
                if (Integer.parseInt(match.getDate().split("\\.")[2]) > 19){
                    match.setHome(table.select("td.home_o").text());
                    match.setAway(table.select("td.away_o").text());
                    match.setResult(table.select("td.score").text());
                    urlGoals = table.select("td.score a").first().absUrl("href");
                    Document docData = connectionService.getGoals(urlGoals);
                    Elements tableGoalsHome = docData.select("table.sp-scorerlist__wrapper.spm-is-left");
                    Elements tablesGoalsAway = docData.select("table.sp-scorerlist__wrapper.spm-is-right");
                    match.setGoalsHome(getGoals(tableGoalsHome));
                    match.setGoalsAway(getGoals(tablesGoalsAway));
                    matchList.add(match);
                }

            }
        }

        return matchList;
    }

    public List<Player> getGoals(Elements tableGoals){
        List<Player> playerList = new ArrayList<>();
        for (Element row: tableGoals.select("tr.sp-scorerlist__line")) {
            Player player = new Player();
            player.setTime(row.select("td.sp-scorerlist__time").text());
            player.setName(row.select("td.sp-scorerlist__scorer").text());
            playerList.add(player);
        }
        return playerList;
    }


    @Override
    public Ranking getRanking(Enums.Ranking country) {

        Ranking ranking = new Ranking();
        Document docFifa = connectionService.getFifa(URL_FIFA,country);

        ranking.setName(country.getName());

        Elements trRank = docFifa.select("tr.fc-ranking-item_rankingTableRow__3MsQs.fc-ranking-item_activeRankingTableRow__g7Sa6 td");
        Element tdRank = trRank.get(0);
        ranking.setRankingPos(tdRank.text());

        Element tdImageDiv = trRank.get(1);
        Elements tdImage = tdImageDiv.select("img");
        ranking.setImage(tdImage.attr("src"));

        Element tdPoints = trRank.get(2);
        ranking.setRankingPoints(tdPoints.select("span").text());
        return ranking;
    }
}
