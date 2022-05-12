package com.footballAPI.service;

import com.footballAPI.utils.Enums;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@Service
public class ConnectionService {

    public Document getData(String URL, Enums.Country country){

        Document doc = null;
        try {
            String params = country.getRegion()+"/teams/"+country.getName()+country.getCode()+"/results/";
            doc = Jsoup.connect(URL+params).get();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return doc;
    }

    public Document getFifa(String URL, Enums.Ranking country){

        Document doc = null;
        try {
            doc = Jsoup.connect(URL+country.name()).get();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return doc;
    }

    public Document getGoals(String URL){
        Document doc = null;
        try {
            doc = Jsoup.connect(URL).get();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return doc;
    }


}