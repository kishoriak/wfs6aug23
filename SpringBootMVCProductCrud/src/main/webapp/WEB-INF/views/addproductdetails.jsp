<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="saveProduct" method="post">
      Pid <input type="text" name="pid">
      PName <input type="text" name="pname">
      Quantity <input type="text" name="pqty">
      Price <input type="text" name="pr">
      <button type="submit">Add Product</button>
      
   </form>
</body>
</html>