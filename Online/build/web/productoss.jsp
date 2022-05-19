<%-- 
    Document   : productos
    Created on : 15/12/2021, 09:54:36 AM
    Author     : SENA-WS-H50-1
--%>





<%@page import="DAO.ProductoCDAO"%>
<%@page import="beens.ProductoCBeens"%>
<%@page import="beens.ProductoBeens"%>


<%@page import="DAO.ProductoDAO"%>

<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
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
        <form action="ControladorPP?menu=Producto" method="POST"> 
            <div class="form-group d-flex">
                
                <div class="col-sm-3">
                   
                    <label>Nombres</label>
                    <input type="text"  name="Nombre" class="form-control">
                     <label>Cantidad</label>
                    <input type="text"  name="Can" class="form-control">
                </div>
                <div class="col-sm-3">
                    <label>Costo</label>
                    <input type="text"  name="Costo" class="form-control">
                </div>
                 <div class="col-sm-3">
                    <label>Seleccionar categoria</label>
                    <select name="produ_catego_id" class="form-control">
                        <% 
                        List lis = new ProductoCDAO().getAll();
                        ListIterator list = lis.listIterator();
                        while(list.hasNext()){
                         ProductoCBeens li = (ProductoCBeens) list.next();   
                        
                        %>
                        
                        <option value="<%=li.getId()%>"><%= li.getNombre()%></option>
                        <%
                            }
                        %>
                    </select>
                </div>
            </div>
                <button type="submit" name="accion" value="insertar" class="btn btn-danger">
                    <i class="fas fa-user-plus"></i> Guardar
                </button>
                <button type="submit" name="accion" value="modifica"  class="btn btn-dark">
                    <i class="fas fa-edit"></i> Modificar
                </button>
                <div class="row">
                <div class="col-sm-12">
                    <label>Descripcion</label>
                    <textarea name="Desc" id="descr" class="form-control"></textarea>
                </div>
                </div>
        </form>
                

       
    </div>
    </div>    
    </div>
    </body>
</html>
