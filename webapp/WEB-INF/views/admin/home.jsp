<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html ng-app="myApp">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bekhsimle Public Library</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">
<script src="resources/js/angular.min.js"></script>
<script src="resources/js/angular-route.min.js"></script>
<script src="resources/js/app.js"></script>
<script src="resources/js/controller.js"></script>
</head>
<body>
 <%@ include file="header.jsp" %>
	<div class="container" ng-controller="AppCtrl">
		<div ng-view></div>
	</div>

	<!-- Bootstrap core JavaScript -->

	<script src="resources/js/jquery-2.1.4.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug 
    <script src="js/ie10-viewport-bug-workaround.js"></script>-->
</body>
</html>
