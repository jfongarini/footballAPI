package com.footballAPI.utils;

public class Enums {
    public enum Team {

        ARG("argentina","926"),
        AUS("australia","935"),
        BEL("belgium","978"),
        BRA("brazil","946"),
        CMR("cameroon","940"),
        CAN("canada","2070"),
        CRC("costa-rica","2071"),
        CRO("croatia","999"),
        DEN("denmark","941"),
        ECU("ecuador","1990"),
        ENG("england","930"),
        FRA("france","925"),
        GER("germany","934"),
        GHA("ghana","936"),
        IRN("iran","2096"),
        JPN("japan","939"),
        MEX("mexico","923"),
        MAR("morocco","2032"),
        NED("netherlands","938"),
        NZL("new-zealand","943"),
        PER("peru","1994"),
        POL("poland","1943"),
        POR("portugal","949"),
        QAT("qatar","2100"),
        KSA("saudi-arabia","2086"),
        SCO("scotland","1013"),
        SEN("senegal","2040"),
        SRB("serbia","937"),
        KOR("south-korea","927"),
        ESP("spain","950"),
        SUI("switzerland","953"),
        TUN("tunisia","2048"),
        UKR("ukraine","1944"),
        UAE("united-arab-emirates","2123"),
        USA("united-states","931"),
        URU("uruguay","924"),
        WAL("wales","1006");

        private String name;
        private String code;

        Team(String name, String code){
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }
    }
}
