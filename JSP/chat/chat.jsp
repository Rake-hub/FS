<html>
<head>
</head>
<%@ page import="java.util.*" %>

<% 	
	Vector v=new Vector();

session.putValue("nombre",request.getParameter("nombre")); 
application.setAttribute("opinion",v); 
%>
<frameset rows="80%,*">
    <frame src="chat_arriba.jsp" noresize="noresize">
    <frame src="chat_abajo.jsp" noresize="noresize">
</frameset>
</html>    