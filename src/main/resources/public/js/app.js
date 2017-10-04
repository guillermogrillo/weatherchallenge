'use strict';

var weatherApp = angular.module('weatherApp',['ngRoute']);

weatherApp.config(['$routeProvider', '$httpProvider', function ($routeProvider, $httpProvider) {

    $routeProvider
	    .when("/", {
	        templateUrl: "views/landing.html",
	        controller: "LandingController as landing"
	    })
        .when("/login", {
            templateUrl: "views/login.html",
            controller: "LoginController as login"
        })
        .when("/register", {
            templateUrl: "views/register.html",
            controller: "LoginController as login"
        })
        .when("/boards",{
        	templateUrl: "views/boards.html",
        	controller: "BoardController as main"
        })
        .when("/boards/newboard",{
        	templateUrl: "views/newboard.html",
        	controller: "NewBoardController as newBoardController"
        })
    ;
}]);

