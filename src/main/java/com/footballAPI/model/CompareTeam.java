package com.footballAPI.model;

import java.util.ArrayList;
import java.util.List;

public class CompareTeam {
    private List<HeadToHead> headToHeadList = new ArrayList<>();
    private List<FollowingMatches> followingMatchesListHome = new ArrayList<>();
    private List<FollowingMatches> followingMatchesListAway = new ArrayList<>();
    private String rankingHome;
    private String rankingAway;

    public CompareTeam() {
    }

    public CompareTeam(List<HeadToHead> headToHeadList, List<FollowingMatches> followingMatchesListHome, List<FollowingMatches> followingMatchesListAway, String rankingHome, String rankingAway) {
        this.headToHeadList = headToHeadList;
        this.followingMatchesListHome = followingMatchesListHome;
        this.followingMatchesListAway = followingMatchesListAway;
        this.rankingHome = rankingHome;
        this.rankingAway = rankingAway;
    }

    public List<HeadToHead> getHeadToHeadList() {
        return headToHeadList;
    }

    public void setHeadToHeadList(List<HeadToHead> headToHeadList) {
        this.headToHeadList = headToHeadList;
    }

    public List<FollowingMatches> getFollowingMatchesListHome() {
        return followingMatchesListHome;
    }

    public void setFollowingMatchesListHome(List<FollowingMatches> followingMatchesListHome) {
        this.followingMatchesListHome = followingMatchesListHome;
    }

    public List<FollowingMatches> getFollowingMatchesListAway() {
        return followingMatchesListAway;
    }

    public void setFollowingMatchesListAway(List<FollowingMatches> followingMatchesListAway) {
        this.followingMatchesListAway = followingMatchesListAway;
    }

    public String getRankingHome() {
        return rankingHome;
    }

    public void setRankingHome(String rankingHome) {
        this.rankingHome = rankingHome;
    }

    public String getRankingAway() {
        return rankingAway;
    }

    public void setRankingAway(String rankingAway) {
        this.rankingAway = rankingAway;
    }
}
