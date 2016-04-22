<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
 <link href="<c:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap.min.css"/>" rel="stylesheet">
<script src="<c:url value="/resources/bootstrap-3.3.6/js/bootstrap.min.js" />"></script>

</head>
<body>
<form:form commandName="user1" cssClass="form-horizontal" action="Register" method="post">
<div class="form-group">
<label for="name" class="col-sm-2 control-label"> Name:</label>
<div class="col-sm-10">
<form:input path="name" cssClass="form-control"/>
</div>
 </div>
<div class="form-group">
<label for="password" class="col-sm-2 control-label"> Password:</label>
<div class="col-sm-10">
<form:password path="password" cssClass="form-control"/>
</div>
</div>
<div class="form-group">
<label for="number" class="col-sm-2 control-label"> Number:</label>
<div class="col-sm-10">
<form:input path="number" cssClass="form-control"/>
</div>
</div>
<div class="form-group">
<div class="col-sm-2">
<input type="submit" value="save" class="btn btn-primary"/>
</div>
</div>
</form:form>

</body>
</html>