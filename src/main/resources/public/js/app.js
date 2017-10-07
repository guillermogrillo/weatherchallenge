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
});
