/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import Model.UserServices;
import javax.swing.JOptionPane;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author annie
 */
public class Controller extends HttpServlet {
    
    String add ="add";
    String index ="index";
    String acceso="";
    UserServices userSW= new UserServices();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String accion = request.getParameter("accion");
        String msj="";
        
        if(accion.equals("Guardar")){   
           String nom=request.getParameter("nombreNuevo");           
           int activo=Integer.parseInt(request.getParameter("activoNuevo"));
           short rol= Short.parseShort(request.getParameter("rolNuevo"));
           
           if(rol==0 || nom.equals(null)) {
               msj="Diligencie todos los campos";
           }
           else if(userSW.validarExiste(nom)==1){
               msj= "El nombre de usuario ingresado ya está en uso.";           
           }               
           else{
               msj= userSW.crear(rol, nom, activo);
           }                      
           acceso= index;           
        }
        else if(accion.equals("")){
            msj="Diligencie todos los campos";
        }        
             
        JOptionPane.showMessageDialog(null, msj);        
        RequestDispatcher dispacher=request.getRequestDispatcher("../../index.jsp");
        dispacher.forward(request, response);    
        
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
        processRequest(request, response);
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
        processRequest(request, response);
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
