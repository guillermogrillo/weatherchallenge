angular.module('weatherApp').factory('WeatherService', ['$http','$q', function ($http,$q) {
	
	$http.defaults.headers.post["Content-Type"] = "application/json";
	var weatherService = {};
	weatherService.selectedBoard = {};
	weatherService.selectedLocation = {};
	weatherService.mode = '';
	weatherService.boardDto = {
		id: '',
		description : '',	
		locations : []
	};	

	weatherService.getBoards = function() {
		var deferred = $q.defer();
		return $http({
			method : 'GET',
			url : '/api/'+ localStorage.getItem('userId') +'/boards/',
		});
	}
	
	weatherService.postBoard = function(newBoardDto) {
		var deferred = $q.defer();
		return $http({
			method : 'POST',
			url : 'api/'+ localStorage.getItem('userId') +'/boards',
			data: JSON.stringify(newBoardDto)
		});
	}

	weatherService.deleteBoard = function(id) {

		var deferred = $q.defer();
		return $http({
			method : 'DELETE',
			url : 'api/'+ localStorage.getItem('userId') +'/boards/'+id,
		});		
	}
	
	weatherService.getLocation = function(encodedUri){
		var deferred = $q.defer();
		return $http({
			method : 'GET',
			url : encodedUri,
		});
	}
	
	weatherService.deleteLocationFromBoard = function(boardId, woeid) {
		var deferred = $q.defer();
		return $http({
			method : 'DELETE',
			url : 'api/'+ localStorage.getItem('userId') +'/boards/'+boardId+'/'+woeid,
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

	weatherService.setMode = function (mode) {
		weatherService.mode = mode;
	}

	weatherService.getMode = function() {
		return weatherService.mode;
	}

	weatherService.setBoardDto = function(boardDto) {
		weatherService.boardDto = boardDto;
	}

	weatherService.getBoardDto = function() {
		return weatherService.boardDto;
	}


  	return weatherService;
}]);