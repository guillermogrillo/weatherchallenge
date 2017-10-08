weatherApp.controller('LoginController', ['$scope', '$http', '$timeout', '$location', function($scope, $http, $timeout, $location) {

    $http.defaults.headers.post["Content-Type"] = "application/json";

    var login = this;
    var loggedIn = false;

    login.user = {};
    login.invalidInput = false;

    login.auth = function() {

        var user_credentials = {
            "username": login.user.username,
            "password": login.user.password
        }

        // Login an user
        $http.post('api/login/', user_credentials).success(function(response) {
            if(response.result === 0) {
                login.loggedIn = true;

                login.invalidInput = false;
                login.serverError = false;

                localStorage['userId'] = response.data.id;
                localStorage['username'] = response.data.username;
                $location.path("/boards");
            }
            else {
                login.loggedIn = false;
                login.invalidInput = true;
            }
        }).error(function (data, status) {
            if(data === null) {
                login.invalidInput = true;
            }
            else {
                login.serverError = true;
            }
            login.loggedIn = false;
        });
    }
    
    login.register = function() {
       
       var user_credentials = {
            "username": login.user.username,
            "password": login.user.password
        }
       
       $http.post('api/register/', user_credentials).success(function(data) {
            if(data.result==0){
                login.loggedIn = true;
                login.successfullRegister = true;
                login.unsuccessfullRegister = false;
                login.invalidInput = false;
                login.serverError = false;            
                $location.path("/");
            }else{
                login.invalidInput = false;
                login.successfullRegister = false;
                login.unsuccessfullRegister = true;
                login.loggedIn = false;    
            }
        }).error(function (data, status) {
            login.invalidInput = false;
           login.successfullRegister = false;
           login.unsuccessfullRegister = true;
            login.loggedIn = false;
        });
    }   
}]);