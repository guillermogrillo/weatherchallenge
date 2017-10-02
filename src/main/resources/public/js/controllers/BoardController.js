weatherApp.controller('BoardController', ['$scope', '$http', '$timeout', '$location', function($scope, $http, $timeout, $location) {

    $http.defaults.headers.post["Content-Type"] = "application/json";

    var main = this;
    
    $scope.userBoards = []
    $scope.userId = localStorage.getItem('userId');
    main.newBoardInfo = {};
	
    main.init = function() {
        main.getBoards();
    }

    main.getBoards = function() {
    	$http.get('/api/'+ localStorage.getItem('userId') +'/boards/').success(function(result) {    		
            $scope.userBoards = result.data;            
        }).error(function (data, status) {        	
            $scope.userBoards = [];
        });
    }

    main.postBoard = function() {

        var boardData = {
            "description": main.newBoardInfo.description,            
            "places" : main.newBoardInfo.places
        }

        $http.post('api/'+ localStorage.getItem('userId') +'/boards', boardData).success(function(response) {
            if(response.result === 0) {
     			$location.path("/boards");           
            }
            else {
                
            }
        }).error(function (response, status) {
            
        });
    }

    main.addLocation = function() {
    	$location.path("/boards/newboard");
    } 

    main.init();

}]);