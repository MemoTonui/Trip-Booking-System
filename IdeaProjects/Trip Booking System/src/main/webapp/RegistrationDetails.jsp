<%@ page import="com.linda.TripBookingSystemDao.Coordinator.CoordinatorDao" %>
<%@ page language="java" contentType="text/html;"%>
<!DOCTYPE html>
<html>
<head>

    <title>Insert title here</title>
</head>
<body>

<jsp:useBean id="coordinator"
             class="com.linda.TripBoookingSystemBean.Coordinator.RequestBean" />

<jsp:setProperty property="*" name="coordinator" />

<%
    CoordinatorDao coordinatorDao = new CoordinatorDao();
    int status = coordinatorDao.registerCoordinator(coordinator);
    if (status > 0) {
%>
        <h2>Suceessful</h2>
<%
        System.out.print("You are successfully registered");
    }
%>


</body>
</html>