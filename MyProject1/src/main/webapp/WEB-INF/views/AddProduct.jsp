<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form commandName="product" cssClass="form-horizontal" action="AddProduct" method="post" enctype="multipart/form-data">
<div class="form-group">
<form:errors path="*" cssStyle="color:red;"/>
</div>
<div class="form-group">
<h2><label for="name" class="col-sm-2 control-label"> ProductName:</label></h2>
<div class="col-sm-10">
<h1><form:input path="pname" cssClass="form-control"/></h1>
</div>
 </div>
<div class="form-group">
<h2><label for="password" class="col-sm-2 control-label"> ProductDesc:</label></h2>
<div class="col-sm-10">
<h1><form:input path="pdesc" cssClass="form-control"/></h1>
</div>
</div>
<div class="form-group">
<h2><label for="pmanu" class="col-sm-2 control-label"> ProductManufacture:</label></h2>
<div class="col-sm-10">
<h1><form:input path="pmanu" cssClass="form-control"/></h1>
</div>
</div>
<div class="form-group">
<h2><label for="pprice" class="col-sm-2 control-label"> ProductPrice:</label></h2>
<div class="col-sm-10">
<h1><form:input path="pprice" cssClass="form-control"/></h1>
</div>
</div>

<div class="form-group">
<h2><label for="pprice" class="col-sm-2 control-label"> Select Image:</label></h2>
<div class="col-sm-10">
<h1><input type="file" name="pfile"> 
</div>
</div>

<center>
<div class="form-group">
<div class="col-sm-2">
<center><input type="submit" value="add" class="btn btn-info btn-md"/></center>
</div>
</div>
</center>
</form:form>


</form>
</body>
</html>