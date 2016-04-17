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
</head>

<body id="bg">
 <!-- div class="form-group">
                                 <h1>   <label for="filter">View Product by</label></h1>
                                    <select class="form-control">
                                     <h1>   <option value="0" selected>Search for Instruments</option></h1>
                                     <h1>   <option value="1">Featured</option></h1>
                                        <h1><option value="2">Most popular</option></h1>
                                        <h1><option value="3">Top rated</option></h1>
                                        <h1><option value="4">Most commented</option></h1>
                                    </select>
                                  </div>
                                  -->
                            
<center>
<img src="<c:url value='/resources/images/music.jpg'/>" height="200" width="300" id="ig"/>
</center>
<div class="container" ng-app="sortApp" ng-controller="mainController">

<%
String img1=request.getParameter("dd");

if(img1.equals("img1"))
{
	out.println("<center><h1 style='color:green'>you have chosen guitar!!!!!!!</h1></center>");
out.println("<center><h1 style='color:green'>guitar rocks western music</h1></center>");	
%>
<form>
<div class="form-group">
	<div class="input-group">
		<div class="input-group-addon"><i class="fa fa-search"></i></div>
		<input type="text" class="form-control" placeholder="search" ng-model="byname">
	</div>
</div>
</form>


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
	<tr ng-repeat="c in accessories|filter:byname">
		<td>{{c.pid}}</td>
		<td>{{c.pname}}</td>
		<td>{{c.cost}}</td>
		<td>{{c.description}}</td>
	</tr>
</tbody>
</table>
</div>
<%
}
else if(img1.equals("img2"))
{
	out.println("<center><h1 style='color:green'>you have chosen tabla!!!!!!</h1></center>");
out.println("<center><h1 style='color:blue'>tabla is a classical musical instrument </h1></center>");
%>
<form>
<div class="form-group">
	<div class="input-group">
		<div class="input-group-addon"><i class="fa fa-search"></i></div>
		<input type="text" class="form-control" placeholder="search" ng-model="byname">
	</div>
</div>
</form>


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
	<tr ng-repeat="c in instrument|filter:byname">
		<td>{{c.pid}}</td>
		<td>{{c.pname}}</td>
		<td>{{c.cost}}</td>
		<td>{{c.description}}</td>
	</tr>
</tbody>
</table>
</div>
<%
}
else if(img1.equals("img3"))
{
	out.println("<center><h1 style='color:green'>you have chosen veena!!!!!</h1></center>");
out.println("<center><h1 style='color:red'>Veena is a divine musical instrument</h1></center>");
%>
<form>
<div class="form-group">
	<div class="input-group">
		<div class="input-group-addon"><i class="fa fa-search"></i></div>
		<input type="text" class="form-control" placeholder="search" ng-model="byname">
	</div>
</div>
</form>


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
	<tr ng-repeat="c in Brand|filter:byname">
		<td>{{c.pid}}</td>
		<td>{{c.pname}}</td>
		<td>{{c.cost}}</td>
		<td>{{c.description}}</td>
	</tr>
</tbody>
</table>
</div>
<%}
else
{
%>
<form>
<div class="form-group">
	<div class="input-group">
		<div class="input-group-addon"><i class="fa fa-search"></i></div>
		<input type="text" class="form-control" placeholder="search" ng-model="byname">
	</div>
</div>
</form>


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
	<tr ng-repeat="c in category|filter:byname">
		<td>{{c.pid}}</td>
		<td>{{c.pname}}</td>
		<td>{{c.cost}}</td>
		<td>{{c.description}}</td>
	</tr>
</tbody>
</table>
</div>
<%
}


out.println("<h1 style='color:red'>do you wanna enjoy buy it!!!!!!</h1>");

%>
<ul class="list-group">
<li><h1><a href="viewcart.jsp">View Cart</a></h1></li>
<li><h1><a href="orderreceived.jsp">Order Received</a></h1></li>
<li><h1><a href="orderconfirmed.jsp">Order Confirmation</a></h1></li>
</ul>



</div>
</div>
</body>
</html>