
<%@page import="beens.registroBeensP"%>
<%@page import="DAO.registroDAOP"%>
<%@page import="DAO.registroDAOPD_C"%>
<%@page import="beens.registroBeensPD_C"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos</title>
        <%@include file="commons/cdn.jsp"%>
        <link rel="stylesheet" href="commons/co_productos/GlobalP.css" type="text/css">
    </head>
    <body>
        <%@include file="commons/co_productos/CabeceraP.jsp"%>
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-3 sidebar-col">
                    <%@include file="commons/co_productos/SidebarP.jsp"%>  
                </div>

                <div class="col-sm-9 main-col">
                    <form action="ControladorP?menu=Producto" method="POST"  style="margin-top: 3%;"> 
                        <div class="form-group d-flex">

                            <div class="col-sm-3">

                                <label>Nombres</label>
                                <input type="text"  value="${producto.getNombre()}" name="Nombre" class="form-control">
                            </div>
                            <div class="col-sm-3">
                                <label>Cantidad</label>
                                <input type="text"  value="${producto.getCantidad()}" name="Can" class="form-control">
                            </div>
                            <div class="col-sm-3">
                                <label>Costo</label>
                                <input type="text" value="${producto.getCosto()}"  name="Costo" class="form-control">
                            </div>

                            <div class="col-sm-3">
                                <label>Seleccionar categoria</label>
                                <select value="${producto.getProd_cat_id()}"name="categoria" class="form-control">
                                    <%
                                        List lis = new registroDAOPD_C().getAll();
                                        ListIterator list1 = lis.listIterator();
                                        while (list1.hasNext()) {
                                            registroBeensPD_C li = (registroBeensPD_C) list1.next();

                                    %>
                                    <option value="<%=li.getId()%>"><%= li.getNombre()%></option>
                                    <%
                                        }
                                    %>
                                </select>
                            </div>  
                        </div>
                        <div class="form-group d-flex">

                            <div class="col-sm-12">
                                <label>Descripcion</label>
                                <input type="textarea" name="Desc" value="${producto.getDesc()}"id="desc" class="form-control">
                            </div>
                        </div>
                        <div class="form-group d-flex">
                            <div class="col-sm-3">
                            <button type="submit" name="accion" value="insertar" class="btn btn-outline-primary">
                                <i class="fas fa-user-plus"></i> Guardar
                            </button>
                            <button type="submit" name="accion" value="modifica"  class="btn btn-outline-success">
                                <i class="fas fa-edit"></i> Modificar
                            </button>
                        </div>
                            </div>
                    </form>
                    <table class="table table-bordered ">
                        <th  class="bg-dark text-white" colspan="9"><h1><center>Lista de Productos</center></h1></th>
                        <tr class="bg-secondary text-white">
                            <th>ID</th>
                            <th>Nombres</th>
                            <th>Costo</th>
                            <th>Descripcion</th>
                            <th>Cantidad</th>
                            <th>Estado</th>
                            <th>Categoria</th>
                            <th colspan="2"><center>Opciones</center></th>


                        </tr>
                        <%
                            List li = new registroDAOP().getAll();
                            ListIterator list = li.listIterator();
                            while (list.hasNext()) {
                                registroBeensP regM = (registroBeensP) list.next();

                        %>
                        <tr>

                            <td class="bg-light text-dark"><%= regM.getId()%></td>
                            <td class="bg-light text-dark"><%= regM.getNombre()%></td>
                            <td class="bg-light text-dark"><%= regM.getCosto()%></td>
                            <td class="bg-light text-dark"><%= regM.getDesc()%></td>
                            <td class="bg-light text-dark"><%= regM.getCantidad()%></td>
                            <td class="bg-light text-dark"><%= regM.getEstado()%></td>
                            <td class="bg-light text-dark"><%= regM.getProd_cat_id()%></td>
                            <td class="bg-light text-dark"><center><a class="btn btn-outline-warning" href="ControladorP?menu=Producto&accion=carga&id=<%=regM.getId()%>">Actualizar</a></center></td>
                        <td class="bg-light text-dark"><center><a href="ControladorP?menu=Producto&accion=eliminar&id=<%=regM.getId()%>" class="btn btn-outline-danger">Borrar</a></center></td>
                        </tr>
                        <%
                            }
                        %>
                    </table>

                </div>

                <br>
                <br>
            </div>
        </div>    

    </body>
</html>
