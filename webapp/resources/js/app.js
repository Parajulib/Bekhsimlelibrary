var myApp = angular.module('myApp', ['ngRoute']);
myApp.config(function($routeProvider){
	$routeProvider.
	when('/', {
		templateUrl: 'index',
		controller:'AppCtrl'
	}).
	when('/home', {
		templateUrl: 'index.jsp',
		controller:'AppCtrl'
	}).
	when('/login', {
		templateUrl: 'login.jsp',
		controller:'AppCtrl'
	}).
	when('/book/add', {
		templateUrl: 'addbook.jsp',
		controller:'AppCtrl'
	}).
	when('#', {
		templateUrl: 'index.jsp',
		controller : 'AppCtrl'
	}).
	otherwise({
		redirectTo: '/'
	});
})