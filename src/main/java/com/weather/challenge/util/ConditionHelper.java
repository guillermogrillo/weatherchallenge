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
    
    public String getSrcImageByCode(Integer code){
    	return condition.get(code);
    }

    public ConditionHelper() {
        condition.put(0, "wi wi-tornado");
        condition.put(1, "wi wi-hurricane");
        condition.put(2, "wi wi-hurricane");
        condition.put(3, "wi wi-thunderstorm");
        condition.put(4, "wi wi-thunderstorm");
        condition.put(5, "wi wi-day-snow");
        condition.put(6, "wi wi-night-sleet-storm");
        condition.put(7, "wi wi-night-sleet-storm");
        condition.put(8, "wi wi-snowflake-cold");
        condition.put(9, "wi wi-snowflake-cold");
        condition.put(10, "wi wi-rain-mix");
        condition.put(11, "wi wi-showers");
        condition.put(12, "wi wi-showers");
        condition.put(13, "wi wi-snow");
        condition.put(14, "wi wi-snow");
        condition.put(15, "wi wi-snow");
        condition.put(16, "wi wi-snow");
        condition.put(17, "wi wi-hail");
        condition.put(18, "wi wi-sleet");
        condition.put(19, "wi wi-dust");
        condition.put(20, "wi wi-day-fog");
        condition.put(21, "wi wi-day-haze");
        condition.put(22, "wi wi-smoke");
        condition.put(23, "wi wi-windy");
        condition.put(24, "wi wi-windy");
        condition.put(25, "wi wi-snowflake-cold");
        condition.put(26, "wi wi-cloud");
        condition.put(27, "wi wi-night-cloudy");
        condition.put(28, "wi wi-day-cloudy");
        condition.put(29, "wi wi-night-cloudy");
        condition.put(30, "wi wi-day-cloudy");
        condition.put(31, "wi wi-night-clear");
        condition.put(32, "wi wi-day-sunny");
        condition.put(33, "wi wi-night-clear");
        condition.put(34, "wi wi-day-sunny");
        condition.put(35, "wi wi-day-rain-mix");
        condition.put(36, "wi wi-hot");
        condition.put(37, "wi wi-thunderstorm");
        condition.put(38, "wi wi-thunderstorm");
        condition.put(39, "wi wi-thunderstorm");
        condition.put(40, "wi wi-showers");
        condition.put(41, "wi wi-snow");
        condition.put(42, "wi wi-snow");
        condition.put(43, "wi wi-snow");
        condition.put(44, "wi wi-cloud");
        condition.put(45, "wi wi-storm-showers");
        condition.put(46, "wi wi-snow");
        condition.put(47, "wi wi-storm-showers");
    }


}
