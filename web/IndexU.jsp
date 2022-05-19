<%-- 
    Document   : IndexU
    Created on : 3/01/2022, 12:03:03 AM
    Author     : varga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <%@include file="commons/CDN(5).jsp" %>
        <link href="css/Global_U.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file="commons/Co_Usu/Cabecera_U.jsp" %>
        <div class="container-fluid">
            <div  class="row">
                <div class="col-sm-2" style="margin-left: -15px">
                    <%@include file="commons/Co_Usu/SideBar_U.jsp" %>
                </div>
                <div class="col-sm-9 main-col" >
                   <h1 class="text-center">Hola ${Usu.getNombres()}</h1>
                </div> 
            </div>
        </div>
    </body>
</html>
