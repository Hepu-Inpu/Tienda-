<%-- 
    Document   : productoC
    Created on : 10/12/2021, 02:30:02 PM
    Author     : SENA-WS-H50-1
--%>

<%@page import="beens.ProductoCBeens"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ListIterator"%>
<%@page import="DAO.ProductoCDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
        <%@include file="commons/cdn.jsp"%>
        <link rel="stylesheet" href="commons/Global.css" type="text/css">
    </head>
    <body>
         <%@include file="commons/Cabecera_1.jsp"%>
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-3 sidebar-col">
              <%@include file="commons/SideBar.jsp"%>  
             </div>
             <div class="col-sm-9 main-col">
              <form method="POST" action="ControladorP?menu=Usuario">
                <div class="form-group d-flex">
            <div class="col-sm-3">
                    <label>Nombre</label>
                    <input type="text" value="${usuario.getNombre()}" placeholder="Inserte Categoria" name="Nombre" class="form-control">
           
                    <br>
                    <button type="submit" name="accion" value="Insertar" class="btn btn-danger">Enviar</button>
                    <button type="submit" name="accion" value="modifica"  class="btn btn-dark">
                    <i class="fas fa-edit"></i> Modificar
                </button>
             </div>    
                </div>
            </form> 
                <br>
                <br>
                <h2>CATEGORIAS DE PRODUCTOS</h2>
                <table class="table table-bordered">
                    
      <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Estado</th>
        <th></th>
        <th></th>
      </tr>
         <%
        List lis = new ProductoCDAO().getAll();
        ListIterator list = lis.listIterator();
        while(list.hasNext()){
            ProductoCBeens regM = (ProductoCBeens)list.next();
        
       %>
        <tr>
      
        <td><%= regM.getId()%></td>
        <td><%= regM.getNombre()%></td>
        <td><%= regM.getEstado()%></td>
        <td><center><a class="btn btn-warning" href="ControladorP?menu=Usuario&accion=carga&id=<%=regM.getId()%>">Actualizar</a></center></td>
        <td><center><a href="ControladorP?menu=Usuario&accion=eliminar&id=<%=regM.getId()%>" class="btn btn-danger">Borrar</a></center></td>
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
