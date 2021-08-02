<%--
  Created by IntelliJ IDEA.
  User: jared
  Date: 7/30/21
  Time: 3:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>Transport Officer Login</title>
    <link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Redressed&display=swap" rel="stylesheet">
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet"/>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"/>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js">
    </script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js">
    </script>
</head>

<body style="box-sizing:border-box; font-family: 'Poppins', sans-serif;font-size:13px">


<nav class="navbar navbar-light">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand navbar-text navbar-left" href="#">

            </a>

        </div>
    </div>
</nav>
<div class="container ">

    <div class="w3-card p-5 ">
        <div class="text-center">
            <h3 style="color:#00758F">Transport Officer Login </h3> <hr>
        </div>

        <form action="<%=request.getContextPath()%>/TransportOfficerLoginServlet" method="post">
            <div class="input-group m-4 ">

                    <input type="text" class="form-control"  name="email" id="email" placeholder="John Doe" aria-describedby="at" required>

                </div>


                <div class="input-group m-4 ">
                    <input type="password" class="form-control" name="password" placeholder="Password" aria-describedby="lock" required>
                </div>

                <div class="m-4">
                    <small>Are you New?<a href="/register"> Click here to Register</a></small>
                </div>
                <div class="m-4" >

                    <button style="width:25%;margin-right:250px;background:#00758F;border:none" class="btn btn-dark rounded-pill p-2"><a class="text-white" href="@{/LoginAdmin}">Login As Admin</a></button>

                    <button type="submit" style="width:25%;border:none" class="btn btn-dark rounded-pill p-2 ">Log In</button>
                </div>





        </form>
    </div>

</div>

</body>
</html>
