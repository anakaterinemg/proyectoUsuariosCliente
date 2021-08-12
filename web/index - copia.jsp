<%-- 
    Document   : index
    Created on : 10/08/2021, 07:47:19 PM
    Author     : annie
--%>

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
                <div class="card-header"> 
                    <h6><font color="#476E93">Parámetros de búsqueda</font></h6>   
                </div>
                <form action="Controlador" method="GET">                
                    <div class="card-header" style="background-color:#FFFFFF">                     
                        <input class="btn btn-outline-primary" type="submit" name="accion" value="Consultar"> 
                        <a href="Controller?accion=clean" name="clean" class="btn btn-outline-primary">Limpiar</a>  
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
                <div class="card-header"> 
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
                            System.out.println("--- Index-Creada 2 lista vacia......");
                            //request.setAttribute("datosUsuarios",datosUsuarios );
                            System.out.println("--- Index-No hay nada aun.2.....");
                            
                            
                            /**
                             * if (!request.getParameter("nombreTxt").isEmpty())
                            {*/
                            System.out.println("------------------------------");     
                            System.out.println("---Index: Obtener datos de los usuarios......"); 
                            
                            try{
                                datosUsuarios=(List<User>)request.getAttribute("datosUsuarios"); 
                                System.out.println("---Index: Obtuvo n usuarios -->"+datosUsuarios.size()); 
                            }
                            catch(Exception e){
                                User userVacio = new User();
                                userVacio.setId(0);
                                datosUsuarios.add(userVacio);
                            }                                                  
                                                        
                            if (datosUsuarios.get(0).getId()>0) {                                
                                System.out.println("--- Index-- entro a IF ->Obtuvo usuarios -->"+datosUsuarios.size());                        
                                RoleServices role=new RoleServices();                             
                                System.out.println("--- Index-Encontró usuarios: "+datosUsuarios.size());
                                for(User u:datosUsuarios){ 
                            %>
                            <tr>
                                <td><%= u.getId() %></td>
                                <td><%= u.getName() %></td>
                                <td><%= role.getRole(u.getIdRol()) %></td>
                                <td><%= u.getActive()%></td>
                                <td>
                                    <a href="" class="btn-outline-primary" name="">Seleccionar</a>
                                </td>
                            </tr> 
                            <%}}
                            else {
                            %>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>                                
                            </tr> 
                            <% }
                            %>
                        </tbody>     
                    </table>    
                </div>                   
            </div>
                        
            <div class="mb-4"> </div>           
                        
            <div class="card">                
                <div class="card-header"> 
                    <h6><font color="#476E93">Información del usuario</font></h6>   
                </div>                
                <div class="card-header" style="background-color:#FFFFFF"> 
                    <a href="Controller?accion=Save" class="btn btn-outline-primary">Guardar</a> 
                    <a href="Controller?accion=Edit" class="btn btn-outline-primary">Editar</a>   
                    <a href="Controller?accion=Delete" class="btn btn-outline-primary">Eliminar</a>   
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
                            <div class="mb-4">
                                <input type="text" class="form-control" name="idUser">
                            </div> 
                            <div class="mb-4"> 
                                <input type="text" class="form-control" name="nameUser"> 
                            </div>
                            <div class="mb-4">
                                <input type="text" class="form-control" name="rolUser"> 
                            </div>
                            <div class="mb-4"> 
                                <input type="checkbox" class="form-check-input" name="active">
                            </div>                          
                        </div>
                        <div class="col"> </div>
                        <div class="col"> </div>
                    </div>
                </div>             
        </div>                
    </body>
</html>
