package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import webservicies.User;
import Model.UserServices;
import Model.RoleServices;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <title>Administración de usuarios</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        \n");
      out.write("        <div class=\"container mt-4\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-header\"> \n");
      out.write("                    <a class=\"btn btn-outline-primary\">Nuevo usuario</a>            \n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <table class=\"table table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>IdUsuario</th>\n");
      out.write("                                <th>Nombre</th>\n");
      out.write("                                <th>Apelliedos</th>\n");
      out.write("                                <th>Activo</th>\n");
      out.write("                                <th>Acciones</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                           /** String nombre= "nada";
                            UserServices user= new UserServices();
                            RoleServices role=new RoleServices();
                            System.out.println("--- Buscar usuarios......");
                            List<User> datos= user.consulta(nombre);
                            System.out.println("--- Encontró usuarios: "+datos.size());
                            for(User u:datos){ */
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
//= u.getId() 
      out.write("</td>\n");
      out.write("                                <td>");
//= u.getName() 
      out.write("</td>\n");
      out.write("                                <td>");
//= role.getRole(u.getIdRol()) 
      out.write("</td>\n");
      out.write("                                <td>");
//= u.getActive()
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"\" class=\"btn btn-primary\">Editar</a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr> \n");
      out.write("                            ");
/**} */
      out.write("\n");
      out.write("                        </tbody>                \n");
      out.write("                    </table>            \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
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
