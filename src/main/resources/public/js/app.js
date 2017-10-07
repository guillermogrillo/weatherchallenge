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
        })
        .when('/', {
        	templateUrl: 'views/landing.html',
        	controller: 'LandingController as landing'
        })
        .when('/login', {
        	templateUrl: 'views/login.html',
        	controller: 'LoginController as login'
        })
        .when('/register', {
        	templateUrl: 'views/register.html',
        	controller: 'LoginController as login'	
        })        
});
