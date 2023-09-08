<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


   <form action="/product/updateProduct" method="post">
      Product id : <input type="text" name="pid" value="${prod.pid}" readonly>
      Product name : <input type="text" name="pname" value="${prod.pname}">
       Product Quantity : <input type="text" name="qty" value="${prod.qty}">
        Product price: <input type="text" name="price" value="${prod.price}">
        <button type="submit" name="btn">Update Product</button>
   </form>
</body>
</html>