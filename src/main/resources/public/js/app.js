'use strict';

var weatherApp = angular.module('weatherApp',['ngRoute','ngTable']);

weatherApp.config(['$routeProvider', '$httpProvider', function ($routeProvider, $httpProvider) {

    $routeProvider
    	.when("/", {
    		templateUrl: "views/landing.html",
    		controller: "WeatherController as main",
    		resource: "landing"
    	})
        .when("/login", {            
            templateUrl: "views/login.html",
            controller: "LoginController as login"
        })        
        .when("/register", {
            templateUrl: "views/register.html",
            controller: "LoginController as login"
        })
        .when("/boards", {
            templateUrl: "views/home.html",
            contentUrl: "views/boards.html",
            controller: "WeatherController as main",
            resource: "boards"
        })
        .when("/boards/newboard", {
            templateUrl: "views/home.html",
            contentUrl: "views/newboard.html",
            controller: "WeatherController as main",
            resource: "new_board"
        })                        
    ;
}]);

