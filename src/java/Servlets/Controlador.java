/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Model.UserServices;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import webservicies.User;

/**
 *
 * @author annie
 */
public class Controlador extends HttpServlet {
    
    String add ="add.jsp";
    String index ="index.jsp";
    String acceso="";
    String idUserInfo="";
    UserServices userSW;
    List<User> datosUsuarios = new ArrayList<User>();

    public Controlador(){}
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        /*+try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        userSW= new UserServices();
        
        String accion = request.getParameter("accion");
        request.setAttribute("datosUsuarios",datosUsuarios );
        
        if(accion.equals("Consultar")){              
            System.out.println("--- Buscar usuarios----");
            String nom=request.getParameter("nombreTxt");    
            System.out.println("--- Buscar usuarios x nombre......->"+nom);
            datosUsuarios= userSW.consulta(nom);
            System.out.println("--- Encontró usuarios: "+datosUsuarios.size()); 
            if(datosUsuarios.isEmpty()){                 
                PrintWriter out=response.getWriter();
                out.println("Carga todos");
            }
            else{   
                request.setAttribute("datosUsuarios",datosUsuarios );
            }
            request.getRequestDispatcher("index.jsp").forward(request, response);   
        } 
        else if (accion.equals("editar")){
            acceso= index;
            idUserInfo=(String)request.getParameter("id");           
            
            User user= this.getSelectedUser();
            System.out.println("************Entro por Servlet EDITAR ");
            System.out.println("Recibio id -->"+user.getId());
            request.setAttribute("userSelected",user);     
            
            //idUserInfo="";
            System.out.println("Recibio id "+request.getParameter("id")+" Tambien name: "+request.getParameter("name"));
            request.getRequestDispatcher("index.jsp").forward(request, response); 
            
        }
        
        
    }
    
    
    private User getSelectedUser(){
       
         User userSeleted = new User();
         int idUserInf=Integer.parseInt(this.idUserInfo);
         
         for(User u:this.datosUsuarios)
         {
             if(u.getId()==idUserInf){
                userSeleted = u;               
             }
         }
         
         return userSeleted;
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        userSW= new UserServices();
        String accion = request.getParameter("accion");
        String msj="";
        
        if(accion.equals("Guardar")){   
           int activo=0; 
           String nom=request.getParameter("nombreNuevo");  
           if(request.getParameter("activoNuevo").equals("on")){
                activo=1;
                System.out.println(" Active CHECK->"+request.getParameter("active"));
           }            
           short rol= Short.parseShort(request.getParameter("rolNuevo"));
           
           PrintWriter out=response.getWriter();
           out.println("nombre->"+nom+" Activ->"+activo+" rol->"+rol); 
           System.out.println("nombre->"+nom+" Activ->"+activo+" rol->"+rol);
           
           if(rol==0 || nom.isEmpty()) {
               msj="Diligencie todos los campos";
           }
           else if(userSW.validarExiste(nom)==1){
               msj= "El nombre de usuario"+nom+" ingresado ya está en uso ";           
           }               
           else{
               msj= userSW.crear(rol, nom, activo); 
               out.println("Al crear->"+msj); 
           }                      
           acceso= add;           
        }
        else if(accion.equals("Actualizar")){ 
            
            if (idUserInfo.isEmpty()){
                msj= "No hay información para actualizar. Por favor seleccione un usuario y edite los datos que requiera"; 
            } 
            else{
                                         
                User user= this.getSelectedUser();
                System.out.println("************Entro por Servlet SAVE EDITAr ");
                System.out.println("Recibio id -->"+user.getId());
                
                int activo=0; 
                
                String nom=request.getParameter("nameUser");
                System.out.println("nombre->"+nom);
                if(request.getParameter("active").equals("on")){
                    activo=1;
                    System.out.println(" Active CHECK->"+request.getParameter("active"));
                }  
                System.out.println(" Activ->"+activo);

                short rol= Short.parseShort(request.getParameter("rolEditar"));
                System.out.println("nombre->"+nom+" Activ->"+activo+" rol->"+rol);

                if(rol==0 || nom.isEmpty()) {
                    msj="Diligencie todos los campos";
                }
                else if((!nom.equals(user.getName())) && (userSW.validarExiste(nom)==1)){
                    msj= "El nombre de usuario"+nom+" ingresado ya está en uso ";           
                }               
                else{ 
                    msj= userSW.actualizar((short)user.getId(), rol, nom, activo);                     
                }                      
                acceso= index;      
            }  
        }
        else if(accion.equals("Eliminar")){ 
            System.out.println("*************************************************"); 
            System.out.println("Entró a eliminar.............................."); 
             if (idUserInfo.isEmpty()){
                msj= "No hay información para actualizar. Por favor seleccione un usuario y edite los datos que requiera"; 
            } 
            else{
                try{
                       String id=request.getParameter("idUser");
                       short idU= Short.parseShort(id);
                       msj= userSW.eliminar(idU);
                       System.out.println("Eliminada id-> "+idU+" De Tantos usuarios->"+datosUsuarios.size()); 
                       datosUsuarios= userSW.consulta("");
                       System.out.println("--- Lsita de usuarios ctualizado #-> "+datosUsuarios.size()); 
                       if(datosUsuarios.isEmpty()){                 
                            PrintWriter out=response.getWriter();
                            out.println("No hay usuarios");
                       }
                       else{   
                            request.setAttribute("datosUsuarios",datosUsuarios );
                       }
                } 
                catch(Exception e){
                    msj= "No se ha seleccionado un usuario a eliminar. "; 
                }
             }                       
            acceso= index;      
        }  
        
        request.setAttribute("mensaje", msj);        
        request.getRequestDispatcher(acceso).forward(request, response);
    }    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
