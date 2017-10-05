weatherApp.controller('BoardController', ['$scope', '$http', '$timeout', '$location','ng.inputSearch', function($scope, $http, $timeout, $location, $inputSearch) {

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
    	$http.get('/api/'+ localStorage.getItem('userId') +'/boards/').success(function(result) {    		
            $scope.boards = result.data;            
        }).error(function (data, status) {        	
            $scope.boards = [];
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

    main.init();

}]);