package com.weather.challenge.dto.external;

public class Place {

    private String name;
    private String countryShortName;
    private String code;

    public Place(String name, String countryShortName, String code) {
        this.name = name;
        this.countryShortName = countryShortName;
        this.code = code;
    }

    public Place() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryShortName() {
        return countryShortName;
    }

    public void setCountryShortName(String countryShortName) {
        this.countryShortName = countryShortName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
