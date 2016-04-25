<%@page import="java.util.ArrayList"%>
<%@page import="com.musichub.model.ProductInfo" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="header.jsp" %>
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
            $http({method: 'GET', url: 'Success'}).
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
<img src="<c:url value='/resources/images/music6.jpg'/>" height="200" width="300" id="ig"/>
</center>
<br>
<br>
<div class="container" ng-app="myApp" ng-controller="MyController">
<form>
<div class="form-group">
	<div class="input-group">
		<div class="input-group-addon"><i class="fa fa-search"></i></div>
		<input type="text" class="form-control" placeholder="search" ng-model="bname" style="font-size: 200%;">
	</div>
</div>
</form>

<!-- 
<form>
<div class="form-group">
	<div class="input-group">
		<div class="input-group-addon"><i class="fa fa-search"></i></div>
		<input type="text" class="form-control" placeholder="search" ng-model="bname" style="font-size: 200%;">
	</div>
</div>
</form> -->

<%-- <%String img1=request.getParameter("dd") ;
if(img1.equals("img1"))
{
%> --%>
<div>
        <div  ng-init="getPersonDataFromServer(); ">
           <!--  <button data-ng-click="getPersonDataFromServer()">Get Person data from server</button>-->
            

<div class="table-responsive">
<table class="display table" width="100%">
<thead>
<tr>
<th style="font-size: 200%;">pid</th>
<th style="font-size: 200%;">pname</th>
<th style="font-size: 200%;">cost</th>
<th style="font-size: 200%;">description</th>
<th style="font-size: 200%;">manufcture</th>
</tr>
</thead>
<tbody>
	<tr ng-repeat="c in person|filter: bname">
	
			<td style="font-size: 200%;">{{c.id}}</td>
		<td style="font-size: 200%;">{{c.pname}}</td>
			<td style="font-size: 200%;">{{c.pprice}}</td>
			<th style="font-size: 200%;">{{c.pdesc}}</th>
			<td style="font-size:200%;">{{c.pmanu}}</td>
			<td style="font-size: 200%;"><a href="moreinfo?id={{c.id}}">
			
   	   <span class="glyphicon glyphicon-info-sign"></span>
   <td style="font-size:200%;"><a href="Edit?id={{c.pname}}" class="btn btn-info" role="button">Edit</a></td>
   <td style="font-size:200%;"><a href="Delete" class="btn btn-info" role="button">Delete</a></td>
        </a></td>
	</tr>
</tbody>
</table>
</div>
</div>
</div>
</div>
</body>