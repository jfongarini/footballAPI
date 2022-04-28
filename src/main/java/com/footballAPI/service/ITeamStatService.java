package com.footballAPI.service;

import com.footballAPI.model.Team;
import com.footballAPI.utils.Enums;

public interface ITeamStatService {
    public Team getTeam(Enums.Country team);
}
