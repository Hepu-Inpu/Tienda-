<%-- 
    Document   : Administrador
    Created on : 2/01/2022, 07:07:18 PM
    Author     : varga
--%>

<%@page import="beens.RegistroBeens"%>
<%@page import="java.util.ListIterator"%>
<%@page import="DAO.RegistroDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Usuarios</title>
        <%@include file="commons/CDN(5).jsp" %>
        <link href="css/Global_A.css" rel="stylesheet" type="text/css"/>
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
                            <form class="border border-primary rounded-lg" action="ControladorA?menu=Admin" method="POST">
                                <div class="form-group d-flex">
                                    <div class="col-sm-3">
                                        <center><label>Nombre</label></center>
                                        <input type="text" value="${datos.getNombres()}"  name="nombres" class="form-control">
                                    </div>
                                    <div class="col-sm-3">
                                        <center><label>Contacto</label></center>
                                        <input type="text" value="${datos.getContacto()}" name="contacto"  class="form-control">
                                    </div>
                                    <div class="col-sm-3">
                                        <center><label>Correo</label></center>
                                        <input type="text" value="${datos.getCorreo()}" name="correo"  class="form-control">
                                    </div>
                                    <div class="col-sm-3">
                                        <center><label>Contraseña</label></center>
                                        <input type="text" value="${datos.getPass()}" name="password"  class="form-control">
                                    </div>
                                </div>
                                <center>
                                    <div class="col-sm-4 mb-3">
                                        <button type="submit" name="accion" value="guardar"  class="btn btn-outline-primary">
                                            <i class="fas fa-user-plus"></i> Guardar
                                        </button>
                                        <button type="submit" name="accion" value="modificar"  class="btn btn-outline-success">
                                            <i class="fas fa-edit"></i> Modificar
                                        </button>
                                    </div>
                                </center>
                            </form>
                            <table class="table table-bordered table-hover mt-4">
                                <th  class="bg-dark text-white" colspan="9">
                                    <h1 class="text-center">Lista de usuarios registrados</h1>
                                <tr class=" mx-auto bg-secondary text-white">                                    
                                    <th><center>ID</center></th>
                                <th><center>Nombres</center></th>
                                <th><center>Contacto</center></th>
                                <th><center>Correo</center></th>
                                <th><center>Password</center></th>
                                <th><center>rol</center></th>
                                <th colspan="2"><center>Opciones</center></th>
                                </tr>
                                <%

                                    List lista = new RegistroDAO().getAll();
                                    ListIterator list = lista.listIterator();
                                    while (list.hasNext()) {
                                        RegistroBeens reM = (RegistroBeens) list.next();
                                %>
                                <tr>
                                    <td><center><%= reM.getId()%></center></td>
                                <td><center><%= reM.getNombres()%></center></td>
                                <td><center><%= reM.getContacto()%></center></td>
                                <td><center><%= reM.getCorreo()%></center></td>
                                <td><center><%= reM.getPass()%></center></td>
                                <td><center><%= reM.getRol()%></center></td>
                                <td><center><a href="ControladorA?menu=Admin&accion=cargar&id=<%= reM.getId()%>" class="btn btn-outline-success">Actualizar</a></center></td>
                                <td><center><a href="ControladorA?menu=Admin&accion=borrar&id=<%= reM.getId()%>" class="btn btn-outline-danger">Borrar</a></center></td>
                                </tr>
                                <%
                                    }
                                %>
                            </table>

                        </div>

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
