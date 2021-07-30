<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

    <title>Coordinator Registration</title>
</head>

<body class="container">
<nav>
    <div class="p-4 m-3" >

    </div>
</nav>

<div class="card col-md-8 p-3" style="margin-left: 20%">
    <h3 class="text-center">Coordinator Registration</h3> <hr>
<form action="login.jsp" class="mt-5" style="alignment: center" method="post">
    <table style="width: 70%" class="ml-5 col-md-12">
        <tr>
            <td>First Name:</td>
            <td><input class="form-control" type="text" name="first_name" /></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><input class="form-control" type="text" name="last_name" /></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input class="form-control" type="email" name="email" /></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input class="form-control" type="password" name="password" /></td>
        </tr>
      <tr>
          <td>Confirm Password:</td>
          <td>
              <input class="form-control" type="password" name="password" />
          </td>
      </tr>
        <tr>
            <td></td>
            <td> <button class="btn btn-dark mt-4 form-control" type="submit" value="Submit"> Submit</button></td>
        </tr>
    </table>

    </form>
</div>
</body>
</html>