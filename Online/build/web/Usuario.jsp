

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
        <link rel="stylesheet" href="commons/co_usuarioO/GlobalUO.css" type="text/css">
    </head>
    <body>
        <%@include file="commons/co_usuarioO/CabeceraUO.jsp"%>
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-3 sidebar-col">
                    <%@include file="commons/co_usuarioO/SideBarUO.jsp"%>  
                </div>
                 <div class="col-sm-9 main-col">
                <center><h1>Bienvenido al himalaya  ${usu.getNombre()} </h1></center>
                <center><img src="img/BVN.jpg" alt=""/></center>
                </div> 
            </div> 
        </div>
    </body>
</html>

