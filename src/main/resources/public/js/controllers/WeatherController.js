weatherApp.controller('WeatherController', ['$scope','$location','$interval','WeatherService', function($scope,$location,$interval,WeatherService) {

    var main = this;

    $scope.boards = [];
    $scope.selectedBoard = {};
    $scope.location = {};

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

    /* BOARDS */

    main.init = function() {
        main.getBoards();
    }

    $scope.callAtInterval = function() {
        console.log('Calling weather update from page');
        main.getBoards();
    }

    $interval( function(){ $scope.callAtInterval(); }, 60000);

    main.getBoards = function() {
        $scope.boards = null;
        WeatherService.getBoards()
            .then(
                function(result) {          
                    $scope.boards = result.data.data;
                    console.log('get Boards ok');
                }, 
                function(error) {
                    console.log('Error getting the boards');
                }
            );
    }

    main.deleteBoard = function (id){
        WeatherService.deleteBoard(id)
            .then(
                function(result) {          
                    if(result.data.result === 0) {
                        for (var i = 0; i < $scope.boards.length; i++) {
                            if($scope.boards[i].id==id)
                            {
                                $scope.boards.splice(i, 1);
                            }
                        }
                    }
                    console.log('get Boards ok');
                }, 
                function(error) {
                    console.log('Error getting the boards');
                }
            );

    }

    main.addNewBoard = function() {
        WeatherService.setMode('add'); 
        var boardDto = {
            id: '',
            description: '',
            locations : []
        };
        WeatherService.setBoardDto(boardDto);            
        $location.path("/boards/new");
    }

    $scope.checkBoardDetail = function(board){
        WeatherService.setSelectedBoard(board);
    }

    

    /* BOARD */
    $scope.checkLocationForecast = function(location){
        WeatherService.setSelectedLocation(location);
    }
    
    main.deleteLocationFromBoard = function(board, woeid) {
        
        WeatherService.deleteLocationFromBoard(board.id, woeid)
        .then(
            function(result) {                              
                console.log('Delete location ok');
                for (var i = 0; i < board.locations.length; i++) {
                    if(board.locations[i].woeid==woeid)
                    {
                        board.locations.splice(i, 1);
                    }
                }
            }, 
            function(error) {
                console.log('Error deleting the location');
            }
        );
    }

    main.editBoard = function(board) {
        WeatherService.setMode('edit');    
        var locs = [];
        for (var i = 0; i < board.locations.length; i++) {
            var loc = board.locations[i].city+', '+board.locations[i].country+' ('+board.locations[i].woeid+')';                
            locs.push(loc);
        }
        var boardDto = {
            id: board.id,
            description: board.description,
            locations: locs
        };
        WeatherService.setBoardDto(boardDto);        
        $location.path("/boards/new");
    }

    /* END BOARD*/

    /* LOCATION */

    main.getWeatherLogo = function(code){
        return weatherLogoMap[code];
    }

    /* END LOCATION*/


    main.init();
}]);