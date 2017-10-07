var weatherApp = angular.module('weatherApp', ['ngRoute', 'ngAnimate']);

weatherApp.config(function($routeProvider) {

    $routeProvider

        .when('/boards', {
            templateUrl: 'views/boards.html',
            controller: 'WeatherController as main'
        })

        .when('/board', {
            templateUrl: 'views/board.html',
            controller: 'BoardController as boardCtrl'
        })

        .when('/location', {
            templateUrl: 'views/location.html',
            controller: 'LocationsController as locationCtrl'
        });

});

weatherApp.controller('LocationsController', function($scope) {
    $scope.pageClass = 'Here you can see the weather forecast of the selected location';
});
