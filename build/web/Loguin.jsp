<%-- 
    Document   : Loguin
    Created on : 29/12/2021, 07:46:47 PM
    Author     : Vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Loguin</title>
        <%@include file="commons/CDN(4).jsp"%>
        <link rel="stylesheet" href="css/Globales.css" type="text/css"/>
    </head>
    <body>
        <%@include file="commons/Cabecera.jsp"%>
        <br>
        <div class="container mt-4 col-lg-4">
            <div class="border border-info col-sm-10 rounded">
                <div class="card-body">
                    <form action="ValidarIngreso"  method="POST">
                        <center><img src="img/usr.png"  alt="0" width="170"/></center>
                        <h1 class="text-center">Login</h1>
                        <!--Input de usuario con name="usr"-->
                        <div class="form-floating mb-3 mt-4">
                            <input type="text" class="form-control" id="usu" placeholder="Ingrese usuario" name="usr" required>
                            <label for="usu">Ingrese Usuario</label>
                        </div>
                        <!--Input de password con name="pswd"-->
                        <div class="form-floating mb-4 mt-1">
                            <input type="password" class="form-control" id="pass" placeholder="Ingrese usuario" name="pswd" required>
                            <label for="pass">Ingrese Contraseña</label>
                        </div>
                        <center><button type="submit" name="accion" value="ingresar" class="btn btn-primary">Iniciar</button></center>
                    </form>
                    <br>
                </div>
            </div>
        </div>
    </body>
</html>   