<%@page import="DAO.CategoriaDAO"%>
<%@page import="beens.BeensCategorias"%>
<%@page import="beens.BeensProducto"%>
<%@page import="DAO.ProductoDAO"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos</title>
        <%@include file="commons/CDN(5).jsp"%>
        <link rel="stylesheet" href="css/Global_U.jsp" type="text/css">
        <%@include file="commons/Co_Usu/Cabecera_U.jsp"%>
    </head>
    <body>
        <div class="container-fluid">
            <div  class="row">
                <div class="col-sm-1" style="margin-left: -15px">
                    <div>
                        <%@include file="commons/Co_Usu/SideBar_U.jsp" %>
                    </div>                   
                </div>
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
                                    <center><img src="ControlImg?id=<%= Produ.getId()%>" style="width: 250px; height: 200px;"/></center>
                                </div>
                                <div class="card-footer text-center">
                                    <%= Produ.getDescrip()%>
                                    <div class="mt-3">
                                        <center><a  href="ControladorCar?accion=Carr&menu=Agregar&id=<%= Produ.getId()%>&idU=${Usu.getId()}"  class="btn btn-primary">
                                                <i class="fas fa-user-plus"></i> Carrito
                                            </a>
                                            <a  href="ControladorCarrito?accion=Carr&menu=Agregar"  class="btn btn-success">
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
    </body>
</html>
