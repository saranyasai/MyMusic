<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <!-- <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">-->
 <link rel="stylesheet" href="<c:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap.min.css" />">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="<c:url value="/resources/bootstrap-3.3.6-dist/js/bootstrap.min.js" />"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
     height: 70%;
     width: 60%;
     margin: auto;
   
    
     
  }
  </style>
</head>
<body>

<div class="container">
  <br>
  <nav class="navbar navbar-inverse">
  <div class="container-fluid">
  <ul class="nav navbar-nav navbar-right">
      <li><a href="index"><span class="glyphicon glyphicon-user"></span>Login</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span>Register</a></li>
      <li><a href="About">About Us</a>
    </ul>
  </div>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        
        <img src="<c:url value='/resources/images/music5.jpg'/>" height="200" width="300"/>
      </div>

      <div class="item">
        
         <img src="<c:url value='/resources/images/music2.jpg'/>" height="200" width="300"/>
      </div>
    
      <div class="item">
       
         <img src="<c:url value='/resources/images/music3.jpg'/>" height="200" width="300"/>
      </div>

      
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
 
</div>
 <center><h1 style="color:red">Enjoy the Rhythm of Music</h1></center>
 <form method="post"></form>
<div class="table-responsive">
<center>
<div class="table">
 <a href="content?dd=img1"><img src="<c:url value='/resources/images/music7.jpg'/>" height="200" width="300" alt="record"/></a>

 <a href="content?dd=img2"><img src="<c:url value='/resources/images/music8.jpg'/>" height="200" width="300"/></a>
 
 <a href="content?dd=img3"><img src="<c:url value='/resources/images/music9.jpg'/>" height="200" width="300"/></a>
 </div>
 <h1><a href="content?dd=img4">All Products</a></h1>
 </center>
</div>
</form>
</body>
</html>
