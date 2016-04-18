<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
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
      <li><a href="index.jsp"><span class="glyphicon glyphicon-user"></span>Login</a></li>
      <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span>Register</a></li>
      <li><a href="About.jsp">About Us</a>
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
        <img src="music5.jpg" alt="Chania" width="260" height="345">
      </div>

      <div class="item">
        <img src="music2.jpg" alt="Chania" width="260" height="345">
      </div>
    
      <div class="item">
        <img src="music3.jpg" alt="Flower" width="260" height="345">
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
</body>
</html>
