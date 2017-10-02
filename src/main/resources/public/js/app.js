'use strict';

var weatherApp = angular.module('weatherApp',['ngRoute']);

weatherApp.config(['$routeProvider', '$httpProvider', function ($routeProvider, $httpProvider) {

    $routeProvider
        .when("/", {
            templateUrl: "views/login.html",
            controller: "LoginController as login"
        })
        .when("/boards",{
        	templateUrl: "views/boards.html",
        	controller: "BoardController as board"
        })
    ;
}]);
