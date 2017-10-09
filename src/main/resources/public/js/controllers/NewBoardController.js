weatherApp.controller('NewBoardController', ['$scope', '$location','WeatherService', function($scope, $location, WeatherService) {

    var newBoardCtrl = this;
    newBoardCtrl.description = '';
    $scope.locations=[];
    $scope.userId = localStorage.getItem('userId');
    $scope.username= localStorage.getItem('username');
    $scope.editBoardId = '';

    
    newBoardCtrl.postBoard = function() {
    	var boardData = {
            "id": $scope.editBoardId,
            "description": newBoardCtrl.description,            
            "woeids" : parseListWoeids($scope.locations),
        }
    	
        WeatherService.postBoard(boardData)
            .then(
                function(result) {                          	
                    console.log('Post Board ok');
                    $location.path("/boards"); 
                }, 
                function(error) {
                    console.log('Error posting the board');
                }
            );
    }

    var parseListWoeids = function(listLocations){    
        var listWoeids = [];
        var regExp = /\(([^)]+)\)/;
        angular.forEach(listLocations, function(value, key) {
            var matches = regExp.exec(value);            
            if (matches) {
                var submatch = matches[1];
                listWoeids.push(submatch);
            }
        }, listWoeids);
        return listWoeids;
    }
    
    $scope.getLocation = function(val) {
        var uri = "https://query.yahooapis.com/v1/public/yql?q=select * from geo.places where text='*"+val+"*'&format=json";
        var encodedUri = encodeURI(uri);
        return WeatherService.getLocation(encodedUri)
        .then(
            function(response) {                          	
            	return response.data.query.results.place.map(function(item){
            		if(item !== null && item !== undefined && item.locality1 !== null && item.locality1 !== undefined && item.country !== null && item.country !== undefined){                    
                        var locationItem = item.locality1.content+', '+item.country.content+' ('+ item.woeid +')';
                        return locationItem;
                    }
            	})},
            function(error) {
                console.log('Error getting locations');
            }
        );
    };
    
    newBoardCtrl.addLocationIfNotPresent = function(selectedLocation) {
        if(!contains.call($scope.locations, selectedLocation)){
            $scope.locations.push(selectedLocation);
        }
    }
    
    var contains = function(needle) {
        var findNaN = needle !== needle;
        var indexOf;
        if(!findNaN && typeof Array.prototype.indexOf === 'function') {
            indexOf = Array.prototype.indexOf;
        } else {
            indexOf = function(needle) {
                var i = -1, index = -1;

                for(i = 0; i < this.length; i++) {
                    var item = this[i];

                    if((findNaN && item !== item) || item === needle) {
                        index = i;
                        break;
                    }
                }

                return index;
            };
        }
        return indexOf.call(this, needle) > -1;
    };
    
    newBoardCtrl.deleteLocationLocally = function(locationToRemove) {
        for (var i = 0; i < $scope.locations.length; i++) {
            if(newBoardCtrl.getWoeid($scope.locations[i])== newBoardCtrl.getWoeid(locationToRemove))
            {
                $scope.locations.splice(i, 1);
            }
        }
    }

    newBoardCtrl.getWoeid = function(location) {
        var regExp = /\(([^)]+)\)/;
        var matches = regExp.exec(location);            
        if (matches) {
            var submatch = matches[1];            
            return submatch;
        }
        return null;
    }

    newBoardCtrl.init = function() {
        console.log('Init newBoardCtrl');
        $scope.mode=WeatherService.getMode();
        if($scope.mode=='edit'){
            var boardDto = WeatherService.getBoardDto();
            $scope.editBoardId = boardDto.id;
            $scope.locations = boardDto.locations;
            newBoardCtrl.description = boardDto.description;  
        }
    }
    
    newBoardCtrl.init();
    
}]);
