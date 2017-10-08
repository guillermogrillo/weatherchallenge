weatherApp.controller('WeatherController', ['$scope','$location','$interval','WeatherService', function($scope,$location,$interval,WeatherService) {

    var main = this;

    main.getBoards = function() {
        $scope.boards = null;
        WeatherService.getBoards()
            .then(
                function(result) {          
                    $scope.boards = result.data.data;
                    console.log('get Boards ok');
                }, 
                function(error) {
                    console.log('Error getting the boards');
                }
            );
    }

    main.deleteBoard = function (id){
        WeatherService.deleteBoard(id)
            .then(
                function(result) {          
                    if(result.data.result === 0) {
                        for (var i = 0; i < $scope.boards.length; i++) {
                            if($scope.boards[i].id==id)
                            {
                                $scope.boards.splice(i, 1);
                            }
                        }
                    }
                    console.log('get Boards ok');
                }, 
                function(error) {
                    console.log('Error getting the boards');
                }
            );

    }

    main.init = function() {
        main.getBoards();
    }

    main.addNewBoard = function() {
        WeatherService.setMode('add'); 
        var boardDto = {
            id: '',
            description: '',
            locations : []
        };
        WeatherService.setBoardDto(boardDto);            
        $location.path("/boards/new");
    }

    $scope.checkBoardDetail = function(board){
        WeatherService.setSelectedBoard(board);
        $location.path("/board");
    }

    $scope.callAtInterval = function() {
        console.log('Calling weather update from page');
        main.getBoards();
    }

    $interval( function(){ $scope.callAtInterval(); }, 60000);

    main.init();

}]);