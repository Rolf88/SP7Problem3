var app = angular.module('myApp', ['ngRoute']);
app.config(function ($routeProvider) {
    $routeProvider
            .when('/clear', {
                templateUrl: 'views/clear.html',
                controller: 'AngularCtrl as ctrl'
            })
            .when('/tableAngular', {
                templateUrl: 'views/tableAngular.html',
                controller: 'AngularCtrl as ctrl'
            })
            .when('/tableJQuery', {
                templateUrl: 'views/tableJQuery.html',
                controller: 'AngularCtrl as ctrl'
            })
            .otherwise({redirectTo: '/tableAngular'});
});

app.controller("AngularCtrl", ['$http', function ($http) {
        var self = this;
        self.members = [];
        $http.get('api/member/complete').then(function (response) {
            self.members = response.data;
        }, function(errResponse){
            console.error('Error while fetching data');
        });

    }]);