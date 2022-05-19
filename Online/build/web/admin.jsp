<%-- 
    Document   : usuarios
    Created on : 22/11/2021, 02:38:01 PM
    Author     : SENA-WS-H50-1
--%>

<%@page import="beens.registroBeens"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page import="DAO.registroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
        <%@include file="commons/cdn.jsp"%>
        <link rel="stylesheet" href="commons/co_usuario/GlobalU.css" type="text/css">
    </head>
    <body>
         <%@include file="commons/co_usuario/CabeceraU.jsp"%>
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-3 sidebar-col">
              <%@include file="commons/co_usuario/SideBarU.jsp"%>  
            </div>
    <div class="col-sm-9 main-col">
      
        <center><h1>Bienvenido señor ${admin.getNombre()} </h1></center>
        <center><img src="img/SRV.png" alt=""/></center>
        
        <center><h1>Que desea hacer hoy</h1></center>
    </div>
    </div>    
    </div>
    </body>
</html>
