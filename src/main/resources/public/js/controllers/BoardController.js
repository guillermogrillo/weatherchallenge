weatherApp.controller('BoardController', ['$scope', '$http', function($scope, $http) {

	$http.defaults.headers.post["Content-Type"] = "application/json";
	
	$scope.pageClass = 'page-board';

    var boardCtrl = this;

}]);
