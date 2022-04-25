package com.footballAPI.service;

import com.footballAPI.model.CompareTeam;
import com.footballAPI.model.FollowingMatches;
import com.footballAPI.model.HeadToHead;
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
public class CompareServiceImpl implements ICompareService{

    @Value("${url.h2h}")
    public String URL;

    @Value("${url.ranking}")
    public String URL_FIFA;

    @Autowired
    ConnectionService connectionService;

    @Override
    public CompareTeam getCompareTeam(Enums.Team team1, Enums.Team team2) {


        CompareTeam compareTeam = new CompareTeam();

        Document doc = connectionService.getData(URL,team1,team2);
        Document docFifaHome = connectionService.getFifa(URL_FIFA,team1);
        Document docFifaAway = connectionService.getFifa(URL_FIFA,team2);

        Elements tablesH2h = doc.select("table.matchesListMain.oddEven");
        Element tableH2h = tablesH2h.get(1);
        compareTeam.setHeadToHeadList(getHeadToHead(tableH2h));

        Elements tablesFM = doc.select("table.table.tips td.leftText.leftBorder.sequencesMatches");
        Element tableFmHome = tablesFM.get(0);
        compareTeam.setFollowingMatchesListHome(getFollowingMatches(tableFmHome));
        Element tableFmAway = tablesFM.get(1);
        compareTeam.setFollowingMatchesListAway(getFollowingMatches(tableFmAway));

        Elements divsRankHome = docFifaHome.select("div.fc-ranking-statistics-item_statisticValue__15CWd");
        Element divRankHome = divsRankHome.get(0);
        compareTeam.setRankingHome(divRankHome.text());

        Elements divsRankAway = docFifaAway.select("div.fc-ranking-statistics-item_statisticValue__15CWd");
        Element divRankAway = divsRankAway.get(0);
        compareTeam.setRankingAway(divRankAway.text());

        return compareTeam;
    }

    public List<HeadToHead> getHeadToHead (Element table){
        List<HeadToHead> headToHeadList = new ArrayList<>();
        for (Element row: table.select("table.matchesListMain.oddEven tr")){

            HeadToHead headToHead = new HeadToHead();
            headToHead.setDate(row.select("td.matchDate").text());
            headToHead.setHome(row.select("td.teamNameBlock.teamHomeName").text());
            headToHead.setAway(row.select("td.teamNameBlock.teamAwayName").text());
            String[] res = row.select("td.matchResult").text().split(":");
            if (res.length == 1){
                headToHead.setHomeGoals("0");
                headToHead.setAwayGoals("0");
            } else {
                headToHead.setHomeGoals(res[0].replaceAll("\\D", ""));
                headToHead.setAwayGoals(res[1].replaceAll("\\D", ""));
            }
            if (headToHead.getAway() != "") headToHeadList.add(headToHead);
        }
        return headToHeadList;
    }

    public List<FollowingMatches> getFollowingMatches (Element table){
        List<FollowingMatches> followingMatchesList = new ArrayList<>();
        String elemClass;
        for (Element row: table.select("a span")){
            FollowingMatches followingMatches = new FollowingMatches();
            elemClass = row.attr("class");
            switch (elemClass) {
                case ("boxIcon boxIconW"):
                    followingMatches.setResult("W");
                    break;

                case ("boxIcon boxIconD"):
                    followingMatches.setResult("D");
                    break;

                case ("boxIcon boxIconL"):
                    followingMatches.setResult("L");
                    break;
            }
            followingMatchesList.add(followingMatches);
        }
        return followingMatchesList;
    }

}
