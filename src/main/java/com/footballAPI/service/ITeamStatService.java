package com.footballAPI.service;

import com.footballAPI.model.Ranking;
import com.footballAPI.model.Team;
import com.footballAPI.utils.Enums;

public interface ITeamStatService {
    public Team getTeam(Enums.Country team);
    public Ranking getRanking(Enums.Ranking team);
}
