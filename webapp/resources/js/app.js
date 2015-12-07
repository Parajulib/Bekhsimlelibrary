var myApp = angular.module('myApp', ['ngRoute']);
myApp.config(function($routeProvider){
	$routeProvider.
	when('/', {
		templateUrl: 'index.jsp',
		controller:'AppCtrl'
	}).
	when('/home', {
		templateUrl: 'home.jsp',
		controller:'AppCtrl'
	}).
	when('/login', {
		templateUrl: 'login.jsp',
		controller:'AppCtrl'
	}).
	when('/book/add', {
		templateUrl: 'admin/book/addbook.jsp',
		controller:'AppCtrl'
	}).
	when('/lisbook', {
		templateUrl: 'books.jsp',
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