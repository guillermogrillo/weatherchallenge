weatherApp.controller('NewBoardController', ['$scope', '$http', '$timeout', '$location', function($scope, $http, $timeout, $location) {

    $http.defaults.headers.post["Content-Type"] = "application/json";

    var newBoardController = this;
    
    $scope.boards = [];
    $scope.board=[];
    $scope.boardLocations = [];
    $scope.userId = localStorage.getItem('userId');
    $scope.username= localStorage.getItem('username');
    newBoardController.newBoardInfo = {};
    newBoardController.locationsFound = [];

    newBoardController.postBoard = function() {

        var boardData = {
            "description": newBoardController.newBoardInfo.description,            
            "places" : newBoardController.newBoardInfo.places
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

    newBoardController.getLocations = function() {
    	$http.get('/api/'+ localStorage.getItem('userId') +'/boards/').success(function(result) {    		
            $scope.locationsAvailable = result.data;                    
        }).error(function (data, status) {        	
            $scope.userBoards = [];
        });
    }

    newBoardController.pushLocation = function(location) {
    	$scope.boardLocations.push(location);
    }    

}]);