<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 
<title>Add To Cart</title>
<style type="text/css">
#bg
{

background-color:lavender;

}
</style>
</head>
<body id="bg">
<div class="container">
<center><h1 style="font-size:500%;">You have chosen ${ss.name }!!!!!!!!</h1></center>
<br>
<div class="row">
    <div class="col-sm-6">
   <center> <img src="<c:url value='/resources/images/music.jpg'/>" height="200" width="300" id="ig"/></center>
    </div>
    
    <div class="col-sm-6">
    <center>
   <h1 style="font-family:cursive;color: purple; ">   Product Name:${ss.name }<br>
Product Cost:${ss.cost }<br>
Description:${ss.desc }<br>    
</h1>
 <ul class="nav navbar-nav navbar-right">
     <li><h1>   <a href="AddToCart">Add to cart
          <span class="glyphicon glyphicon-shopping-cart"></span>
        </a>
  </h1>
  </li>
  </ul>
</center>
    </div>
    </div>
    <br>
    <br>
 
  
  </div>



<br>
<br>
<br>
<hr>
<jsp:include page="footer.jsp"></jsp:include>

   


   


</body>
</html>