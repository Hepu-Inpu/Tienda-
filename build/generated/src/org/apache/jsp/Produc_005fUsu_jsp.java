package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.CategoriaDAO;
import beens.BeensCategorias;
import beens.BeensProducto;
import DAO.ProductoDAO;
import java.util.ListIterator;
import java.util.List;

public final class Produc_005fUsu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/commons/CDN(5).jsp");
    _jspx_dependants.add("/commons/Co_Usu/Cabecera_U.jsp");
    _jspx_dependants.add("/commons/Co_Usu/SideBar_U.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Productos</title>\n");
      out.write("        ");
      out.write("<link rel=\"shortcut icon\" type=\"image/png\" href=\"img/astro2.png\"/>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("<!------------------------------------------------------------------------------------------------->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<!------------------------------------------------------------------------------------------------->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Global_U.jsp\" type=\"text/css\">\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css\">\n");
      out.write("<nav class=\"navbar navbar-expand-sm navbar-light sticky-top\" style=\"background: #6AFB92\">\n");
      out.write("    <!-- Brand -->\n");
      out.write("    <a class=\"navbar-brand active h5\" href=\"index.jsp\">Tienda V</b></a>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<!--%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%      BOTONES INICIO Y PRODUCTOS         %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%-->\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link h6\" href=\"IndexU.jsp\">Inicio</a> \n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("<!-- %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%          CARRITO             %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%-->\n");
      out.write("    <a class=\"navbar-brand h5\" href=\"ControladorCar?accion=Carr&menu=Carrito&idU=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"50\" height=\"25\" fill=\"currentColor\" class=\"bi bi-cart4\" viewBox=\"0 0 1 16\">\n");
      out.write("            <path d=\"M0 2.5A.5.5 0 0 1 .5 2H2a.5.5 0 0 1 .485.379L2.89 4H14.5a.5.5 0 0 1 .485.621l-1.5 6A.5.5 0 0 1 13 11H4a.5.5 0 0 1-.485-.379L1.61 3H.5a.5.5 0 0 1-.5-.5zM3.14 5l.5 2H5V5H3.14zM6 5v2h2V5H6zm3 0v2h2V5H9zm3 0v2h1.36l.5-2H12zm1.11 3H12v2h.61l.5-2zM11 8H9v2h2V8zM8 8H6v2h2V8zM5 8H3.89l.5 2H5V8zm0 5a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0zm9-1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0z\"/>\n");
      out.write("        </svg>\n");
      out.write("        <i class=\"fas fa-cart-plus\">(<label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>)</i>\n");
      out.write("    </a>\n");
      out.write("    \n");
      out.write("<!--%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%          DROPDOWN         %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  -->\n");
      out.write("    <div class=\"dropdown dropleft\" style=\"cursor:pointer;\">\n");
      out.write("        <a class=\"navbar-brand \" data-toggle=\"dropdown\">\n");
      out.write("            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"29\" height=\"29\" fill=\"currentColor\" class=\"bi bi-person-circle\" viewBox=\"0 0 16 16\">\n");
      out.write("                <path d=\"M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z\"/>\n");
      out.write("                <path fill-rule=\"evenodd\" d=\"M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z\"/>\n");
      out.write("            </svg>\n");
      out.write("        </a>\n");
      out.write("        <div  style=\" width:200px;\" class=\"dropdown-menu\">\n");
      out.write("            <center><img src=\"img/PFL.png\"  style=\"width:100px;\"></center>\n");
      out.write("            <center><a>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Usu.getNombres()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></center>\n");
      out.write("            <div class=\"dropdown-divider\"></div>\n");
      out.write("            <center><a class=\"dropdown-item\" href=\"index.jsp\">Cerrar Sesion</a></center>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div  class=\"row\">\n");
      out.write("                <div class=\"col-sm-1\" style=\"margin-left: -15px\">\n");
      out.write("                    ");
      out.write("<div class=\"w3-sidebar w3-bar-block\" style=\"display:none;z-index:5\" id=\"mySidebar\">\n");
      out.write("  <a href=\"Datos_Usu.jsp\" class=\"w3-bar-item w3-button\">Datos</a>\n");
      out.write("  <a href=\"Produc_Usu.jsp\" class=\"w3-bar-item w3-button\">Productos</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Overlay -->\n");
      out.write("<div class=\"w3-overlay\" onclick=\"w3_close()\" style=\"cursor:pointer\" id=\"myOverlay\"></div>\n");
      out.write("\n");
      out.write("<!-- Page content -->\n");
      out.write("<button class=\"w3-button w3-xlarge\" onclick=\"w3_open()\">&#9776;</button>\n");
      out.write("<!-- JS to open and close sidebar with overlay effect -->\n");
      out.write("<script>\n");
      out.write("function w3_open() {\n");
      out.write("  document.getElementById(\"mySidebar\").style.display = \"block\";\n");
      out.write("  document.getElementById(\"myOverlay\").style.display = \"block\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function w3_close() {\n");
      out.write("  document.getElementById(\"mySidebar\").style.display = \"none\";\n");
      out.write("  document.getElementById(\"myOverlay\").style.display = \"none\";\n");
      out.write("}\n");
      out.write("</script>");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container col-sm-11 mt-3\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        ");

                            List lis = new ProductoDAO().getAll();
                            ListIterator list = lis.listIterator();
                            while (list.hasNext()) {
                                BeensProducto Produ = (BeensProducto) list.next();

                        
      out.write("\n");
      out.write("                        <div class=\"col-sm-3 mt-3\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-header\">\n");
      out.write("                                    ");
      out.print( Produ.getNombres());
      out.write("\n");
      out.write("                                    ");
      out.print( Produ.getPro_cat_id());
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    ");
      out.print( Produ.getId());
      out.write("\n");
      out.write("                                    <center><img src=\"ControlImg?id=");
      out.print( Produ.getId());
      out.write("\" style=\"width: 90px; height: 90px;\"/></center>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer\">\n");
      out.write("                                    ");
      out.print( Produ.getDescrip());
      out.write("\n");
      out.write("                                    <div>\n");
      out.write("                                        <center><a  href=\"ControladorCar?accion=Carr&menu=Agregar&id=");
      out.print( Produ.getId());
      out.write("&idU=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  class=\"button btn btn-primary\">\n");
      out.write("                                                <i class=\"fas fa-user-plus\"></i> Carrito ");
      out.print( Produ.getId());
      out.write("\n");
      out.write("                                            </a>\n");
      out.write("                                            <a  href=\"ControladorCarrito?accion=Carr&menu=Agregar\"  class=\"btn btn-success\">\n");
      out.write("                                                <i class=\"fas fa-user-plus\"></i> Comprar\n");
      out.write("                                            </a></center>\n");
      out.write("                                    </div>\n");
      out.write("                                    <script>\n");
      out.write("                                        $(function () {\n");
      out.write("                                            $(\".button\").click(function () {\n");
      out.write("                                                // validate and process form here\n");
      out.write("                                            });\n");
      out.write("                                        });\n");
      out.write("                                    </script>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                        </div>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </div>           \n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
