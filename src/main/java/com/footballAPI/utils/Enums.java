package com.footballAPI.utils;

public class Enums {
    public enum Country {

        ARG("argentina","conmebol","-MjYyMzk="),
        AUS("australia","asia-afc","-MjU5NTU="),
        BEL("belgium","uefa","-Mjc0ODI="),
        BRA("brazil","conmebol","-MjYyNDk="),
        CMR("cameroon","africa-caf","-MTAxNDk="),
        CAN("canada","concacaf","-NDk2MQ="),
        CRC("costa-rica","concacaf","-MjA0MTI="),
        CRO("croatia","uefa","-Mjc1MTI="),
        DEN("denmark","uefa","-Mjc1MTY="),
        ECU("ecuador","conmebol","-MjAzMzQ="),
        ENG("england","uefa","-Mjc1MDc="),
        FRA("france","uefa","-Mjc0ODU="),
        GER("germany","uefa","-Mjc1MDM="),
        GHA("ghana","africa-caf","-MTAxMjA="),
        IRN("iran","asia-afc","-MjYyNDM="),
        JPN("japan","asia-afc","-MjYyNTE="),
        MEX("mexico","concacaf","MjMyNTU="),
        MAR("morocco","africa-caf","-MjAzNTI="),
        NED("netherlands","uefa","-Mjc1MjQ="),
        NZL("new-zealand","oceania","-Mjc3MjQ="),
        PER("peru","conmebol","-MjAzMzY="),
        POL("poland","uefa","-Mjc0Nzg="),
        POR("portugal","uefa","-Mjc0Nzc="),
        QAT("qatar","asia-afc","-MjAzOTA="),
        KSA("saudi-arabia","asia-afc","-MjYyNTY="),
        SCO("scotland","uefa","-Mjc0ODc="),
        SEN("senegal","africa-caf","-MjAzNTU="),
        SRB("serbia","uefa","-MjgzNDQ="),
        KOR("south-korea","asia-afc","-Mjc3Mjc="),
        ESP("spain","uefa","-Mjc1MTc="),
        SUI("switzerland","uefa","-Mjg2Nw="),
        TUN("tunisia","africa-caf","-MjAzNjA="),
        UKR("ukraine","uefa","-Mjc0ODg="),
        UAE("united-arab-emirates","asia-afc","-MjAzOTg="),
        USA("usa","concacaf","-MjcwNDk="),
        URU("uruguay","conmebol","-MjAzMzc="),
        WAL("wales","uefa","-Mjc1MDE=");

        private String name;
        private String region;
        private String code;


        Country(String name, String region, String code){
            this.name = name;
            this.region = region;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public String getRegion() {
            return region;
        }
    }
}
