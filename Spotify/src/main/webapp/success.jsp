<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<div class="card text-bg-dark">
  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSh1x38PbWtoQNgveV-f4z_L2XfmmFVPcGLzzg3RHQ8xCLrQ2Ia6jspRuP9l6MdUu5Doas&usqp=CAU" class="card-img" alt="im">
  <div class="card-img-overlay">
    <h3 class="card-title">${save.album}</h3>
    <h4  class="card-text">Details of the song </h4>
    <h5> ${save.songName} is singing by ${save.artistName}</h5>
    <br>
    <h5> Song released in ${save.releasedIn}</h5>
    
  </div>
</div>
 

</body>
</html>