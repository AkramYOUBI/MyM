<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="excel"  class="com.ImportExcel"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="index.jsp" method="post"  enctype="multipart/form-data">
<input type="file" name="filename">
<input type="submit"  value="Submit">
</form>
</body>
</html>