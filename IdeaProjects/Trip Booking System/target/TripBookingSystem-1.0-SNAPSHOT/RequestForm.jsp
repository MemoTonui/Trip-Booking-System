<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 7/30/2021
  Time: 12:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    <title>Request Form</title>
</head>
<body>
<header>
    <nav class="navbar navbar-dark text-white " style="background: black">
        <div class="container">
        <div><h5>Welcome &#128522</h5></div>
        <div class="right p-4">
            <a href="">View Bus Schedule</a>
        </div>
        </div>
    </nav>
</header>



<div class="col-md-7 p-3" style="margin-left: 23%">
    <h3 class="text-center mt-3">Trip Request Form</h3> <hr>
    <p class="text-center">  Please Fill the form below to request for a trip.</p>
    <form  class="mt-5" style="alignment: center" method="post">
        <table style="width: 80%" class="ml-5 col-md-12">
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
                <td>Faculty:</td>
                <td><input class="form-control" type="text" name="faculty" /></td>
            </tr>
            <tr>
                <td>Department:</td>
                <td><input class="form-control" type="text" name="department" /></td>
            </tr>
            <tr>
                <td>Location:</td>
                <td><input class="form-control" type="text" name="location" /></td>
            </tr>
            <tr>
                <td>Students:</td>
                <td><input class="form-control" type="number" name="students" /></td>
            </tr>
            <tr>
                <td>Staff:</td>
                <td><input class="form-control" type="number" name="staff" /></td>
            </tr>
            <tr>
                <td>Date of Departure:</td>
                <td><input class="form-control" type="date" name="departure" /></td>
            </tr>
            <tr>
                <td>Date of Arrival Back:</td>
                <td><input class="form-control" type="date" name="arrival" /></td>
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
