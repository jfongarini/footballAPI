package com.footballAPI.controller;

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

    @GetMapping("/ts")
    public Team team(@RequestParam(value = "country") Enums.Country country){
        Team team = iTeamStatService.getTeam(country);
        return team;
    }
}
