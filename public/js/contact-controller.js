app.controller("contactCtrl", ['$scope', '$rootScope',
    function($scope, $rootScope) {
        $rootScope.activeMenu = 'contact';
        $scope.message = "This is CONTACT page";

        console.log($rootScope.activeMenu);
    }
]);
