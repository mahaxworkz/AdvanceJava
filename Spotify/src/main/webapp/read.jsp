<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read</title>
</head>
<body>
<form action="find" method="get">
 <input type="text" name="name" placeholder="search name here">
 <h5>${NoResult}</h5>
 <h5>${isvalid}</h5> 

<button type="submit">Search</button>
</form>


<table border="1">
<th>SongName</th>
<th>ArtistName</th>
<th>ReleasedIn</th>
<th>Rating</th>
<th>Album</th>

<tr>
<td>${check.songName}</td>
<td>${check.artistName}</td>
<td>${check.releasedIn}</td>
<td>${check.rating}</td>
<td>${check.album}</td>


</tr>

</table>






<form action="read" method="get">
<button type="submit">view songs</button>
</form>
<table border="1">
<th>SongName</th>
<th>ArtistName</th>
<th>ReleasedIn</th>
<th>Rating</th>
<th>Album</th>
<c:forEach var="list" items="${listing}">
<tr>
<td>${list.songName}</td>
<td>${list.artistName}</td>
<td>${list.releasedIn}</td>
<td>${list.rating}</td>
<td>${list.album}</td>
</tr>

</c:forEach>
</table>
</body>
</html>