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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
 <link href="<c:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap.min.css"/>" rel="stylesheet">
<script src="<c:url value="/resources/bootstrap-3.3.6/js/bootstrap.min.js" />"></script>
</head>
<body>
<div class="container">
<form name="loginForm" action="<c:url value="/j_spring_security_check" />" method="post">
               <c:if test="${not empty error}">
                   <div class="error" style="color: #ff0000 ;">${error}</div>
               </c:if>
               <div class="form-group">
                   <label for="username">User: </label>
                   <input type="text" id="username" name="username" class="form-control" />
               </div>
               <div class="form-group">
                   <label for="password">Password:</label>
                   <input type="password" id="password" name="password" class="form-control" />
               </div>

               <input type="submit" value="Submit" class="btn btn-default"/>

               <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
           </form>
           </div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
