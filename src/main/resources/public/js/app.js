'use strict';

var weatherApp = angular.module('weatherApp',['ngRoute','ngTable']);

weatherApp.config(['$routeProvider', '$httpProvider', function ($routeProvider, $httpProvider) {

    $routeProvider
    	.when("/", {
    		templateUrl: "views/home.html",
    		contentUrl: "views/landing.html",
    		controller: "WeatherController as main",
    		resource: "landing"
    	})
        .when("/login", {
            templateUrl: "views/home.html",
            contentUrl: "views/login.html",
            controller: "WeatherController as main",
            resource: "landing"
        })
        .when("/logout", {
            templateUrl: "views/home.html",
            contentUrl: "views/landing.html",
            controller: "WeatherController as main",
            resource: "logout"
        })
        .when("/register", {
            templateUrl: "views/home.html",
            contentUrl: "views/register.html",
            controller: "WeatherController as main",
            resource: "register"
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

