weatherApp.controller('LandingController', ['$scope', '$http', '$timeout', '$location', function($scope, $http, $timeout, $location) {

    $http.defaults.headers.post["Content-Type"] = "application/json";

    var landing = this;

    landing.login = function() {
        $location.path("/login");
    }
    
    landing.register = function() {
    	$location.path("/register");
    }

}]);