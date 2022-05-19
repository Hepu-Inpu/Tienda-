<%-- 
    Document   : Catego_productos
    Created on : 4/01/2022, 06:45:16 PM
    Author     : varga
--%>

<%@page import="beens.BeensCategorias"%>
<%@page import="java.util.ListIterator"%>
<%@page import="DAO.CategoriaDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Categorias</title>
       
   
        <%@include file="commons/CDN(5).jsp" %>
        <link rel="stylesheet" href="css/Global_P.css" type="text/css">
        
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
                        <form class="border border-primary rounded-lg" action="ControladorCategorias?menu=Cat" method="POST"  style=" margin-top: -10px;width:  1080px;">
                            <div class="form-group d-flex">
                                <div class="col-sm-3">
                                    <center><label>Nombre Categoria</label></center>
                                    <input type="text" name="nomCat" value="${cat.getNombre()}" class="form-control">
                                </div>
                                <div class="col-sm-4 mt-4">
                                    <button type="submit" name="accion" value="Insertar" class="btn btn-outline-primary">
                                        Guardar
                                    </button>
                                    <button type="submit" name="accion" value="Modificar"  class="btn btn-outline-success">
                                        Modificar
                                    </button>
                                </div>
                            </div>
                        </form>
                        <table class="table table-bordered table-hover mt-4">
                            <th  class="bg-dark text-white" colspan="9">
                                <h1><center>Lista de categorias registradas</center></h1>
                            <tr class=" mx-auto bg-secondary text-white">           
                                <th><center>Id</center></th>
                            <th><center>Nombre Categoria</center></th>
                            <th><center>Estado</center></th>
                            <th colspan="2"><center>Opciones</center></th>
                            </tr>
                            <%
                                List lis = new CategoriaDAO().getAll();
                                ListIterator list = lis.listIterator();
                                while (list.hasNext()) {
                                    BeensCategorias BeensCat = (BeensCategorias) list.next();

                            %>
                            <tr>
                                <td><%= BeensCat.getId()%></td>
                                <td><%= BeensCat.getNombre()%></td>
                                <td><%= BeensCat.getEstado()%></td>
                                <td><center><center><a href="ControladorCategorias?menu=Cat&accion=Cargar&id=<%= BeensCat.getId()%>" class="btn btn-outline-success">Actualizar</a></center></td>
                                <td><center><center><a href="ControladorCategorias?menu=Cat&accion=Borrar&id=<%= BeensCat.getId()%>" class="btn btn-outline-danger">Borrar</a></center></td>
                                    </tr>
                                    <%
                                        }
                                    %>
                                    </table>
                                    </div>
                                    </div>



                                    <div class="col-sm-9 main-col">


                                    </div>
                                    </div>
                                    </div>
                                    </body>
                                    </html>
