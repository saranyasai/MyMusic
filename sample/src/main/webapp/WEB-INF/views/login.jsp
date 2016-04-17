<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<!--  
<div class="container">
    <h1>Sign Up</h1>
    <form class="form-horizontal">
        <div class="form-group">
            <label class="control-label col-xs-3" for="inputEmail">Email:</label>
            <div class="col-xs-9">
                <input type="email" class="form-control" id="inputEmail" placeholder="Email">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-xs-3" for="inputPassword">Password:</label>
            <div class="col-xs-9">
                <input type="password" class="form-control" id="inputPassword" placeholder="Password">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-xs-3" for="confirmPassword">Confirm Password:</label>
            <div class="col-xs-9">
                <input type="password" class="form-control" id="confirmPassword" placeholder="Confirm Password">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-xs-3" for="firstName">First Name:</label>
            <div class="col-xs-9">
                <input type="text" class="form-control" id="firstName" placeholder="First Name">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-xs-3" for="lastName">Last Name:</label>
            <div class="col-xs-9">
                <input type="text" class="form-control" id="lastName" placeholder="Last Name">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-xs-3" for="phoneNumber">Phone:</label>
            <div class="col-xs-9">
                <input type="tel" class="form-control" id="phoneNumber" placeholder="Phone Number">
            </div>
        </div>
         <div class="form-group">
            <div class="col-xs-offset-3 col-xs-9">
                <input type="submit" class="btn btn-primary" value="Register">
                <input type="reset" class="btn btn-default" value="Reset">
            </div>
            </div>
            </form>
        </div>
-->
<center>
<div class="container">

<center><h1 id="tit">REGISTER</h1></center>


<form action="success.jsp" method="post" class="form-horizontal">

<div class="form-group">
<h1 id="id1"><label class="col-xs-2 control-label" for="un">Username</label></h1>

<input type="text" class="form-control" placeholder="Enter ur name">
</div>

<div class="form-group">
<h1 id="id2"><label class="col-xs-2 control-label" for="up">Password</label></h1>

<input type="password" class="form-control" placeholder="Enter Password" id="up"><br>
</div>

<div class="form-group">
     <h1><label class="control-label col-xs-2" for="confirmPassword">Confirm Password:</label></h1>
            
                <input type="password" class="form-control" id="confirmPassword" placeholder="Confirm Password">
 </div>
        
<div class="form-group">
<input type="submit" class="btn btn-primary" value="login">
<input type="reset" class="btn btn-default" value="cancel">
</div>
</form>
</div>
</center>
</body>
</html>