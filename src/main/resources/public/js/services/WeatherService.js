/*weatherApp.factory('WeatherService', function ($http) {

	var WeatherService = this;

	WeatherService.getBoards = function() {
		var data = {
			boards: [],
			totalBoards: 0
		};
        $http.get('/api/'+ localStorage.getItem('userId') +'/boards/').success(function(result) {           
            data.boards = result.data;
            data.totalBoards = result.data.length;           
            return data;
        }).error(function (data, status) {          
            data.boards=[];
			data.totalBoards = 0;            
			return data;
        });
        
	}
});*/

angular.module('weatherApp').factory('WeatherService', ['$http','$q', function ($http,$q) {
	
	$http.defaults.headers.post["Content-Type"] = "application/json";
	var weatherService = {};
	weatherService.selectedBoard = {};

	weatherService.getBoards = function() {
		var deferred = $q.defer();
		return $http({
			method : 'GET',
			url : '/api/'+ localStorage.getItem('userId') +'/boards/',
		});
	}

	weatherService.setSelectedBoard = function (board) {
		weatherService.selectedBoard = board;
	}

	weatherService.getSelectedBoard = function() {
		return weatherService.selectedBoard;
	}

  	return weatherService;
}]);