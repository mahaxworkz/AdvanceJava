<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> View Table</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<form action="read" method="get">
<button type="submit">view songs</button>
</form>
<table class="table table-bordered table-dark">
  <thead>
    <tr>
      <th scope="col">BookName</th>
      <th scope="col">AuthorName</th>
      <th scope="col">publishedin</th>
      <th scope="col">publisher</th>
      <th scope="col">language</th>
      <th scope="col">content</th>
      
    </tr>
  </thead>
  <tbody>
     <c:forEach var="list" items="${read}">
<tr>
<td>${list.bookName}</td>
<td>${list.authorName}</td>
<td>${list.publishedin}</td>
<td>${list.publisher}</td>
<td>${list.language}</td>
<td>${list.content}</td>
</tr>

</c:forEach>
  </tbody>
</table>

<form action="find" method="get">
<input type="text" name="bookName" placeholder="search book here">
<h3>${found}</h3><br>

<br>
<button type="submit">search songs</button>
</form>

<div style="background-color: gray; width: 500px; height:200px;">
<h3 style="color: white;">${reading.bookName}</h3><br>
<h4>${reading.authorName}</h4> <br>
<h6>${reading.content}</h6>

</div>

</body>
</html>