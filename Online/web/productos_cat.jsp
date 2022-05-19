
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
                    <form action="ControladorPD_C?menu=Producto" method="POST"  style="margin-top: 3%;"> 
                        <div class="form-group d-flex">

                            <div class="col-sm-3">

                                <label>Nombre</label>
                                <input type="text" value="${producto.getNombre()}" name="nombre"  placeholder="Nombre Producto " class="form-control">
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <button type="submit" name="accion" value="insertar"  class="btn btn-outline-primary">
                                <i class="fas fa-user-plus"></i> Guardar
                            </button>
                            <button type="submit" name="accion" value="modificar"  class="btn btn-outline-success">
                                <i class="fas fa-edit"></i> Modificar
                            </button>
                        </div>
                    </form>
                    <br>
                    <br>

                    <table  class="table table-bordered">
                        <th  class="bg-dark text-white" colspan="5"><h1><center>Lista de Categoria</center></h1></th>
                        <tr class="bg-secondary text-white">
                      
                            <th>ID</th>
                            <th>Categoria</th>
                            <th>Estado</th>
                            <th colspan="2"><center>Opciones</center></th>
                        </tr>
                        <%

                            List lis = new registroDAOPD_C().getAll();
                            ListIterator list = lis.listIterator();
                            while (list.hasNext()) {
                                registroBeensPD_C RES = (registroBeensPD_C) list.next();
                        %>
                        <tr>
                            <td class="bg-light text-dark"><%= RES.getId()%></td>
                            <td class="bg-light text-dark"><%= RES.getNombre()%></td>
                            <td class="bg-light text-dark"><%= RES.getEstado()%></td>
                            <td class="bg-light text-dark"><center><a class="btn btn-outline-warning" href="ControladorPD_C?menu=Producto&accion=cargar&id=<%=RES.getId()%>">Actualizar</a></center></td>
                            <td class="bg-light text-dark"><center><a href="ControladorPD_C?menu=Producto&accion=eliminar&id=<%=RES.getId()%>" class="btn btn-outline-danger">Borrar</a></center></td>
                        </tr>
                        <%
                            }
                        %>
                    </table>
                </div>
            </div>    
        </div>
    </body>
</html>
