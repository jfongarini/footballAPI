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

        //Elements divTeamData = docData.select("div.heading__title");
        String name = docData.select("h1[class*=ClubhouseHeader__Name]").text().trim().replaceAll("\\s+","");
        team.setName(name);

        Elements divMatches = docData.select("div.ResponsiveTable.Table__results");
        Elements tablesMatches = divMatches.select("table.Table");
        team.setMatchList(getMatches(tablesMatches));



        return team;
    }

    public List<Match> getMatches(Elements tablesMatches){
        List<Match> matchList = new ArrayList<>();
        String urlGoals;
        for (Element table: tablesMatches.select("tr.Table__TR.Table__TR--sm.Table__even")) {
            Match match = new Match();
            match.setDate(table.select("div.matchTeams").text());
            match.setHome(table.select("div[class*=local] a").text().replaceAll("\\s+",""));
            match.setAway(table.select("div[class*=away] a").text().replaceAll("\\s+",""));
            String result = table.select("span[class*=Table__Team] a").get(1).text();
            String[] resSplit = result.split("-");
            match.setResultHome(resSplit[0].trim());
            match.setResultAway(resSplit[1].trim());
            urlGoals = table.select("span[class*=Table__Team] a").get(1).absUrl("href");
            Document docData = connectionService.getGoals(urlGoals);
            Elements tableGoalsHomePrev = docData.select("div.team.away");
            Elements tableGoalsHome = tableGoalsHomePrev.select("ul[class*=goal]");
            Elements tablesGoalsAwayPrev = docData.select("div.team.home");
            Elements tablesGoalsAway = tablesGoalsAwayPrev.select("ul[class*=goal]");
            match.setGoalsHome(getGoals(tableGoalsHome));
            match.setGoalsAway(getGoals(tablesGoalsAway));
            matchList.add(match);


        }

        return matchList;
    }

    public List<Player> getGoals(Elements tableGoals){
        List<Player> playerList = new ArrayList<>();
        for (Element row: tableGoals.select("li")) {
            String playerStr = row.select("li").text()
                    .replaceAll("\\)","")
                    .replaceAll("'","")
                    .replaceAll("PEN","");
            String[] playerSplit = playerStr.split("\\(");
            String[] timeSplit = playerSplit[1].split(",");
            for (String time: timeSplit){
                Player player = new Player();
                player.setName(playerSplit[0].trim());
                player.setTime(time.trim());
                playerList.add(player);
            }
        }
        return playerList;
    }


    @Override
    public Ranking getRanking(Enums.Ranking country) {

        Ranking ranking = new Ranking();
        Document docFifa = connectionService.getFifa(URL_FIFA,country);

        ranking.setName(country.getName().replaceAll("\\s+",""));

        Elements trRank = docFifa.select("tr[class*=fc-ranking-item_activeRankingTableRow] td");
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
