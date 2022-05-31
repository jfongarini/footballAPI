package com.footballAPI.utils;

public class Enums {
    public enum Country {

        ARG("argentina","202","FIFA.WORLDQ.CONMEBOL"),
        AUS("australia","628","FIFA.WORLDQ.AFC"),
        BEL("belgium","459","FIFA.WORLDQ.UEFA"),
        BRA("brazil","205","FIFA.WORLDQ.CONMEBOL"),
        CMR("cameroon","656","FIFA.WORLDQ.CAF"),
        CAN("canada","206","FIFA.WORLDQ.CONCACAF"),
        CRC("costa-rica","214","FIFA.WORLDQ.CONCACAF"),
        CRO("croatia","477","FIFA.WORLDQ.UEFA"),
        DEN("denmark","479","FIFA.WORLDQ.UEFA"),
        ECU("ecuador","209","FIFA.WORLDQ.CONMEBOL"),
        ENG("england","448","FIFA.WORLDQ.UEFA"),
        FRA("france","478","FIFA.WORLDQ.UEFA"),
        GER("germany","481","FIFA.WORLDQ.UEFA"),
        GHA("ghana","4469","FIFA.WORLDQ.CAF"),
        IRN("iran","469","FIFA.WORLDQ.AFC"),
        JPN("japan","627","FIFA.WORLDQ.AFC"),
        MEX("mexico","203","FIFA.WORLDQ.CONCACAF"),
        MAR("morocco","2869","FIFA.WORLDQ.CAF"),
        NED("netherlands","449","FIFA.WORLDQ.UEFA"),
        NZL("new-zealand","2666","FIFA.WORLDQ.OFC"),
        PER("peru","211","FIFA.WORLDQ.CONMEBOL"),
        POL("poland","471","FIFA.WORLDQ.UEFA"),
        POR("portugal","482","FIFA.WORLDQ.UEFA"),
        QAT("qatar","4398","FIFA.WORLDQ.AFC"),
        KSA("saudi-arabia","655","FIFA.WORLDQ.AFC"),
        SCO("scotland","580","FIFA.WORLDQ.UEFA"),
        SEN("senegal","654","FIFA.WORLDQ.CAF"),
        SRB("serbia","6757","FIFA.WORLDQ.UEFA"),
        KOR("south-korea","451","FIFA.WORLDQ.AFC"),
        ESP("spain","164","FIFA.WORLDQ.UEFA"),
        SUI("switzerland","475","FIFA.WORLDQ.UEFA"),
        TUN("tunisia","659","FIFA.WORLDQ.CAF"),
        UKR("ukraine","457","FIFA.WORLDQ.UEFA"),
        UAE("united-arab-emirates","4397","FIFA.WORLDQ.AFC"),
        USA("united-states","660","FIFA.WORLDQ.CONCACAF"),
        URU("uruguay","212","FIFA.WORLDQ.CONMEBOL"),
        WAL("wales","578","FIFA.WORLDQ.UEFA");

        private String name;
        private String code;
        private String region;


        Country(String name, String code, String region) {
            this.name = name;
            this.code = code;
            this.region = region;
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

    public enum Ranking {
        AFG("Afghanistan"),
        ALB("Albania"),
        ALG("Algeria"),
        ASA("American Samoa"),
        AND("Andorra"),
        ANG("Angola"),
        AIA("Anguilla"),
        ATG("Antigua and Barbuda"),
        ARG("Argentina"),
        ARM("Armenia"),
        ARU("Aruba"),
        AUS("Australia"),
        AUT("Austria"),
        AZE("Azerbaijan"),
        BAH("Bahamas"),
        BHR("Bahrain"),
        BAN("Bangladesh"),
        BRB("Barbados"),
        BLR("Belarus"),
        BEL("Belgium"),
        BLZ("Belize"),
        BEN("Benin"),
        BER("Bermuda"),
        BHU("Bhutan"),
        BOL("Bolivia"),
        BIH("Bosnia and Herzegovina"),
        BOT("Botswana"),
        BRA("Brazil"),
        VGB("British Virgin Islands"),
        BRU("Brunei Darussalam"),
        BUL("Bulgaria"),
        BFA("Burkina Faso"),
        BDI("Burundi"),
        CPV("Cabo Verde"),
        CAM("Cambodia"),
        CMR("Cameroon"),
        CAN("Canada"),
        CAY("Cayman Islands"),
        CTA("Central African Republic"),
        CHA("Chad"),
        CHI("Chile"),
        CHN("China PR"),
        TPE("Chinese Taipei"),
        COL("Colombia"),
        COM("Comoros"),
        CGO("Congo"),
        COD("Congo DR"),
        COK("Cook Islands"),
        CRC("Costa Rica"),
        CIV("Côte d'Ivoire"),
        CRO("Croatia"),
        CUB("Cuba"),
        CUW("Curaçao"),
        CYP("Cyprus"),
        CZE("Czech Republic"),
        DEN("Denmark"),
        DJI("Djibouti"),
        DMA("Dominica"),
        DOM("Dominican Republic"),
        ECU("Ecuador"),
        EGY("Egypt"),
        SLV("El Salvador"),
        ENG("England"),
        EQG("Equatorial Guinea"),
        ERI("Eritrea"),
        EST("Estonia"),
        SWZ("Eswatini"),
        ETH("Ethiopia"),
        FRO("Faroe Islands"),
        FIJ("Fiji"),
        FIN("Finland"),
        FRA("France"),
        GAB("Gabon"),
        GAM("Gambia"),
        GEO("Georgia"),
        GER("Germany"),
        GHA("Ghana"),
        GIB("Gibraltar"),
        GRE("Greece"),
        GRN("Grenada"),
        GUM("Guam"),
        GUA("Guatemala"),
        GUI("Guinea"),
        GNB("Guinea-Bissau"),
        GUY("Guyana"),
        HAI("Haiti"),
        HON("Honduras"),
        HKG("Hong Kong"),
        HUN("Hungary"),
        ISL("Iceland"),
        IND("India"),
        IDN("Indonesia"),
        IRN("IR Iran"),
        IRQ("Iraq"),
        ISR("Israel"),
        ITA("Italy"),
        JAM("Jamaica"),
        JPN("Japan"),
        JOR("Jordan"),
        KAZ("Kazakhstan"),
        KEN("Kenya"),
        PRK("Korea DPR"),
        KOR("Korea Republic"),
        KOS("Kosovo"),
        KUW("Kuwait"),
        KGZ("Kyrgyz Republic"),
        LAO("Laos"),
        LVA("Latvia"),
        LBN("Lebanon"),
        LES("Lesotho"),
        LBR("Liberia"),
        LBY("Libya"),
        LIE("Liechtenstein"),
        LTU("Lithuania"),
        LUX("Luxembourg"),
        MAC("Macau"),
        MAD("Madagascar"),
        MWI("Malawi"),
        MAS("Malaysia"),
        MDV("Maldives"),
        MLI("Mali"),
        MLT("Malta"),
        MTN("Mauritania"),
        MRI("Mauritius"),
        MEX("Mexico"),
        MDA("Moldova"),
        MNG("Mongolia"),
        MNE("Montenegro"),
        MSR("Montserrat"),
        MAR("Morocco"),
        MOZ("Mozambique"),
        MYA("Myanmar"),
        NAM("Namibia"),
        NEP("Nepal"),
        NED("Netherlands"),
        NCL("New Caledonia"),
        NZL("New Zealand"),
        NCA("Nicaragua"),
        NIG("Niger"),
        NGA("Nigeria"),
        MKD("North Macedonia"),
        NIR("Northern Ireland"),
        NOR("Norway"),
        OMA("Oman"),
        PAK("Pakistan"),
        PLE("Palestine"),
        PAN("Panama"),
        PNG("Papua New Guinea"),
        PAR("Paraguay"),
        PER("Peru"),
        PHI("Philippines"),
        POL("Poland"),
        POR("Portugal"),
        PUR("Puerto Rico"),
        QAT("Qatar"),
        IRL("Republic of Ireland"),
        ROU("Romania"),
        RUS("Russia"),
        RWA("Rwanda"),
        SAM("Samoa"),
        SMR("San Marino"),
        STP("São Tomé and Príncipe"),
        KSA("Saudi Arabia"),
        SCO("Scotland"),
        SEN("Senegal"),
        SRB("Serbia"),
        SEY("Seychelles"),
        SLE("Sierra Leone"),
        SGP("Singapore"),
        SVK("Slovakia"),
        SVN("Slovenia"),
        SOL("Solomon Islands"),
        SOM("Somalia"),
        RSA("South Africa"),
        SSD("South Sudan"),
        ESP("Spain"),
        SRI("Sri Lanka"),
        SKN("St. Kitts and Nevis"),
        LCA("St. Lucia"),
        VIN("St. Vincent and the Grenadines"),
        SDN("Sudan"),
        SUR("Suriname"),
        SWE("Sweden"),
        SUI("Switzerland"),
        SYR("Syria"),
        TAH("Tahiti"),
        TJK("Tajikistan"),
        TAN("Tanzania"),
        THA("Thailand"),
        TLS("Timor-Leste"),
        TOG("Togo"),
        TGA("Tonga"),
        TRI("Trinidad and Tobago"),
        TUN("Tunisia"),
        TUR("Turkey"),
        TKM("Turkmenistan"),
        TCA("Turks and Caicos Islands"),
        UGA("Uganda"),
        UKR("Ukraine"),
        UAE("United Arab Emirates"),
        URU("Uruguay"),
        VIR("US Virgin Islands"),
        USA("USA"),
        UZB("Uzbekistan"),
        VAN("Vanuatu"),
        VEN("Venezuela"),
        VIE("Vietnam"),
        WAL("Wales"),
        YEM("Yemen"),
        ZAM("Zambia"),
        ZIM("Zimbabwe");

        private String name;

        Ranking(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
