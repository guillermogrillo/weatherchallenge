weatherApp.controller('BoardController', ['$scope', '$http', '$timeout', '$location', function($scope, $http, $timeout, $location) {

    $http.defaults.headers.post["Content-Type"] = "application/json";

    var main = this;
    
    $scope.boards = [];
    $scope.board=[];
    $scope.boardLocations = [];
    $scope.userId = localStorage.getItem('userId');
    $scope.username= localStorage.getItem('username');
    main.newBoardInfo = {};
    main.locationsFound = [];
	
    main.init = function() {
        main.getBoards();
    }

    main.getBoard = function(board) {
    	$scope.editBoard = true;
    	$scope.board = board;
    	console.log('board en scope :' + $scope.board);
    	console.log('edit en scope :' + $scope.editBoard);
    	$location.path("/boards/newboard");
    }

    main.getBoards = function() {
    	/*$http.get('/api/'+ localStorage.getItem('userId') +'/boards/').success(function(result) {    		
            $scope.userBoards = result.data;            
        }).error(function (data, status) {        	
            $scope.userBoards = [];
        });*/
        $scope.boards= [{"id":"59d18309a4983c26501831da","description":"lalala","weathers":[]},{"id":"59d2516b87ec9d0504217fbd","description":"test","weathers":[{"description":"Yahoo! Weather for Bari, SO","wind":{"chill":90,"direction":80,"speed":16.09},"atmosphere":{"humidity":38,"visibility":16.09,"pressure":34127.7,"rising":"STEADY"},"condition":{"description":"Mostly Clear","temp":32,"date":1506956220000},"forecasts":[{"date":1506913200000,"low":22,"high":-17,"text":"Mostly Clear"},{"date":1506999600000,"low":23,"high":38,"text":"Mostly Clear"},{"date":1507086000000,"low":22,"high":37,"text":"Mostly Clear"},{"date":1507172400000,"low":23,"high":37,"text":"Clear"},{"date":1507258800000,"low":24,"high":37,"text":"Partly Cloudy"},{"date":1507345200000,"low":25,"high":37,"text":"Partly Cloudy"},{"date":1507431600000,"low":25,"high":36,"text":"Partly Cloudy"},{"date":1507518000000,"low":25,"high":36,"text":"Scattered Thunderstorms"},{"date":1507604400000,"low":24,"high":36,"text":"Partly Cloudy"},{"date":1507690800000,"low":23,"high":36,"text":"Partly Cloudy"}]},{"description":"Yahoo! Weather for Hainault, BE","wind":{"chill":64,"direction":260,"speed":40.23},"atmosphere":{"humidity":56,"visibility":25.91,"pressure":33999.36,"rising":"STEADY"},"condition":{"description":"Breezy","temp":18,"date":1506952800000},"forecasts":[{"date":1506913200000,"low":13,"high":18,"text":"Showers"},{"date":1506999600000,"low":9,"high":15,"text":"Scattered Showers"},{"date":1507086000000,"low":9,"high":15,"text":"Cloudy"},{"date":1507172400000,"low":11,"high":14,"text":"Showers"},{"date":1507258800000,"low":8,"high":12,"text":"Scattered Showers"},{"date":1507345200000,"low":8,"high":12,"text":"Mostly Cloudy"},{"date":1507431600000,"low":8,"high":13,"text":"Mostly Cloudy"},{"date":1507518000000,"low":8,"high":13,"text":"Mostly Cloudy"},{"date":1507604400000,"low":8,"high":14,"text":"Mostly Cloudy"},{"date":1507690800000,"low":7,"high":13,"text":"Mostly Cloudy"}]}]},{"id":"59d2520187ec9d0504217fbe","description":"aaa","weathers":[{"description":"Yahoo! Weather for Bari, SO","wind":{"chill":90,"direction":80,"speed":16.09},"atmosphere":{"humidity":38,"visibility":16.09,"pressure":34127.7,"rising":"STEADY"},"condition":{"description":"Mostly Clear","temp":32,"date":1506956220000},"forecasts":[{"date":1506913200000,"low":22,"high":-17,"text":"Mostly Clear"},{"date":1506999600000,"low":23,"high":38,"text":"Mostly Clear"},{"date":1507086000000,"low":22,"high":37,"text":"Mostly Clear"},{"date":1507172400000,"low":23,"high":37,"text":"Clear"},{"date":1507258800000,"low":24,"high":37,"text":"Partly Cloudy"},{"date":1507345200000,"low":25,"high":37,"text":"Partly Cloudy"},{"date":1507431600000,"low":25,"high":36,"text":"Partly Cloudy"},{"date":1507518000000,"low":25,"high":36,"text":"Scattered Thunderstorms"},{"date":1507604400000,"low":24,"high":36,"text":"Partly Cloudy"},{"date":1507690800000,"low":23,"high":36,"text":"Partly Cloudy"}]},{"description":"Yahoo! Weather for Hainault, BE","wind":{"chill":64,"direction":260,"speed":40.23},"atmosphere":{"humidity":56,"visibility":25.91,"pressure":33999.36,"rising":"STEADY"},"condition":{"description":"Breezy","temp":18,"date":1506952800000},"forecasts":[{"date":1506913200000,"low":13,"high":18,"text":"Showers"},{"date":1506999600000,"low":9,"high":15,"text":"Scattered Showers"},{"date":1507086000000,"low":9,"high":15,"text":"Cloudy"},{"date":1507172400000,"low":11,"high":14,"text":"Showers"},{"date":1507258800000,"low":8,"high":12,"text":"Scattered Showers"},{"date":1507345200000,"low":8,"high":12,"text":"Mostly Cloudy"},{"date":1507431600000,"low":8,"high":13,"text":"Mostly Cloudy"},{"date":1507518000000,"low":8,"high":13,"text":"Mostly Cloudy"},{"date":1507604400000,"low":8,"high":14,"text":"Mostly Cloudy"},{"date":1507690800000,"low":7,"high":13,"text":"Mostly Cloudy"}]}]}];
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

    main.init();

}]);