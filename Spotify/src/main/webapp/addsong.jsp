<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Song</title>
</head>
<body>
<form action="add" method="post">

<input type="text" name="songName" placeholder="Song Name">
<br>
<h4>${IsSongValid}</h4>
<br>
<input type="text" name="ArtistName" placeholder="Artist Name">
<br>
<h4>${IsArtistnameValid}</h4><br>
<input type="number" name="releasedIn" placeholder="releasedIn">
<br><h4>${IsYearValid}</h4>
<br>
<input type="number" name="rating" placeholder="rating">
<br><h4>${IsratingValid}</h4><br>
<input type="text" name="album" placeholder="album">
<br><h4>${IsAlbumValid}</h4><br>

<button type="submit">submit</button>
</form>






</body>
</html>