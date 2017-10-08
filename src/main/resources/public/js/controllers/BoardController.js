weatherApp.controller('BoardController', ['$scope', '$location','WeatherService', function($scope, $location, WeatherService) {

    var boardCtrl = this;

    $scope.board = WeatherService.getSelectedBoard();

    $scope.selectedLocation = WeatherService.getSelectedLocation();

    $scope.checkLocationForecast = function(location){
        WeatherService.setSelectedLocation(location);
        $location.path("/location");
    }
    
    boardCtrl.deleteLocationFromBoard = function(boardId, woeid) {
    	
    	WeatherService.deleteLocationFromBoard(boardId, woeid)
        .then(
            function(result) {                          	
                console.log('Delete location ok');
                for (var i = 0; i < $scope.board.locations.length; i++) {
                    if($scope.board.locations[i].woeid==woeid)
                    {
                        $scope.board.locations.splice(i, 1);
                    }
                }
            }, 
            function(error) {
                console.log('Error deleting the location');
            }
        );
    }

    boardCtrl.editBoard = function(board) {
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

}]);
