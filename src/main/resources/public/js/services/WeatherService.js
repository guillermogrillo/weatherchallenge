angular.module('weatherApp').factory('WeatherService', ['$http','$q', function ($http,$q) {
	
	$http.defaults.headers.post["Content-Type"] = "application/json";
	var weatherService = {};
	weatherService.selectedBoard = {};
	weatherService.selectedLocation = {};

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

	weatherService.setSelectedLocation = function (location) {
		weatherService.selectedLocation = location;
	}

	weatherService.getSelectedLocation = function() {
		return weatherService.selectedLocation;
	}
  	return weatherService;
}]);