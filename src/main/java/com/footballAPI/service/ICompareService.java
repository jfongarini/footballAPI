package com.footballAPI.service;

import com.footballAPI.model.CompareTeam;
import com.footballAPI.utils.Enums;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICompareService {
    public CompareTeam getCompareTeam(Enums.Team team1, Enums.Team team2);
}
