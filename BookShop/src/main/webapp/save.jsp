<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Saving</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<h3 style="color: red;"><center>Saving book</center>      </h3>

<br>
<h4>${save}</h4>
<h4>${check}</h4>
<form action="save" method="post">
<div class="form-floating mb-3">
<label for="floatingInput">Book Name</label>
  <input type="text"  name="bookName" class="form-control" id="floatingInput" placeholder=" Book name">
  
</div>
<h4>${isbookvalid}</h4>
<div class="form-floating mb-3">
 <label for="floatingInput">Author Name</label>
  <input type="text"  name="authorName" class="form-control" id="floatingInput" placeholder=" author Name">
 
</div>
<h4>${isauthorvalid}</h4>
<div class="form-floating mb-3">
<label for="floatingInput">publisher Name</label>
  <input type="text"  name="publisher" class="form-control" id="floatingInput" placeholder=" publisher">
  
</div>
<h4>${ispublishervalid}</h4>


<div class="form-floating mb-3">
 <label for="floatingInput">publishedin</label>
  <input type="number"  name="publishedin" class="form-control" id="floatingInput" placeholder="publishedin">
 
</div><br>
<h4>${isyearvalid}</h4>
<div class="form-floating mb-3">
<label for="floatingInput">language</label>
  <input type="text"  name="language" class="form-control" id="floatingInput" placeholder="language">
  
</div>
<h4>${isLangvalid}</h4>
<div class="form-floating mb-3">
<label for="floatingInput">content</label>
  <input type="text"  name="content" class="form-control" id="floatingInput" placeholder="content">
  
</div>
<h4>${iscontentvalid}</h4>
 
  
 
 <br> >
 <button type="submit">Create BookList</button>
</form>


</body>
</html>