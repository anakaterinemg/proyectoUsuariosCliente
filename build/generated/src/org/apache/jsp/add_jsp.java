package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import webservicies.User;
import Model.UserServices;
import Servlets.Controller;
import Model.RoleServices;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Crear usuario</title>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <font face=\"Arial,Helvética\">\n");
      out.write("        <Br>\n");
      out.write("        <h3 align=\"center\"> <font face=\"Arial,Helvética\">Crear nuevo usuario</font></h3>\n");
      out.write("        \n");
      out.write("        <div class=\"mb-4\"> \n");
      out.write("        </div>           \n");
      out.write("                        \n");
      out.write("        <div class=\"card\">\n");
      out.write("            <form action=\"Controller\"> \n");
      out.write("            <div class=\"card-header\"> \n");
      out.write("                <input class=\"btn btn-outline-primary\" type=\"submit\" name=\"accion\" value=\"Guardar\">\n");
      out.write("                <a href=\"index.jsp\" class=\"btn btn-outline-primary\">Cancelar</a>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"mb-4\">\n");
      out.write("                            <label for=\"idUser\" class=\"form-label\"> Id </label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"idUser\">\n");
      out.write("                        </div> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"mb-4\"> \n");
      out.write("                            <label for=\"nameUser\" class=\"form-label\"> Nombre usuario </label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"nameUser\"> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"mb-4\">\n");
      out.write("                            <label for=\"rolUser\" class=\"form-label\"> Rol </label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"rolUser\"> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"mb-4\"> \n");
      out.write("                            <input type=\"checkbox\" class=\"form-check-input\" name=\"active\">\n");
      out.write("                            <label for=\"active\" class=\"form-check-label\">Activo</label>\n");
      out.write("                        </div> \n");
      out.write("                    </div>\n");
      out.write("                </div>    \n");
      out.write("            </div>    \n");
      out.write("            </form> \n");
      out.write("        </div>            \n");
      out.write("        \n");
      out.write("        </font>\n");
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
