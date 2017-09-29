package com.weather.challenge.util;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ConditionHelper {

    private Map<Integer, String> condition = new HashMap<Integer, String>();

    public Map<Integer, String> getCondition() {
        return condition;
    }

    public ConditionHelper() {
        condition.put(0, "tornado");
        condition.put(1, "tropical storm");
        condition.put(2, "hurricane");
        condition.put(3, "severe thunderstorms");
        condition.put(4, "thunderstorms");
        condition.put(5, "mixed rain and snow");
        condition.put(6, "mixed rain and sleet");
        condition.put(7, "mixed snow and sleet");
        condition.put(8, "freezing drizzle");
        condition.put(9, "drizzle");
        condition.put(10, "freezing rain");
        condition.put(11, "showers");
        condition.put(12, "showers");
        condition.put(13, "snow flurries");
        condition.put(14, "light snow showers");
        condition.put(15, "blowing snow");
        condition.put(16, "snow");
        condition.put(17, "hail");
        condition.put(18, "sleet");
        condition.put(19, "dust");
        condition.put(20, "foggy");
        condition.put(21, "haze");
        condition.put(22, "smoky");
        condition.put(23, "blustery");
        condition.put(24, "windy");
        condition.put(25, "cold");
        condition.put(26, "cloudy");
        condition.put(27, "mostly cloudy(night)");
        condition.put(28, "mostly cloudy(day)");
        condition.put(29, "partly cloudy(night)");
        condition.put(30, "partly cloudy(day)");
        condition.put(31, "clear(night)");
        condition.put(32, "sunny");
        condition.put(33, "fair(night)");
        condition.put(34, "fair(day)");
        condition.put(35, "mixed rain and hail");
        condition.put(36, "hot");
        condition.put(37, "isolated thunderstorms");
        condition.put(38, "scattered thunderstorms");
        condition.put(39, "scattered thunderstorms");
        condition.put(40, "scattered showers");
        condition.put(41, "heavy snow");
        condition.put(42, "scattered snow showers");
        condition.put(43, "heavy snow");
        condition.put(44, "partly cloudy");
        condition.put(45, "thundershowers");
        condition.put(46, "snow showers");
        condition.put(47, "isolated thundershowers");
    }


}
