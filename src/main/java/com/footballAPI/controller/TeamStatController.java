package com.footballAPI.controller;

import com.footballAPI.model.Ranking;
import com.footballAPI.model.Team;
import com.footballAPI.service.ITeamStatService;
import com.footballAPI.utils.Enums;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamStatController {

    @Autowired
    ITeamStatService iTeamStatService;

    @GetMapping("/team")
    public Team team(@RequestParam(value = "id") Enums.Country country){
        Team team = iTeamStatService.getTeam(country);
        return team;
    }

    @GetMapping("/rank")
    public Ranking ranking(@RequestParam(value = "id") Enums.Ranking ranking){
        Ranking team = iTeamStatService.getRanking(ranking);
        return team;
    }
}
