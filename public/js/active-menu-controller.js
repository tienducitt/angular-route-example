app.controller("activeMenuCtrl", ['$scope', '$rootScope',
    function($scope, $rootScope) {
        $rootScope.activeMenu = "";

        $scope.$on('$routeChangeSuccess', function(next, current) {
            $rootScope.getActiveMenu();
        });

        $rootScope.getActiveMenu = function() {
            var path = window.location.pathname;
            if(path.charAt(0) == "/") {
                path = path.substring(1);
            }
            $rootScope.activeMenu = path;
        };

        $rootScope.$watch('activeMenu', function() {
            var activeMenu = $rootScope.activeMenu;
            if(activeMenu) {
                $(".menu").removeClass("active");
                $("#menu_" + activeMenu).addClass("active");
            }
        });

        $rootScope.getActiveMenu();
    }
]);
