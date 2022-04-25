package com.footballAPI.controller;

import com.footballAPI.model.CompareTeam;
import com.footballAPI.service.ICompareService;
import com.footballAPI.utils.Enums;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompareController {

    @Autowired
    private ICompareService iCompareService;

    @GetMapping("/h2h")
    public CompareTeam compareTeam(@RequestParam(value = "team1") Enums.Team team1, @RequestParam(value = "team2") Enums.Team team2) {
        CompareTeam compareTeam = iCompareService.getCompareTeam(team1,team2);
        return compareTeam;
    }

}
