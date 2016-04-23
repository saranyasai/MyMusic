<!-- <html>
<head>
<link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
 
</head>

<body>
<div class="container">

<h1 id="tit">Lets Relax In MusicHub</h1>


<form action="login.jsp" method="post" class="form-horizontal">
<div class="form-group">
<h1 id="id1"><label class="col-xs-2 control-label" for="un">Username</label></h1>

<input type="text" class="form-control" placeholder="Enter ur name" id="un">
</div>
<div class="form-group">
<h1 id="id2"><label class="col-xs-2 control-label" for="up">Password</label></h1>

<input type="password" class="form-control" placeholder="Enter Password" id="up"><br>
</div>
<div class="form-group">
<input type="submit" class="btn btn-primary" value="login">
<input type="reset" class="btn btn-default" value="cancel">
</div>
</form>
</div>
<br>
<br>
<br>
<hr>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
-->
<%@include file="header.jsp" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
 </head>

<body>

<form:form commandName="user1" cssClass="form-horizontal" action="Logged">
<div class="form-group">
<label for="name" class="col-sm-2 control-label" > Name:</label>
<div class="col-sm-10">
<form:input path="name" cssClass="form-control"/>

</div>
 
</div>
<div class="form-group">
<label for="name" class="col-sm-2 control-label"> Password:</label>
<div class="col-sm-10">
<form:password path="password" cssClass="form-control"/>

</div>

</div>

<div class="form-group">
<label for="name" class="col-sm-2 control-label"> Name:</label>
<div class="col-sm-2">
<input type="submit" value="login" class="btn btn-primary"/>

</div>

</div>

</form:form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
