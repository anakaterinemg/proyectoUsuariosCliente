<%-- 
    Document   : add
    Created on : 11/08/2021, 08:09:39 AM
    Author     : annie
--%>

<%@page import="webservicies.Role"%>
<%@page import="java.util.List"%>
<%@page import="webservicies.User"%>
<%@page import="Model.UserServices"%>
<%@page import="Servlets.Controller"%>
<%@page import="Model.RoleServices"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <title>Crear usuario</title>
    </head>
    <body >
       
        <font face="Arial,Helvética" size=3>
        <nav class="navbar navbar-light" style="background-color: #e3f2fd;">
            <div class="container-fluid">
                <a class="navbar-brand" href="#"> ♠ Gestión de usuarios <small>/Crear usuario</small></a>
            </div>
        </nav>                       
        
        <div class="container mt-4">
            <div class="card">
                
                <form name="nuevo" action="Controlador" method="POST"> 
                    
                <div class="card-header" style="background-color:#e3f2fd"> 
                    <h6><font color="#476E93">Información del nuevo usuario</font></h6>   
                </div>
                
                <div class="card-header" style="background-color:#FFFFFF">  
                    <input class="btn btn-outline-primary" type="submit" name="accion" value="Guardar">
                    <a href="index.jsp" class="btn btn-outline-primary">Cancelar</a>
                </div>

                <div class="card-body">

                    <div class="row">
                        
                        <div class="col">                            
                            <div class="mb-4"> 
                                <label  class="form-label"> Nombre usuario </label>
                            </div>
                            <div class="mb-4">
                                <label class="form-label"> Rol </label>
                            </div>
                            <div class="mb-4">                                 
                                <label for="active" class="form-check-label">Activo</label>
                            </div> 
                        </div>
                        <div class="col">                           
                            <div class="mb-4"> 
                                <input type="text" class="form-control" name="nombreNuevo"> 
                            </div>
                            <%
                            String nombre="";
                            RoleServices role= new RoleServices();
                            System.out.println("--- Buscar roles......");
                            List<Role> datos= role.listRoles();
                            System.out.println("--- Encontró roles "+datos.size());                            
                            %>
                            <div class="mb-4">                                
                                <select name="rolNuevo">
                                    <option value="0">Seleccione</option>
                                    <%
                                    for(Role r:datos){	
                                    %>
                                    <option value="<%= r.getIdRole()%>"><%=r.getName()%> </option>
                                    <%
                                    }
                                    %>  
                                </select>
                            </div>
                            <div class="mb-4"> 
                                <input type="checkbox" class="form-check-input" name="activoNuevo" checked>                                
                            </div> 
                        </div>
                        <div class="col"></div>
                        <div class="col"></div>
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
                </div>    
                </form> 
            </div>            
        </div>      
        </font>
    </body>
</html>
