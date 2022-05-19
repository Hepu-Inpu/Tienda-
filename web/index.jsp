<%@page import="DAO.ProductoDAO"%>
<%@page import="beens.BeensProducto"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tienda V</title>
        <%@include file="commons/CDN(4).jsp"%>
        <link rel="stylesheet" href="css/Globales.css" type="text/css">
    </head>
    <body>
        <%@include file="commons/Cabecera.jsp" %>
        <div class="container-fluid">
            <div class="row">
                <div class="container col-sm-11 mt-3">
                    <div class="row">
                        <%
                            List lis = new ProductoDAO().getAll();
                            ListIterator list = lis.listIterator();
                            while (list.hasNext()) {
                                BeensProducto Produ = (BeensProducto) list.next();

                        %>
                        <div class="col-sm-3 mt-3">
                            <div class="card">
                                <div class="card-header text-center">
                                    <%= Produ.getNombres()%>
                                </div>
                                <div class="card-body">
                                    <center><img src="ControlImg?id=<%= Produ.getId()%>" style="width: 90px; height: 90px;"/></center>
                                </div>
                                <div class="card-footer text-center">
                                    <%= Produ.getDescrip()%>
                                    <div class="mt-3">
                                        <center><a  href="Loguin.jsp"  class="btn btn-primary">
                                                <i class="fas fa-user-plus"></i> Carrito
                                            </a>
                                            <a  href="Loguin.jsp"  class="btn btn-success">
                                                <i class="fas fa-user-plus"></i> Comprar
                                            </a></center>
                                    </div>
                                </div>
                            </div> 
                        </div>
                        <% }%>
                    </div>           
                </div> 
            </div>
        </div>
        <%@include file="commons/Pie.jsp" %>
    </body>
</html>
