<html>
<head>
</head>
<%@page import="java.util.*"%>
<% 
Vector v=(Vector)application.getAttribute("opinion"); 

v.addElement(session.getAttribute("nombre")
+" > "+request.getParameter("opinion"));
    
%>
<body bgcolor="black" text="white">
<form action="chat_abajo.jsp" method="post">
<h2> Comentar:</h2>
<input type="text" size="30" name="opinion"> &nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Enviar">
</form>
</body>
</html>

