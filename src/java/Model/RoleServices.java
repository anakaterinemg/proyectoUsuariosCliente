/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import webservicies.Role;
import java.util.ArrayList;

/**
 *
 * @author annie
 */
public class RoleServices {
    
    Role rol;    
    List<Role> roles;
    
    public RoleServices(){
        rol = new Role();      
        
    } 
    
    private java.util.List<webservicies.Role> listar() {
        webservicies.ServiceRol_Service service = new webservicies.ServiceRol_Service();
        webservicies.ServiceRol port = service.getServiceRolPort();
        return port.listar();
    }
    
    public String getRole(short id){
        
        String name="";
        System.out.println("--- Entro a RolesServices.getRole(id"+id+")");
        if (roles == null){
           roles = new ArrayList<Role>(); 
           System.out.println("--- Por crear array");
           roles = listar();
           System.out.println("--- Numero de roles obtenidos->"+roles.size());
        }        
        for(Role r:roles) {
        
            if (r.getIdRole() == id){
                name= r.getName();
                System.out.println("--- Nombre->"+name);
            }
        }        
        return name;
    }
    
    private void update(){                
        roles = this.listar();    
    }
    
    public java.util.List<webservicies.Role> listRoles(){                
        this.update();        
        return roles;
    }
    
    
}
