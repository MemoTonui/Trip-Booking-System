<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    <title>Insert title here</title>
</head>
<body class="container">
<nav>
    <div class="p-5 m-5" >

    </div>
</nav>
<div align="center" class="card p-5 col-md-8 " style="margin-left: 20%">
    <h2 class="mb-3">Coordinator Login </h2> <hr>
    <!--action="<%=request.getContextPath()%>/login"-->
    <form action="<%=request.getContextPath()%>/RequestForm.jsp" method="post">
        <table style="width: 50%" class="">
            <tr>
                <td>Email:</td>
                <td><input class="p-2 form-control" placeholder="Enter Your Email Address" type="text" name="email" /></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input class="p-2 form-control" placeholder="Enter your password" type="password" name="password" /></td>
            </tr>
            <tr>
                <td></td>
                <td><button class="btn form-control btn-outline-dark mt-5 full-width"type="submit" value="Submit">Submit</button>
                </td>
            </tr>

        </table>
         </form>
</div>
</body>
</html>