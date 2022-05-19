

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
                    <form action="ControladorU?menu=Usuario" method="POST"  style="margin-top: 3%;"> 
                        <div class="form-group d-flex">

                            <div class="col-sm-3">

                                <label>Nombre</label>
                                <input type="text" value="${usuario.getNombre()}" placeholder="Ingrese Usuario " name="nombres" class="form-control">
                            </div>
                            <div class="col-sm-3">
                                <label>Contacto</label>
                                <input type="text" value="${usuario.getContact()}" name="contacto" placeholder="Ingrese Contacto" class="form-control">
                            </div>
                            <div class="col-sm-3">
                                <label>Correo</label>
                                <input type="text" value="${usuario.getEmail()}" name="correo" placeholder="Ingrese Correo" class="form-control">
                            </div>
                           <div class="col-sm-3">
                                <label>Contraseña</label>
                                <input type="password" value="${usuario.getEmail()}" name="password" placeholder="Ingrese Contraseña " class="form-control">
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
                   

                    <table class="table table-bordered">
                    <th  class="bg-dark text-white" colspan="7"><h1><center>Lista de Usuarios</center></h1></th>
                        <tr class="bg-secondary text-white">
                            <th>ID</th>
                            <th>Nombres</th>
                            <th>Conctacto</th>
                            <th>Correo</th>
                            <th>Rol</th>
                            <th colspan="2"><center>Opciones</center></th>
                        
                       
                        </tr>
                        <%
                            List lis = new registroDAO().getAll();
                            ListIterator list = lis.listIterator();
                            while (list.hasNext()) {
                                registroBeens regM = (registroBeens) list.next();

                        %>
                        <tr>

                            <td class="bg-light text-dark"><%= regM.getId()%></td>
                            <td class="bg-light text-dark"><%= regM.getNombre()%></td>
                            <td class="bg-light text-dark"><%= regM.getContact()%></td>
                            <td class="bg-light text-dark"><%= regM.getEmail()%></td>
                            <td class="bg-light text-dark"><%= regM.getRol()%></td>
                            <td class="bg-light text-dark"><center><a class="btn btn-outline-warning" href="ControladorU?menu=Usuario&accion=carga&id=<%=regM.getId()%>">Actualizar</a></center></td>
                            <td class="bg-light text-dark"><center><a href="ControladorU?menu=Usuario&accion=eliminar&id=<%=regM.getId()%>" class="btn btn-outline-danger">Borrar</a></center></td>
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

