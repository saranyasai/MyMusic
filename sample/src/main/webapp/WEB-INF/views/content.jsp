<%@page import="com.sample.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
    <script src="<c:url value='/resources/app.js'/>"> </script>
  
<title>Description</title>
<style type="text/css">
#bg
{

background-color: lavender;

}
#ig
{
top: 100%;
left: 200%;
}
</style>

<script>

    var app = angular.module('myApp', []);
    
    function  MyController($scope, $http){
        
        $scope.getPersonDataFromServer = function() {           
            $http({method: 'GET', url: 'content1'}).
            success(function(data, status, headers, config) {
            	  $scope.person =JSON.parse(JSON.stringify(data));
          for(var i=0;i<$scope.person.length;i++)
        	  {
        	// alert($scope.person[0]["id"]);
        	  var counter=$scope.person[i];
        	  return $scope.person;
        	  
        	  }
            
            }).
            error(function(data, status, headers, config) {
              // called asynchronously if an error occurs
              // or server returns response with an error status.
            });
        
        };
    };
</script>

</head>

<body id="bg">


                           
<center>
<img src="<c:url value='/resources/images/music.jpg'/>" height="200" width="300" id="ig"/>
</center>
<div class="container" ng-app="myApp" ng-controller="MyController">


<form>
<div class="form-group">
	<div class="input-group">
		<div class="input-group-addon"><i class="fa fa-search"></i></div>
		<input type="text" class="form-control" placeholder="search" ng-model="bname">
	</div>
</div>
</form>

<%String img1=request.getParameter("dd") ;
if(img1.equals("img1"))
{
%>
<div>
        <div  ng-init="getPersonDataFromServer(); ">
           <!--  <button data-ng-click="getPersonDataFromServer()">Get Person data from server</button>-->
            

<div class="table-responsive">
<table class="display table" width="100%">
<thead>
<tr>
<th>pid</th>
<th>pname</th>
<th>cost</th>
<th>description</th>
</tr>
</thead>
<tbody>
	<tr ng-repeat="c in person |filter: bname">
		<td>{{c.id}}</td>
		<td>{{c.name}}</td>
		<td>{{c.cost}}</td>
		<td>{{c.desc}}</td>
	</tr>
</tbody>
</table>
</div>
</div>
</div>
<%}
else if(img1.equals("img2"))
{
%>
<div >
        <div  ng-init="getPersonDataFromServer();">
           <!--  <button data-ng-click="getPersonDataFromServer()">Get Person data from server</button>-->
            

<div class="table-responsive">
<table class="display table" width="100%">
<thead>
<tr>
<th>pid</th>
<th>pname</th>
<th>cost</th>
<th>description</th>
</tr>
</thead>
<tbody>
	<tr ng-repeat="c in person |filter: bname">
		<td>{{c.id}}</td>
		<td>{{c.name}}</td>
		<td>{{c.cost}}</td>
		<td>{{c.desc}}</td>
	</tr>
</tbody>
</table>
</div>
</div>
</div>

<%
}

else if(img1.equals("img3"))
{
%>
<div>
        <div ng-init="getPersonDataFromServer();">
           <!--  <button data-ng-click="getPersonDataFromServer()">Get Person data from server</button>-->
            

<div class="table-responsive">
<table class="display table" width="100%">
<thead>
<tr>
<th>pid</th>
<th>pname</th>
<th>cost</th>
<th>description</th>
</tr>
</thead>
<tbody>
	<tr ng-repeat="c in person|filter:bname">
		<td>{{c.id}}</td>
		<td>{{c.name}}</td>
		<td>{{c.cost}}</td>
		<td>{{c.desc}}</td>
	</tr>
</tbody>
</table>
</div>
</div>
</div>

<%
}
else
{

%>
<div>
        <div ng-init="getPersonDataFromServer();">
           <!--  <button data-ng-click="getPersonDataFromServer()">Get Person data from server</button>-->
            

<div class="table-responsive">
<table class="display table" width="100%">
<thead>
<tr>
<th>pid</th>
<th>pname</th>
<th>cost</th>
<th>description</th>
</tr>
</thead>
<tbody>
	<tr ng-repeat="c in person|filter:bname">
		<td>{{c.id}}</td>
		<td>{{c.name}}</td>
		<td>{{c.cost}}</td>
		<td>{{c.desc}}</td>
		<td><a href="addtocart">click to add into cart</a></td>
	</tr>
</tbody>
</table>
</div>
</div>
</div>
<%} %>

<ul class="list-group">
<li><h1><a href="viewcart.jsp">View Cart</a></h1></li>
<li><h1><a href="orderreceived.jsp">Order Received</a></h1></li>
<li><h1><a href="orderconfirmed.jsp">Order Confirmation</a></h1></li>
</ul>


</div>


</body>
</html>