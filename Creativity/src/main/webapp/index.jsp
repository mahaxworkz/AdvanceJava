<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
    
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h2><center> School Registration</center></h2>
<br><br>
<div class ="container d-flex justify-content-center">
<form action="save" method="post" style="text-align: justify ;">
<div class="form-floating mb-3"  >
<label for="floatingInput"> </label>
  <input type="text"  name="name" class="form-control" id="floatingInput" placeholder=" name" style="height: 100%;  ">
  
</div>
<br>
<div class="form-floating mb-3"  style="text-align: center;">
<label for="floatingInput"> </label>
  <input type="text"  name="fatherName" class="form-control" id="floatingInput" placeholder=" fathername" style="height: 50%; ">
  
</div><br>
<div class="form-floating mb-3"   >
<label for="floatingInput"> </label>
  <input type="text"  name="motherName" class="form-control" id="floatingInput" placeholder=" mother name" style="height: 100%;  ">
  
</div><br>
<div class="form-floating mb-3">
<label for="floatingInput"> </label>
  <input type="email"  name="email" class="form-control" id="floatingInput" placeholder=" Email" style="height: 100%; ">
  
</div><br>
<div class="form-floating mb-3">
<label for="floatingInput"> </label>
  <input type="date"  name="DOB" class="form-control" id="floatingInput" placeholder=" DOB" style="height: 100%;  ">
  
</div><br>
<div class="form-floating mb-3">
<label for="floatingInput"> </label>
  <input type="number"  name="phoneNo" class="form-control" id="floatingInput" placeholder="phoneNo" style="height: 100%;  ">
  
</div><br>
<div class="form-floating mb-3">
<label for="floatingInput">  </label>
  <input type="text"  name="location" class="form-control" id="floatingInput" placeholder="location"  style="height: 100%; ">
  
</div>

<br>
<button type="submit">register</button>

<h4>${save}</h4>

</form>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>


 
 
