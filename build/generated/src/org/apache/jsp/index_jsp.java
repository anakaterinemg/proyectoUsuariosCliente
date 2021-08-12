package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import webservicies.Role;
import java.util.ArrayList;
import java.util.List;
import webservicies.User;
import Servlets.Controller;
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Administración de usuarios</title>\n");
      out.write("    </head>\n");
      out.write("    <body>   \n");
      out.write("        \n");
      out.write("        <font face=\"Arial,Helvética\" size=3>\n");
      out.write("        <nav class=\"navbar navbar-light\" style=\"background-color: #e3f2fd;\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("              <a class=\"navbar-brand\" href=\"#\">♠ Gestión de usuarios</a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container mt-4\">\n");
      out.write("            <div class=\"card\">                \n");
      out.write("                <div class=\"card-header\" style=\"background-color: #e3f2fd\"> \n");
      out.write("                    <h6><font color=\"#476E93\">Parámetros de búsqueda</font></h6>   \n");
      out.write("                </div>\n");
      out.write("                <form action=\"Controlador\" method=\"GET\">                \n");
      out.write("                    <div class=\"card-header\" style=\"background-color:#FFFFFF\">                     \n");
      out.write("                        <input class=\"btn btn-outline-primary\" type=\"submit\" name=\"accion\" value=\"Consultar\">\n");
      out.write("                         \n");
      out.write("                    </div>                \n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <div class=\"mb-4\" >\n");
      out.write("                                    <label for=\"nombre\" class=\"form-label\"> Nombre </label> \n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"nombreTxt\"> \n");
      out.write("                                </div>   \n");
      out.write("                            </div>   \n");
      out.write("                            <div class=\"col\"></div>\n");
      out.write("                            <div class=\"col\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>   \n");
      out.write("                </form>    \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"mb-4\"></div>\n");
      out.write("            \n");
      out.write("            <div class=\"card\">                \n");
      out.write("                <div class=\"card-header\" style=\"background-color: #e3f2fd\"> \n");
      out.write("                    <h6><font color=\"#476E93\">Lista de usuarios</font></h6>   \n");
      out.write("                </div>                \n");
      out.write("                <div class=\"card-header\" style=\"background-color:#FFFFFF\"> \n");
      out.write("                    <a href=\"add.jsp\" class=\"btn btn-outline-primary\">Nuevo usuario</a>            \n");
      out.write("                </div>                \n");
      out.write("                <div class=\"card-body\" style=\"height:180px; overflow: scroll;\">  \n");
      out.write("                    <table class=\"table table-hover\" name=\"listaUsuarios\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>IdUsuario</th>\n");
      out.write("                                <th>Nombre</th>\n");
      out.write("                                <th>Rol</th>\n");
      out.write("                                <th>Activo</th>\n");
      out.write("                                <th>Acciones</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead> \n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                            List<User> datosUsuarios= new ArrayList<User>();
                            RoleServices role=new RoleServices();
                            System.out.println("--- Index-Creada 4 lista vacia......");
                            //request.setAttribute("datosUsuarios",datosUsuarios );
                            System.out.println("--- Index-No hay nada aun.4.....");                            
                            System.out.println("------------------------------"); 
                            
                            System.out.println("---Index: Obtener datos de los usuarios 4 -->"); 
                            try{
                                if (request.getAttribute("datosUsuarios").equals("null")){
                                    
                                    System.out.println("---Index: Entro a Id porque es null -->"); 
                                    User userVacio = new User();
                                    userVacio.setId(0);
                                    datosUsuarios.add(userVacio);  
                                    System.out.println("---Index: usuario DUMMING CREADO -->");
                                }
                                else{
                                    datosUsuarios=(List<User>)request.getAttribute("datosUsuarios"); 
                                    System.out.println("---Index: Obtuvo n usuarios -->"+datosUsuarios.size()); 
                                }    
                                
                                if (datosUsuarios.get(0).getId()>0) {                                
                                    System.out.println("--- Index-- entro a IF ->Obtuvo usuarios -->"+datosUsuarios.size());                        
                                     
                                    String rol="";
                                    System.out.println("--- Index-Encontró usuarios: "+datosUsuarios.size());
                                    for(User u:datosUsuarios){                                        
                                        rol =  role.getRole(u.getIdRol());                             
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td name=\"idList\">");
      out.print( u.getId() );
      out.write("</td>\n");
      out.write("                                <td name=\"nameList\">");
      out.print( u.getName() );
      out.write("</td>\n");
      out.write("                                <td name=\"roleList\">");
      out.print(rol );
      out.write("</td>\n");
      out.write("                                <td name=\"activeList\">");
      out.print( u.getActive());
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"Controlador?accion=editar&id=");
      out.print(u.getId());
      out.write("&name=");
      out.print(u.getName());
      out.write("&rol=");
      out.print(rol);
      out.write("&act=");
      out.print(u.getActive());
      out.write("\" class=\"btn-outline-primary\" name=\"editar\">Seleccionar</a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr> \n");
      out.write("                            ");
      }
                                }
                            }
                            catch(Exception e){                                
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td>No se encontraron resultados</td>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td></td>                                \n");
      out.write("                            </tr> \n");
      out.write("                            ");
  }
      out.write("\n");
      out.write("                        </tbody>     \n");
      out.write("                    </table>    \n");
      out.write("                </div>                   \n");
      out.write("            </div>\n");
      out.write("                        \n");
      out.write("            <div class=\"mb-4\"> </div>           \n");
      out.write("                        \n");
      out.write("            <div class=\"card\"> \n");
      out.write("                <form action=\"Controlador\" method=\"POST\">\n");
      out.write("                    <div class=\"card-header\" style=\"background-color: #e3f2fd\"> \n");
      out.write("                        <h6><font color=\"#476E93\">Información del usuario</font></h6>   \n");
      out.write("                    </div>                \n");
      out.write("                    <div class=\"card-header\" style=\"background-color:#FFFFFF\"> \n");
      out.write("                        <input class=\"btn btn-outline-primary\" type=\"submit\" name=\"accion\" value=\"Actualizar\">\n");
      out.write("                        <input class=\"btn btn-outline-primary\" type=\"submit\" name=\"accion\" value=\"Eliminar\">   \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"card-body\">                    \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col\"> \n");
      out.write("                                <div class=\"mb-4\">\n");
      out.write("                                    <label for=\"idUser\" class=\"form-label\"> Id </label>\n");
      out.write("                                </div> \n");
      out.write("                                <div class=\"mb-4\"> \n");
      out.write("                                    <label for=\"nameUser\" class=\"form-label\"> Nombre usuario </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-4\">\n");
      out.write("                                    <label for=\"rolUser\" class=\"form-label\"> Rol </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-4\">                                 \n");
      out.write("                                    <label for=\"active\" class=\"form-check-label\">Activo</label>\n");
      out.write("                                </div>                          \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col\"> \n");
      out.write("                                ");

                                    User userSelect = new User();
                                    String nombreUsuario ="";
                                    String  rolUsuario="";
                                    int activo=0;
                                    int id=0;
                                    RoleServices roleSW= new RoleServices();
                                    System.out.println("--- Buscar roles......");
                                    List<Role> datosR= role.listRoles();
                                    
                                    try{
                                            if (!request.getAttribute("userSelected").equals("null") )
                                            {
                                                System.out.println("Index--- Info- No se seleccinado usuairo");
                                                userSelect=(User)request.getAttribute("userSelected");
        
                                                // String rolSelected =  role.getRole(userSelect.getIdRol());
                                            
                                
      out.write("\n");
      out.write("                                <div class=\"mb-4\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"idUser\" value=\"");
      out.print(userSelect.getId() );
      out.write("\" readonly=\"readonly\"/>\n");
      out.write("                                </div> \n");
      out.write("                                <div class=\"mb-4\"> \n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"nameUser\" value=\"");
      out.print(userSelect.getName() );
      out.write("\"> \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-4\">\n");
      out.write("                                    <select name=\"rolEditar\">\n");
      out.write("                                        ");

                                        for(Role r:datosR){	
                                            if (r.getIdRole()==userSelect.getIdRol()){
                                        
      out.write("\n");
      out.write("                                            <option value=\"");
      out.print( r.getIdRole());
      out.write("\" selected=\"selected\">");
      out.print(r.getName());
      out.write(" </option>\n");
      out.write("                                        ");
 
                                            }
                                            else{        
                                        
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print( r.getIdRole());
      out.write('"');
      out.write('>');
      out.print(r.getName());
      out.write(" </option>\n");
      out.write("                                        ");

                                        }}
                                        
      out.write("      \n");
      out.write("                                    </select>                                    \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-4\"> \n");
      out.write("                                    <input type=\"checkbox\" class=\"form-check-input\" name=\"active\" value=\"");
      out.print(userSelect.getActive());
      out.write("\" checked>\n");
      out.write("                                </div>  \n");
      out.write("                                ");
   
                                }}
                                catch(Exception e){                                
                                
      out.write("\n");
      out.write("                                <div class=\"mb-4\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"idUser\" readonly=\"readonly\"/>\n");
      out.write("                                </div> \n");
      out.write("                                <div class=\"mb-4\"> \n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"nameUser\" > \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-4\">\n");
      out.write("                                    <select name=\"rolEditar\">\n");
      out.write("                                        ");

                                        for(Role r:datosR){	
                                        
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print( r.getIdRole());
      out.write('"');
      out.write('>');
      out.print(r.getName());
      out.write(" </option>\n");
      out.write("                                        ");

                                        }
                                        
      out.write("      \n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-4\"> \n");
      out.write("                                    <input type=\"checkbox\" class=\"form-check-input\" name=\"active\" checked>\n");
      out.write("                                </div>   \n");
      out.write("                                ");

                                }
                                
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            ");
 //si ls respuesta de mi servlet es diferente a vacio
                            if(request.getAttribute("mensaje")!=null) 
                            {  //tendrìa que mandar a imprimir por medio del alert de abajo el mensaje de acceso correcto o incorrecto, pero no me lo muestra
                                
      out.write("          \n");
      out.write("                                <script>alert( \"");
      out.print(request.getAttribute("mensaje"));
      out.write("\")</script>\n");
      out.write("                                <br>            \n");
      out.write("                             ");
   
                            }                        
                            
      out.write("\n");
      out.write("                            <div class=\"col\"> </div>\n");
      out.write("                            <div class=\"col\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </form>        \n");
      out.write("            </div>  \n");
      out.write("        </div>      \n");
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
