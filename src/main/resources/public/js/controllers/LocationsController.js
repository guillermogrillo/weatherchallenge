weatherApp.controller('LocationsController', ['$scope', '$http', function($scope, $http) {

	$http.defaults.headers.post["Content-Type"] = "application/json";
	
	$scope.pageClass = 'page-location';

    var locationCtrl = this;

}]);