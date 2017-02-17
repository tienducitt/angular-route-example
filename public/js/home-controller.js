app.controller("homeCtrl", ['$scope', '$rootScope',
    function($scope, $rootScope) {
        $scope.message = "This is HOME page";
        $scope.textToInsert = " sometext";
    }
]);

app.directive('mydiv', function() {
    var directive = {};

    directive.restrict = 'E'; /* restrict this directive to elements */

    directive.template = "My first directive: {{textToInsert}}";

    return directive;
});
