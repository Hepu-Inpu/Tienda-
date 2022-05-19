<%-- 
    Document   : Carrito
    Created on : 13/01/2022, 09:35:10 PM
    Author     : varga
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="beens.BeensProducto"%>
<%@page import="java.util.ListIterator"%>
<%@page import="DAO.CarritoDAO"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carrito</title>
        <%@include file="commons/CDN(5).jsp"%>
        <link rel="stylesheet" href="css/Global_U.jsp" type="text/css">
        <%@include file="commons/Co_Usu/Cabecera_U.jsp"%>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-1" style="margin-left: -15px">
                    <div>
                        
                    <%@include file="commons/Co_Usu/SideBar_U.jsp" %>
                    </div>
                </div>
                <div class="col-sm-8 mt-4" style="margin-left:-40px">
                    <div class="row">
                        <div class="table-responsive">

                            <table class="table table-hover table table-bordered">
                                <thead>
                                    <tr>
                                        <th>Img</th>
                                        <th>Producto</th>
                                        <th>Descripcion</th>
                                        <th>Categoria</th>
                                        <th>Cantidad</th>
                                        <th colspan="2"><center>Opciones</center></th>
                                </tr>
                                </thead>
                                <%
                                    int IdUsr = Integer.parseInt(request.getParameter("idU"));
                                    List lis = new CarritoDAO().getAll(IdUsr);
                                    ListIterator list = lis.listIterator();
                                    while (list.hasNext()) {
                                        BeensProducto Produ = (BeensProducto) list.next();

                                %>
                                <tr>
                                    <td><img src="ControlImg?id=<%= Produ.getPro_cat_id()%>" style="width: 90px; height: 90px;"/></td>
                                    <td><%= Produ.getNombres()%></td>
                                    <td><%= Produ.getDescrip()%></td>
                                    <td><%= Produ.getPro_cat_id()%></td>

                                    <td class="col-sm-2"><input type="number" min="1" value="1" class="form-control"></td>
                                    <td><center><a data-bs-toggle="modal" data-bs-target="#myModal" class="btn btn-outline-danger">Borrar</a></center></td>

                                <!-- The Modal -->
                                <center> <div class="modal" id="myModal">
                                        <div class="modal-dialog modal-dialog-centered ">
                                            <div class="modal-content">

                                                <!-- Modal body -->
                                                <div class="modal-body  border border-5 border-primary ">
                                                    Seguro que quieres eliminar este producto
                                                    <div>
                                                         <a type="button"  class="btn btn-outline-danger mt-2 col-sm-2"data-bs-dismiss="modal">No</a>
                                                    <a href="ControladorCar?accion=Carr&menu=eliminar&id=<%= Produ.getId()%>&idU=${Usu.getId()}" class="btn btn-outline-primary mt-2 col-sm-2"> Si </a>
                                                    </div>
                                                   
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </center>

                                </tr>
                                <%
                                    }
                                %>
                            </table>


                        </div>


                    </div>
                </div>
                <div class="col-sm-3 mt-4">
                    <div class="position-fixed col-sm-3" >
                        <div class="card">
                            <div class="card-header" >
                                <h3>Hacer Compra</h3>
                            </div>
                            <div class="card-body">
                                <label>SubTotal:</label>
                                <input type="text" value="COP.${totalpagar}" readonly="" class="form-control">
                                <label>Total a Pagar:</label>

                                <input type="text" value="COP.${totalpagar}" readonly="" class="form-control">
                            </div>
                            <div class="card-footer">
                                <a class="w3-button w3-black">Comprar</a>
                                <a href="ControladorCar?accion=Carr&menu=mostrar&idU=${Usu.getId()}" class="w3-button w3-black">Añadir otro Producto</a>
                            </div>
                        </div>
                    </div>
                </div>


            </div>

        </div>
    </body>
</html>

