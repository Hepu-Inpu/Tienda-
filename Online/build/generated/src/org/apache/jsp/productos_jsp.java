package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.ProductoCDAO;
import beens.ProductoCBeens;
import beens.ProductoBeens;
import DAO.ProductoDAO;
import java.util.ListIterator;
import java.util.List;

public final class productos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/commons/cdn.jsp");
    _jspx_dependants.add("/commons/Cabecera_1.jsp");
    _jspx_dependants.add("/commons/SideBar.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Usuarios</title>\n");
      out.write("        ");
      out.write(" <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write(" ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"commons/Global.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-expand-md bg-dark navbar-dark\">\n");
      out.write("  <!-- Brand -->\n");
      out.write("  <a class=\"navbar-brand\" href=\"../index.jsp\">D-Compras</a>\n");
      out.write("\n");
      out.write("  <!-- Toggler/collapsibe Button -->\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button> \n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("    <ul class=\"navbar-nav\">\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"index.jsp\">Home</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3 sidebar-col\">\n");
      out.write("                ");
      out.write("<link rel=\"stylesheet\" href=\"commons/global.css\" type=\"text/css\">\n");
      out.write("<div>\n");
      out.write("    \n");
      out.write("    <a href=\"UsuarioPrincipal.jsp\">Usuarios</a>\n");
      out.write("    <a href=\"productoC.jsp\">Categoria de Productos</a>\n");
      out.write("    <a href=\"usuarios.jsp\">Ordenes</a>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("    <div class=\"col-sm-9 main-col\">\n");
      out.write("        <form action=\"ControladorPP?menu=Producto\" method=\"POST\"> \n");
      out.write("            <div class=\"form-group d-flex\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                   \n");
      out.write("                    <label>Nombres</label>\n");
      out.write("                    <input type=\"text\"  name=\"Nombre\" class=\"form-control\">\n");
      out.write("                     <label>Cantidad</label>\n");
      out.write("                    <input type=\"text\"  name=\"Can\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <label>Costo</label>\n");
      out.write("                    <input type=\"text\"  name=\"Costo\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"col-sm-3\">\n");
      out.write("                    <label>Seleccionar categoria</label>\n");
      out.write("                    <select name=\"produ_catego_id\" class=\"form-control\">\n");
      out.write("                        ");
 
                        List lis = new ProductoCDAO().getAll();
                        ListIterator list = lis.listIterator();
                        while(list.hasNext()){
                         ProductoCBeens li = (ProductoCBeens) list.next();   
                        
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        <option value=\"");
      out.print(li.getId());
      out.write('"');
      out.write('>');
      out.print( li.getNombre());
      out.write("</option>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                <button type=\"submit\" name=\"accion\" value=\"insertar\" class=\"btn btn-danger\">\n");
      out.write("                    <i class=\"fas fa-user-plus\"></i> Guardar\n");
      out.write("                </button>\n");
      out.write("                <button type=\"submit\" name=\"accion\" value=\"modifica\"  class=\"btn btn-dark\">\n");
      out.write("                    <i class=\"fas fa-edit\"></i> Modificar\n");
      out.write("                </button>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <label>Descripcion</label>\n");
      out.write("                    <textarea name=\"Desc\" id=\"descr\" class=\"form-control\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("        </form>\n");
      out.write("                \n");
      out.write("\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    </div>    \n");
      out.write("    </div>\n");
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
