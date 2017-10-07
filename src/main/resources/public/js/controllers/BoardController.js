weatherApp.controller('BoardController', ['$scope', '$location','WeatherService', function($scope, $location, WeatherService) {

    var boardCtrl = this;

    $scope.board = WeatherService.getSelectedBoard();
    $scope.location = null;
    var showLocation = false;

    var weatherLogoMap = {
        0 : "wi wi-tornado",
        1 : "wi wi-hurricane",
        2 : "wi wi-hurricane",
        3 : "wi wi-thunderstorm",
        4 : "wi wi-thunderstorm",
        5 : "wi wi-day-snow",
        6 : "wi wi-night-sleet-storm",
        7 : "wi wi-night-sleet-storm",
        8 : "wi wi-snowflake-cold",
        9 : "wi wi-snowflake-cold",
        10 : "wi wi-rain-mix",
        11 : "wi wi-showers",
        12 : "wi wi-showers",
        13 : "wi wi-snow",
        14 : "wi wi-snow",
        15 : "wi wi-snow",
        16 : "wi wi-snow",
        17 : "wi wi-hail",
        18 : "wi wi-sleet",
        19 : "wi wi-dust",
        20 : "wi wi-day-fog",
        21 : "wi wi-day-haze",
        22 : "wi wi-smoke",
        23 : "wi wi-windy",
        24 : "wi wi-windy",
        25 : "wi wi-snowflake-cold",
        26 : "wi wi-cloud",
        27 : "wi wi-night-cloudy",
        28 : "wi wi-day-cloudy",
        29 : "wi wi-night-cloudy",
        30 : "wi wi-day-cloudy",
        31 : "wi wi-night-clear",
        32 : "wi wi-day-sunny",
        33 : "wi wi-night-clear",
        34 : "wi wi-day-sunny",
        35 : "wi wi-day-rain-mix",
        36 : "wi wi-hot",
        37 : "wi wi-thunderstorm",
        38 : "wi wi-thunderstorm",
        39 : "wi wi-thunderstorm",
        40 : "wi wi-showers",
        41 : "wi wi-snow",
        42 : "wi wi-snow",
        43 : "wi wi-snow",
        44 : "wi wi-cloud",
        45 : "wi wi-storm-showers",
        46 : "wi wi-snow",
        47 : "wi wi-storm-showers"
    }

    boardCtrl.getWeatherLogo = function(code){
        return weatherLogoMap[code];
    }

    $scope.checkLocationForecast = function(l){        
        $scope.location = l;
        showLocation = !showLocation;    
        console.log('showLocation now is '+showLocation);            
    }

}]);
