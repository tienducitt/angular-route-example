app.controller("aboutCtrl", ['$scope', '$rootScope',
    function($scope, $rootScope) {
        $rootScope.activeMenu = 'about';
        $scope.message = "This is ABOUT page";

        console.log($rootScope.activeMenu);
    }
]);
