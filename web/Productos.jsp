<%-- 
    Document   : Productos
    Created on : 3/01/2022, 11:12:33 PM
    Author     : varga
--%>

<%@page import="beens.BeensCategorias"%>
<%@page import="DAO.CategoriaDAO"%>
<%@page import="beens.BeensProducto"%>
<%@page import="java.util.ListIterator"%>
<%@page import="DAO.ProductoDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Productos</title>
        <%@include file="commons/CDN(5).jsp" %>
        <link href="css/Global_P.css" rel="stylesheet" type="text/css"/>
        <%@include file="commons/Co_Admin/Cabecera_A.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <div  class="row">
                <div class="col-sm-1" style="margin-left: -15px">
                    <%@include file="commons/Co_Admin/SideBar_A.jsp" %>
                </div>
                <div class="container col-sm-9 mt-4">
                    <div class="row">
                        <form class="border border-primary rounded-lg" action="ControladorP?menu=Produ" method="POST"  style=" margin-top: -10px;width:  1080px;" enctype="multipart/form-data">
                        <div class="form-group d-flex">
                            <div class="col-sm-3">
                                <center><label>Nombre Producto</label></center>
                                <input type="text" value="${Produ.getNombres()}" name="nom" class="form-control">
                            </div>
                            <div class="col-sm-3">
                                <center><label>Cantidad de productos </label></center>
                                <input type="number" value="${Produ.getCantidad()}" name="can" class="form-control">
                            </div>
                            <div class="col-sm-3">
                                <center><label>Costo Producto</label></center>
                                <input type="number" value="${Produ.getCosto()}" name="cos" class="form-control">
                            </div>

                            <div class="col-sm-3">
                                <center><label>Categoria Perteneciente</label></center>
                                    <%--<input type="text" value="${Produ.getPro_cat_id()}" name="cat"class="form-control">--%>
                                <select value="${Produ.getPro_cat_id()}" name="cat"class="form-control">
                                    <%
                                        List Lit6 = new CategoriaDAO().getAll();
                                        ListIterator listaC = Lit6.listIterator();
                                        while (listaC.hasNext()) {
                                            BeensCategorias BeensCa = (BeensCategorias) listaC.next();
                                    %>

                                    <option value="<%= BeensCa.getId()%>"><%= BeensCa.getNombre()%></option>
                                    <%
                                        }
                                    %>
                                </select>
                            </div>  
                        </div>
                        <div class="form-group d-flex">
                            <div class="col-sm-8">
                                <center><label>Descripcion  Producto</label></center>
                                <input type="textarea" value="${Produ.getDescrip()}" name="des" class="form-control">
                            </div>
                            <div class="col-sm-4">
                                <center><label>Imagen</label></center>
                                <input type="file" name="img" value="${Produ.getImg()}"class="form-control" required>
                            </div>
                        </div>
                        <div class="form-group d-flex">
                            <div class="col-sm-3">
                                <button type="submit" name="accion" value="Insertar" class="btn btn-outline-primary">
                                    <i class="fas fa-user-plus"></i> Guardar
                                </button>
                                <button type="submit" name="accion" value="Modificar"  class="btn btn-outline-success">
                                    <i class="fas fa-edit"></i> Modificar
                                </button>
                            </div>
                        </div>
                    </form>
                    <table style=" margin-top: 3%;width:  1080px;" class="table table-bordered table-hover">
                        <th  class="bg-dark text-white" colspan="10">
                            <h1><center>Lista de productos registrados</center></h1>
                        <tr class=" mx-auto bg-secondary text-white">
                            <th><center>ID</center></th>
                    <th><center>Img</center></th>
                        <th><center>Nombre</center></th>
                        <th><center>Costo</center></th>
                        <th><center>Descripcion</center></th>
                        <th><center>Cantidad</center></th>
                        <th><center>Estado</center></th>
                        <th><center>Categoria</center></th>
                        <th colspan=2><center>Opciones</center></th>
                        </tr>      
                        <%
                            List lista = new ProductoDAO().getAll();
                            ListIterator list = lista.listIterator();
                            while (list.hasNext()) {
                                BeensProducto DaP = (BeensProducto) list.next();
                        %>
                        <tr>
                            <td><%= DaP.getId()%></td>
                            <td><img src="ControlImg?id=<%= DaP.getId()%>" style="width: 90px; height: 90px;"/></td>
                            <td><%= DaP.getNombres()%></td>
                            <td><%= DaP.getCosto()%></td>
                            <td><%= DaP.getDescrip()%></td>
                            <td><%= DaP.getCantidad()%></td>
                            <td><%= DaP.getEstado()%></td>
                            <td><%= DaP.getPro_cat_id()%></td>  
                            <td><center><a href="ControladorP?menu=Produ&accion=Cargar&id=<%= DaP.getId()%>" class="btn btn-outline-success">Actualizar</a></center></td>
                        <td><center><a href="ControladorP?menu=Produ&accion=Borrar&id=<%= DaP.getId()%>" class="btn btn-outline-danger">Borrar</a></center></td>
                        </tr>
                        <%
                            }
                        %>
                </div>
            </div>
        </div>
    </body>
</html>

