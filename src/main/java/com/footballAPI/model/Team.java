package com.footballAPI.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Match> matchList = new ArrayList<>();
    private String image;
    private String rankingPos;
    private String rankingPoints;

    public Team() {
    }

    public Team(String name, List<Match> matchList, String image, String rankingPos, String rankingPoints) {
        this.name = name;
        this.matchList = matchList;
        this.image = image;
        this.rankingPos = rankingPos;
        this.rankingPoints = rankingPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Match> getMatchList() {
        return matchList;
    }

    public void setMatchList(List<Match> matchList) {
        this.matchList = matchList;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRankingPos() {
        return rankingPos;
    }

    public void setRankingPos(String rankingPos) {
        this.rankingPos = rankingPos;
    }

    public String getRankingPoints() {
        return rankingPoints;
    }

    public void setRankingPoints(String rankingPoints) {
        this.rankingPoints = rankingPoints;
    }
}
