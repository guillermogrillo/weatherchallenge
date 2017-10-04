weatherApp.controller('WeatherController', ['$scope', '$http', '$timeout', '$location', '$route', '$routeParams', function($scope, $http, $timeout, $location, $route, $routeParams) {

    $http.defaults.headers.post["Content-Type"] = "application/json";

    var main = this;
    
    $scope.contentUrl = $route.current.$$route.contentUrl;
    $scope.tab_content = false;
    $scope.resourceId = $routeParams.param;

    var loggedIn = false;
    main.user = {};
    main.invalidInput = false;
    
    main.init = function(resource) {
    	switch(resource) {
            case 'landing':
                $scope.tab_content = true;
                break;
            case 'login':
                $scope.tab_content = true;
                break;
            case 'logout':
                $scope.tab_content = true;
                $location.path("/landing");
                break;    
            case 'register':
                $scope.tab_content = true;
                break;
            case 'boards':
            	main.getBoards();              
                break;
            case 'new_board':
                $scope.locations=[{"woeid":"2347008", "name":"Bari", "countryShortName":"SOM", "code":"SO03"},{"woeid":"7153299", "name":"Hainaut", "countryShortName":"BEL", "code":""}];
                $scope.tab_content = true;
                break;                
        }       
    }

    main.login = function() {
        $location.path("/login");
    }
    
    main.register = function() {
    	$location.path("/register");
    }



    main.auth = function() {

        var user_credentials = {
            "username": main.user.username,
            "password": main.user.password
        }

        // Login an user
        $http.post('api/login/', user_credentials).success(function(response) {
            if(response.result === 0) {
                main.loggedIn = true;

                main.invalidInput = false;
                main.serverError = false;

                localStorage['userId'] = response.data.id;
                localStorage['username'] = response.data.username;
                $location.path("/boards");
            }
            else {
                main.loggedIn = false;
                main.invalidInput = true;
            }
        }).error(function (data, status) {
            if(data === null) {
                main.invalidInput = true;
            }
            else {
                main.serverError = true;
            }
            main.loggedIn = false;
        });
    }
    
    main.register = function() {
       
       var user_credentials = {
            "username": login.user.username,
            "password": login.user.password
        }
       
       $http.post('api/register/', user_credentials).success(function(data) {
            main.loggedIn = true;
            main.successfullRegister = true;
            main.unsuccessfullRegister = false;
            main.invalidInput = false;
            main.serverError = false;
        }).error(function (data, status) {
            main.invalidInput = false;
           	main.successfullRegister = false;
           	main.unsuccessfullRegister = true;
            main.loggedIn = false;
        });
       
       $location.path("/");
    }  

    main.getBoard = function(board) {
    	$scope.editBoard = true;
    	$scope.board = board;
    	console.log('board en scope :' + $scope.board);
    	console.log('edit en scope :' + $scope.editBoard);
    	$location.path("/boards/newboard");
    }

    main.getBoards = function() {
    	$http.get('/api/'+ localStorage.getItem('userId') +'/boards/').success(function(result) {    		
            $scope.boards = result.data;
            $scope.tab_content = true;            
        }).error(function (data, status) {        	
            $scope.boards = [];
            $scope.tab_content = false;
        });
        //$scope.boards= [{"id":"59d18309a4983c26501831da","description":"lalala","weathers":[]},{"id":"59d2516b87ec9d0504217fbd","description":"test","weathers":[{"description":"Bari,SO","wind":{"chill":90,"direction":80,"speed":16.09},"atmosphere":{"humidity":38,"visibility":16.09,"pressure":34127.7,"rising":"STEADY"},"condition":{"description":"Mostly Clear","temp":32,"date":"WED 27 SEP"},"forecasts":[{"date":"WED 28 SEP","low":22,"high":-17,"text":"Mostly Clear"},{"date":"THU 29 SEP","low":23,"high":38,"text":"Mostly Clear"},{"date":"FRI 30 SEP","low":22,"high":37,"text":"Mostly Clear"}]},{"description":"Hainault,BE","wind":{"chill":64,"direction":260,"speed":40.23},"atmosphere":{"humidity":56,"visibility":25.91,"pressure":33999.36,"rising":"STEADY"},"condition":{"description":"Breezy","temp":18,"date":"WED 27 SEP"},"forecasts":[{"date":"WED 28 SEP","low":13,"high":18,"text":"Showers"},{"date":"THU 29 SEP","low":9,"high":15,"text":"Scattered Showers"},{"date":"FRI 30 SEP","low":9,"high":15,"text":"Cloudy"}]}]}];
    }

    main.postBoard = function() {

        var boardData = {
            "description": main.newBoardInfo.description,            
            "places" : main.newBoardInfo.places
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

    main.addNewBoard = function() {    	
    	$scope.editBoard=false;    	
    	$location.path("/boards/newboard");
    }

    main.getLocations = function() {
    	$http.get('/api/'+ localStorage.getItem('userId') +'/boards/').success(function(result) {    		
            $scope.locationsAvailable = result.data;                    
        }).error(function (data, status) {        	
            $scope.userBoards = [];
        });
    }

    main.pushLocation = function(location) {
    	$scope.boardLocations.push(location);
    }

    main.init($route.current.$$route.resource);

}]);