package com.footballAPI.model;

public class HeadToHead {
    private String date;
    private String home;
    private String homeGoals;
    private String away;
    private String awayGoals;

    public HeadToHead() {
    }

    public HeadToHead(String date, String home, String homeGoals, String away, String awayGoals) {
        this.date = date;
        this.home = home;
        this.homeGoals = homeGoals;
        this.away = away;
        this.awayGoals = awayGoals;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getDate(){
        return this.date;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(String homeGoals) {
        this.homeGoals = homeGoals;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public String getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(String awayGoals) {
        this.awayGoals = awayGoals;
    }
}
