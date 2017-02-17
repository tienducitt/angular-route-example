var app = angular.module('ngApp', ['ngRoute']);

app.config(function($routeProvider, $locationProvider, $interpolateProvider) {
    $routeProvider
        .when('/home', {
            templateUrl: 'public/template/home.html',
            controller: 'homeCtrl'
        })
        .when('/about', {
            templateUrl: 'public/template/about.html',
            controller: 'aboutCtrl'
        })
        .when('/contact', {
            templateUrl: 'public/template/contact.html',
            controller: 'contactCtrl'
        })
        .otherwise({
            redirectTo: 'home'
        });
    $locationProvider.html5Mode(true);
    $interpolateProvider.startSymbol('[[').endSymbol(']]');
});

app.controller("globalCtrl", ['$scope', '$rootScope',
    function($scope, $rootScope) {
        $scope.test = "this is a global message";
    }
]);
