package com.footballAPI.service;

import com.footballAPI.utils.Enums;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;


@Service
public class ConnectionService {

    public Document getData(String URL, Enums.Team t1, Enums.Team t2){

        Document doc = null;
        try {
            String params = t1.getName()+","+t2.getName()+","+t1.getCode()+","+t2.getCode()+".php";
            doc = Jsoup.connect(URL+params).get();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return doc;
    }

    public Document getFifa(String URL, Enums.Team team){

        Document doc = null;
        try {
            doc = Jsoup.connect(URL+team.name()).get();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return doc;
    }


}