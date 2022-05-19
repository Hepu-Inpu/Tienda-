<%-- 
    Document   : Datos_Usu
    Created on : 5/01/2022, 01:54:00 PM
    Author     : varga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos Usuario</title>
        <%@include file="commons/CDN(5).jsp" %>
        <link rel="stylesheet" href="css/Global_U.css" type="text/css">
    </head>
    <body>
        <%@include file="commons/Co_Usu/Cabecera_U.jsp" %>
        <div class="container-fluid">
            <div  class="row">
                <div class="col-sm-1" style="margin-left: -15px">
                    <%@include file="commons/Co_Usu/SideBar_U.jsp" %>
                </div>
                <div class="col-sm-9 main-col ">
                    <center><h5>Insertar o modificar usuario</h5></center>
                    <br> 
                    <form class="border border-primary rounded-lg" action="ControladorU?menu=Datos" method="POST"  style=" margin-top: -10px;width:  1080px;">
                        <div class="form-group d-flex">
                            <div class="col-sm-3">
                                <center><label>Nombre</label></center>
                                <input type="text" value="${Usuario.getNombres()}"  name="nombres" class="form-control">
                            </div>
                            <div class="col-sm-3">
                                <center><label>Contacto</label></center>
                                <input type="text" value="${Usuario.getContacto()}" name="contacto"  class="form-control">
                            </div>
                            <div class="col-sm-3">
                                <center><label>Correo</label></center>
                                <input type="text" value="${Usuario.getCorreo()}" name="correo"  class="form-control">
                            </div>
                            <div class="col-sm-3">
                                <center><label>Contraseña</label></center>
                                <input type="text" value="${Usuario.getPass()}" name="password"  class="form-control">
                            </div>
                        </div>
                        <center><div class="col-sm-4">
                                <button type="submit" name="accion" value="Modificar"  class="btn btn-outline-success">
                                    <i class="fas fa-edit"></i> Modificar
                                </button>
                            </div></center>
                        </br>
                    </form> 
                    <table style=" margin-top: 3%;width:  1080px;" class="table table-bordered table-hover">
                        <th  class="bg-dark text-white" colspan="9">
                            <h1><center>Datos personales</center></h1>
                        <tr class=" mx-auto bg-secondary text-white"> 
                            <th><center>Nombres</center></th>
                        <th><center>Contacto</center></th>
                        <th><center>Correo</center></th>
                        <th><center>Password</center></th>
                        <th colspan="2"><center>Opciones</center></th>
                        </tr>
                        <tr>
                            <td><center>${Usu.getNombres()}</center></td>
                        <td><center>${Usu.getContacto()}</center></td>
                        <td><center>${Usu.getCorreo()}</center></td>
                        <td><center>${Usu.getPass()}</center></td>

                        <td><center><center><a href="ControladorU?menu=Datos&accion=Cargar&id=${Usu.getId()}" class="btn btn-outline-success">Actualizar</a></center></td>

                            </tr>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>