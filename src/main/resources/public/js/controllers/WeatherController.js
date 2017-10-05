weatherApp.controller('WeatherController', ['$scope', '$http', '$timeout', '$location', '$route', '$routeParams', function($scope, $http, $timeout, $location, $route, $routeParams) {

    $http.defaults.headers.post["Content-Type"] = "application/json";

    var main = this;
    
    $scope.contentUrl = $route.current.$$route.contentUrl;
    $scope.tab_content = false;
    $scope.resourceId = $routeParams.param; 
    $scope.locations = [];   
    $scope.selectedLocation = {};

    main.newBoardInfo = {};
    main.selectedBoard = {};

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
    
    main.init = function(resource) {
    	switch(resource) {
            case 'landing':
                $scope.tab_content = true;
                break;            
            case 'logout':
                $scope.tab_content = true;                
                break;                
            case 'boards':
            	main.getBoards();              
                break;
            case 'new_board':                
                $scope.tab_content = true;
                break;
            case 'update_board':
                main.newBoardInfo.description = main.selectedBoard.description;
                main.newBoardInfo.locations = main.selectedBoard.locations;
                $scope.tab_content = true;
                break;                    
        }       
    }

    main.getBoards = function() {
        $scope.boards = [];
    	$http.get('/api/'+ localStorage.getItem('userId') +'/boards/').success(function(result) {    		
            $scope.boards = result.data;
            $scope.tab_content = true;            
        }).error(function (data, status) {        	
            $scope.boards = [];
            $scope.tab_content = false;
        });
    }

    main.getWeatherLogo = function(code){
        return weatherLogoMap[code];
    }

    main.deleteBoard = function (id){
        $http.delete('api/'+ localStorage.getItem('userId') +'/boards/'+id).success(function(response) {
            if(response.result === 0) {
                main.init('boards');      
            }
        }).error(function (response, status) {
            console.log('Error in delete board');
        });

    }

    main.postBoard = function() {
        var boardData = {
            "description": main.newBoardInfo.description,            
            "woeids" : parseListWoeids($scope.locations),
        }
        $http.post('api/'+ localStorage.getItem('userId') +'/boards', boardData).success(function(response) {
            if(response.result === 0) {
            	console.log('post board ok');
     			$location.path("/boards");           
            }
            else {
                console.log('post board nok');
            }
        }).error(function (response, status) {
            console.log('error in post board');
        });
    }

    var parseListWoeids = function(listLocations){    
        var listWoeids = [];
        var regExp = /\(([^)]+)\)/;
        angular.forEach(listLocations, function(value, key) {
            var matches = regExp.exec(value);            
            if (matches) {
                var submatch = matches[1];
                listWoeids.push(submatch);
            }
        }, listWoeids);
        return listWoeids;
    }

    main.addNewBoard = function() {    	    	
    	$location.path("/boards/newboard");
    }

    main.editBoard = function(board) {             
        $location.path("/boards/newboard");
    }

    main.logout = function() {            
        main.loggedIn = false;
        $location.path("/");   
    }
    
    $scope.getLocation = function(val) {
        var uri = "https://query.yahooapis.com/v1/public/yql?q=select * from geo.places where text='*"+val+"*'&format=json";
        var encodedUri = encodeURI(uri);         
        return $http.get(encodedUri).then(function(response){
            return response.data.query.results.place.map(function(item){
                if(item !== null && item !== undefined && item.locality1 !== null && item.locality1 !== undefined && item.country !== null && item.country !== undefined){                    
                    var locationItem = item.locality1.content+', '+item.country.content+' ('+ item.woeid +')';
                    return locationItem;
                }                
                
            });     
        });
    };

    main.addLocationIfNotPresent = function(selectedLocation) {
        if(!contains.call($scope.locations, selectedLocation)){
            $scope.locations.push(selectedLocation);
        }
    }

    main.deleteLocationFromBoard = function(boardId, woeid) {        
        $http.delete('api/'+ localStorage.getItem('userId') +'/boards/'+boardId+'/'+woeid).success(function(response) {
            if(response.result === 0) {
                main.init('boards');      
            }
        }).error(function (response, status) {
            console.log('Error in delete board');
        });
    }

    main.init($route.current.$$route.resource);

    var contains = function(needle) {
        var findNaN = needle !== needle;
        var indexOf;
        if(!findNaN && typeof Array.prototype.indexOf === 'function') {
            indexOf = Array.prototype.indexOf;
        } else {
            indexOf = function(needle) {
                var i = -1, index = -1;

                for(i = 0; i < this.length; i++) {
                    var item = this[i];

                    if((findNaN && item !== item) || item === needle) {
                        index = i;
                        break;
                    }
                }

                return index;
            };
        }
        return indexOf.call(this, needle) > -1;
    };

}]);