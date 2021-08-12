<%-- 
    Document   : index
    Created on : 10/08/2021, 07:47:19 PM
    Author     : annie
--%>

<%@page import="webservicies.Role"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="webservicies.User"%>
<%@page import="Servlets.Controller"%>
<%@page import="Model.UserServices"%>
<%@page import="Model.RoleServices"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <title>Administración de usuarios</title>
    </head>
    <body>   
        
        <font face="Arial,Helvética" size=3>
        <nav class="navbar navbar-light" style="background-color: #e3f2fd;">
            <div class="container-fluid">
              <a class="navbar-brand" href="#">♠ Gestión de usuarios</a>
            </div>
        </nav>
        
        
        <div class="container mt-4">
            <div class="card">                
                <div class="card-header" style="background-color: #e3f2fd"> 
                    <h6><font color="#476E93">Parámetros de búsqueda</font></h6>   
                </div>
                <form action="Controlador" method="GET">                
                    <div class="card-header" style="background-color:#FFFFFF">                     
                        <input class="btn btn-outline-primary" type="submit" name="accion" value="Consultar">
                         
                    </div>                
                    <div class="card-body">
                        <div class="row">
                            <div class="col">
                                <div class="mb-4" >
                                    <label for="nombre" class="form-label"> Nombre </label> 
                                    <input type="text" class="form-control" name="nombreTxt"> 
                                </div>   
                            </div>   
                            <div class="col"></div>
                            <div class="col"></div>
                        </div>
                    </div>   
                </form>    
            </div>
            
            <div class="mb-4"></div>
            
            <div class="card">                
                <div class="card-header" style="background-color: #e3f2fd"> 
                    <h6><font color="#476E93">Lista de usuarios</font></h6>   
                </div>                
                <div class="card-header" style="background-color:#FFFFFF"> 
                    <a href="add.jsp" class="btn btn-outline-primary">Nuevo usuario</a>            
                </div>                
                <div class="card-body" style="height:180px; overflow: scroll;">  
                    <table class="table table-hover" name="listaUsuarios">
                        <thead>
                            <tr>
                                <th>IdUsuario</th>
                                <th>Nombre</th>
                                <th>Rol</th>
                                <th>Activo</th>
                                <th>Acciones</th>
                            </tr>
                        </thead> 
                        <tbody>
                            <%
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
                            %>
                            <tr>
                                <td name="idList"><%= u.getId() %></td>
                                <td name="nameList"><%= u.getName() %></td>
                                <td name="roleList"><%=rol %></td>
                                <td name="activeList"><%= u.getActive()%></td>
                                <td>
                                    <a href="Controlador?accion=editar&id=<%=u.getId()%>&name=<%=u.getName()%>&rol=<%=rol%>&act=<%=u.getActive()%>" class="btn-outline-primary" name="editar">Seleccionar</a>
                                </td>
                            </tr> 
                            <%      }
                                }
                            }
                            catch(Exception e){                                
                            %>
                            <tr>
                                <td></td>
                                <td>No se encontraron resultados</td>
                                <td></td>
                                <td></td>
                                <td></td>                                
                            </tr> 
                            <%  }%>
                        </tbody>     
                    </table>    
                </div>                   
            </div>
                        
            <div class="mb-4"> </div>           
                        
            <div class="card"> 
                <form action="Controlador" method="POST">
                    <div class="card-header" style="background-color: #e3f2fd"> 
                        <h6><font color="#476E93">Información del usuario</font></h6>   
                    </div>                
                    <div class="card-header" style="background-color:#FFFFFF"> 
                        <input class="btn btn-outline-primary" type="submit" name="accion" value="Actualizar">
                        <input class="btn btn-outline-primary" type="submit" name="accion" value="Eliminar">   
                    </div>

                    <div class="card-body">                    
                        <div class="row">
                            <div class="col"> 
                                <div class="mb-4">
                                    <label for="idUser" class="form-label"> Id </label>
                                </div> 
                                <div class="mb-4"> 
                                    <label for="nameUser" class="form-label"> Nombre usuario </label>
                                </div>
                                <div class="mb-4">
                                    <label for="rolUser" class="form-label"> Rol </label>
                                </div>
                                <div class="mb-4">                                 
                                    <label for="active" class="form-check-label">Activo</label>
                                </div>                          
                            </div>
                            <div class="col"> 
                                <%
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
                                            
                                %>
                                <div class="mb-4">
                                    <input type="text" class="form-control" name="idUser" value="<%=userSelect.getId() %>" readonly="readonly"/>
                                </div> 
                                <div class="mb-4"> 
                                    <input type="text" class="form-control" name="nameUser" value="<%=userSelect.getName() %>"> 
                                </div>
                                <div class="mb-4">
                                    <select name="rolEditar">
                                        <%
                                        for(Role r:datosR){	
                                            if (r.getIdRole()==userSelect.getIdRol()){
                                        %>
                                            <option value="<%= r.getIdRole()%>" selected="selected"><%=r.getName()%> </option>
                                        <% 
                                            }
                                            else{        
                                        %>
                                        <option value="<%= r.getIdRole()%>"><%=r.getName()%> </option>
                                        <%
                                        }}
                                        %>      
                                    </select>                                    
                                </div>
                                <div class="mb-4"> 
                                    <input type="checkbox" class="form-check-input" name="active" value="<%=userSelect.getActive()%>" checked>
                                </div>  
                                <%   
                                }}
                                catch(Exception e){                                
                                %>
                                <div class="mb-4">
                                    <input type="text" class="form-control" name="idUser" readonly="readonly"/>
                                </div> 
                                <div class="mb-4"> 
                                    <input type="text" class="form-control" name="nameUser" > 
                                </div>
                                <div class="mb-4">
                                    <select name="rolEditar">
                                        <%
                                        for(Role r:datosR){	
                                        %>
                                        <option value="<%= r.getIdRole()%>"><%=r.getName()%> </option>
                                        <%
                                        }
                                        %>      
                                    </select>
                                </div>
                                <div class="mb-4"> 
                                    <input type="checkbox" class="form-check-input" name="active" checked>
                                </div>   
                                <%
                                }
                                %>
                            </div>
                            <% //si ls respuesta de mi servlet es diferente a vacio
                            if(request.getAttribute("mensaje")!=null) 
                            {  //tendrìa que mandar a imprimir por medio del alert de abajo el mensaje de acceso correcto o incorrecto, pero no me lo muestra
                                %>          
                                <script>alert( "<%=request.getAttribute("mensaje")%>")</script>
                                <br>            
                             <%   
                            }                        
                            %>
                            <div class="col"> </div>
                            <div class="col"> </div>
                        </div>
                    </div> 
                </form>        
            </div>  
        </div>      
    </body>
</html>
