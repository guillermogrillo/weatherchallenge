weatherApp.controller('BoardController', ['$scope', '$location','WeatherService', function($scope, $location, WeatherService) {

    var boardCtrl = this;

    $scope.board = WeatherService.getSelectedBoard();

    $scope.selectedLocation = WeatherService.getSelectedLocation();

    $scope.checkLocationForecast = function(location){
    	WeatherService.setSelectedLocation(location)
        $scope.selectedLocation = location;
        $location.path("/location");        
    }

}]);
