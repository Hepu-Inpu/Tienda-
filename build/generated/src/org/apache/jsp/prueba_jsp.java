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

public final class prueba_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/commons/CDN(4).jsp");
    _jspx_dependants.add("/commons/Co_Usu/Cabecera_U.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Productos</title>\n");
      out.write("        ");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Global_U.jsp\" type=\"text/css\">\n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-expand-md  navbar-light \" style=\"background-color: #01E0FF\">\n");
      out.write("    <!-- Brand -->\n");
      out.write("    <a class=\"navbar-brand h5\" href=\"index.jsp\">Tienda V</a>\n");
      out.write("\n");
      out.write("    <!-- Toggler/collapsibe Button -->\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button> \n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link active h6\" href=\"Usuario.jsp\">Inicio</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link active h6\" href=\"Produc_Usu.jsp\">Productos</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <a class=\"navbar-brand h5\" href=\"Carrito.jsp\"> \n");
      out.write("        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"50\" height=\"25\" fill=\"currentColor\" class=\"bi bi-cart4\" viewBox=\"0 0 16 16\">\n");
      out.write("        <path d=\"M0 2.5A.5.5 0 0 1 .5 2H2a.5.5 0 0 1 .485.379L2.89 4H14.5a.5.5 0 0 1 .485.621l-1.5 6A.5.5 0 0 1 13 11H4a.5.5 0 0 1-.485-.379L1.61 3H.5a.5.5 0 0 1-.5-.5zM3.14 5l.5 2H5V5H3.14zM6 5v2h2V5H6zm3 0v2h2V5H9zm3 0v2h1.36l.5-2H12zm1.11 3H12v2h.61l.5-2zM11 8H9v2h2V8zM8 8H6v2h2V8zM5 8H3.89l.5 2H5V8zm0 5a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0zm9-1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0z\"/>\n");
      out.write("    </svg>\n");
      out.write("    </a>\n");
      out.write("  \n");
      out.write("\n");
      out.write("    <div class=\"dropdown dropleft\">\n");
      out.write("        <a class=\"navbar-brand \" data-toggle=\"dropdown\">\n");
      out.write("            <img src=\"img/PFL.png\" alt=\"Logo\" style=\"width:30px;\">\n");
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
      out.write("\n");
      out.write("</nav>");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container mt-4\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                ");

                    List lis = new ProductoDAO().getAll();
                    ListIterator list = lis.listIterator();
                    while (list.hasNext()) {
                        BeensProducto Produ = (BeensProducto) list.next();

                
      out.write("\n");
      out.write("                <div class=\"col-sm-3 mt-2\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header\">\n");
      out.write("                            ");
      out.print( Produ.getNombres());
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            ");
      out.print( Produ.getId());
      out.write("\n");
      out.write("                            <center><img src=\"img/imagen.png\" style=\"width: 90px; height: 90px;\"/></center>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer\">\n");
      out.write("                            ");
      out.print( Produ.getDescrip() );
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <center><a  href=\"ControladorCarrito?accion=Carr&menu=Agregar&id=");
      out.print( Produ.getId());
      out.write("\"  class=\"btn btn-primary\">\n");
      out.write("                                    <i class=\"fas fa-user-plus\"></i> Carrito\n");
      out.write("                                </a>\n");
      out.write("                                 <a  href=\"ControladorCarrito?accion=Carr&menu=Agregar\"  class=\"btn btn-success\">\n");
      out.write("                                    <i class=\"fas fa-user-plus\"></i> Comprar\n");
      out.write("                                 </a></center>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </div>           \n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
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
