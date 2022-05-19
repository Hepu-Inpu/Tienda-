package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beens.registroBeens;
import java.util.ListIterator;
import java.util.List;
import DAO.registroDAO;

public final class prueba_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/commons/cdn.jsp");
    _jspx_dependants.add("/commons/co_usuario/CabeceraU.jsp");
    _jspx_dependants.add("/commons/co_usuario/SideBarU.jsp");
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
      out.write("        <link rel=\"stylesheet\" href=\"commons/co_usuario/GlobalU.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-expand-md bg-dark navbar-dark\">\n");
      out.write("    <!-- Brand -->\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\">D-Compras</a>\n");
      out.write("\n");
      out.write("    <!-- Toggler/collapsibe Button -->\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button> \n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"admin.jsp\">Inicio</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"dropdown dropleft\">\n");
      out.write("        <a class=\"navbar-brand \" data-toggle=\"dropdown\">\n");
      out.write("            <img src=\"img/Usr.png\" alt=\"Logo\" style=\"width:45px;\">\n");
      out.write("        </a>\n");
      out.write("        <div  style=\" width:300px;\" class=\"dropdown-menu\">\n");
      out.write("            <center><img src=\"img/Usr.png\"  style=\"width:20px;\"></center>\n");
      out.write("            <a class=\"dropdown-divider\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${admin.getNombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("            <div class=\"dropdown-divider\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${admin.getId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("            <div class=\"dropdown-divider\"></div>\n");
      out.write("             <a class=\"dropdown-item\" href=\"#\">Cerrar Sesion</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3 sidebar-col\">\n");
      out.write("                    ");
      out.write("<link rel=\"stylesheet\" href=\"commons/GlobalU.css\" type=\"text/css\">\n");
      out.write("<div>\n");
      out.write("    \n");
      out.write("    <a href=\"administrador.jsp\">Usuarios</a>\n");
      out.write("    <a href=\"productos_cat.jsp\">Categoria</a>\n");
      out.write("    <a href=\"productos.jsp\">Ordenes</a>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("                </div>\n");
      out.write("                    <table class=\"table table-bordered\">\n");
      out.write("                    <th  class=\"bg-dark text-white\" colspan=\"7\"><h1><center>Lista de Usuarios</center></h1></th>\n");
      out.write("                        <tr class=\"bg-secondary text-white\">\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>Nombres</th>\n");
      out.write("                            <th>Conctacto</th>\n");
      out.write("                            <th>Correo</th>\n");
      out.write("                            <th>Rol</th>\n");
      out.write("                            <th colspan=\"2\"><center>Opciones</center></th>\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            List lis = new registroDAO().getAll();
                            ListIterator list = lis.listIterator();
                            while (list.hasNext()) {
                                registroBeens regM = (registroBeens) list.next();

                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("                            <td class=\"bg-light text-dark\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${admin.getId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td class=\"bg-light text-dark\">");
      out.print( regM.getNombre());
      out.write("</td>\n");
      out.write("                            <td class=\"bg-light text-dark\">");
      out.print( regM.getContact());
      out.write("</td>\n");
      out.write("                            <td class=\"bg-light text-dark\">");
      out.print( regM.getEmail());
      out.write("</td>\n");
      out.write("                            <td class=\"bg-light text-dark\">");
      out.print( regM.getRol());
      out.write("</td>\n");
      out.write("                            <td class=\"bg-light text-dark\"><center><a class=\"btn btn-outline-warning\" href=\"ControladorU?menu=Usuario&accion=carga&id=");
      out.print(regM.getId());
      out.write("\">Actualizar</a></center></td>\n");
      out.write("                            <td class=\"bg-light text-dark\"><center><a href=\"ControladorU?menu=Usuario&accion=eliminar&id=");
      out.print(regM.getId());
      out.write("\" class=\"btn btn-outline-danger\">Borrar</a></center></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
