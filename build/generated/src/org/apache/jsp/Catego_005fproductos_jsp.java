package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beens.BeensCategorias;
import java.util.ListIterator;
import DAO.CategoriaDAO;
import java.util.List;

public final class Catego_005fproductos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/commons/CDN(4).jsp");
    _jspx_dependants.add("/commons/Cabecera.jsp");
    _jspx_dependants.add("/commons/Co_Produ/SideBar_P.jsp");
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Global_P.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\n");
      out.write("    <ul class=\"nav navbar-nav mr-auto\">\n");
      out.write("        <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link\" href=\"index.jsp\">Tienda V</a>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("    <div class=\"d-flex justify-content-end \">\n");
      out.write("        <ul class=\"nav navbar-nav\">\n");
      out.write("            <div class=\"nav-item \"> \n");
      out.write("                \n");
      out.write("                <li><a class=\"nav-link bi bi-person-plus-fill\" href=\"Registro.jsp\">   Registrarse</a></li>\n");
      out.write("            </div>\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"nav navbar-nav\">\n");
      out.write("            <div class=\"nav-item \"> \n");
      out.write("                <a class=\"nav-link bi bi-box-arrow-in-right\" href=\"Loguin.jsp\">  Loguin</a>\n");
      out.write("            </div>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div  class=\"row\">\n");
      out.write("                <div class=\"col-sm-3 sidebar-col\">\n");
      out.write("                    ");
      out.write("<link rel=\"stylesheet\" href=\"commons/GlobalUO.css\" type=\"text/css\">\n");
      out.write("<div>\n");
      out.write("    <a href=\"Administrador.jsp\">Usuarios</a>\n");
      out.write("    <a href=\"Productos.jsp\">Productos</a>\n");
      out.write("    <a href=\"Catego_productos.jsp\">Categorias</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9 main-col\" >\n");
      out.write("                    <h1>Modificar o insertar Categorias</h1>\n");
      out.write("                    <form class=\"border border-primary rounded-lg\" action=\"ControladorCategorias?menu=Cat\" method=\"POST\"  style=\" margin-top: -10px;width:  1080px;\">\n");
      out.write("                        <div class=\"form-group d-flex\">\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <label>Nombre Categoria</label>\n");
      out.write("                                <input type=\"text\" name=\"nomCat\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cat.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"col-sm-4\"  style=\" margin-top: 30px;\">\n");
      out.write("                                <button type=\"submit\" name=\"accion\" value=\"Insertar\" class=\"btn btn-outline-primary\">\n");
      out.write("                                  Guardar\n");
      out.write("                                </button>\n");
      out.write("                                <button type=\"submit\" name=\"accion\" value=\"Modificar\"  class=\"btn btn-outline-success\">\n");
      out.write("                                   Modificar\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                   <table style=\" margin-top: 3%;width:  1080px;\" class=\"table table-bordered table-hover\">\n");
      out.write("                        <th  class=\"bg-dark text-white\" colspan=\"9\">\n");
      out.write("                            <h1><center>Lista de categorias registradas</center></h1>\n");
      out.write("                        <tr class=\" mx-auto bg-secondary text-white\">           \n");
      out.write("                            <th><center>Id</center></th>\n");
      out.write("                            <th><center>Nombbre Categoria</center></th>\n");
      out.write("                            <th><center>Estado</center></th>\n");
      out.write("                            <th colspan=\"2\"><center>opciones</center></th>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                           List lis = new CategoriaDAO().getAll(); 
                           ListIterator list = lis.listIterator();
                           while(list.hasNext()){
                               BeensCategorias BeensCat = (BeensCategorias)list.next();
                           
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( BeensCat.getId() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( BeensCat.getNombre() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( BeensCat.getEstado() );
      out.write("</td>\n");
      out.write("                                <td><center><center><a href=\"ControladorCategorias?menu=Cat&accion=Cargar&id=");
      out.print( BeensCat.getId());
      out.write("\" class=\"btn btn-outline-success\">Actualizar</a></center></td>\n");
      out.write("                            <td><center><center><a href=\"ControladorCategorias?menu=Cat&accion=Borrar&id=");
      out.print( BeensCat.getId());
      out.write("\" class=\"btn btn-outline-danger\">Borrar</a></center></td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                            }
                            
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
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
