/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author annie
 */
public class UserServices {
    
    public UserServices(){}

    public java.util.List<webservicies.User> consulta(java.lang.String nombre) {
        webservicies.ServiceUser_Service service = new webservicies.ServiceUser_Service();
        webservicies.ServiceUser port = service.getServiceUserPort();
        return port.consulta(nombre);
    }

    public String crear(short idRole, java.lang.String name, int active) {
        webservicies.ServiceUser_Service service = new webservicies.ServiceUser_Service();
        webservicies.ServiceUser port = service.getServiceUserPort();
        return port.crear(idRole, name, active);
    }

    public String actualizar(short idUser, short idRole, java.lang.String name, int active) {
        webservicies.ServiceUser_Service service = new webservicies.ServiceUser_Service();
        webservicies.ServiceUser port = service.getServiceUserPort();
        return port.actualizar(idUser, idRole, name, active);
    }

    public String eliminar(short idUser) {
        webservicies.ServiceUser_Service service = new webservicies.ServiceUser_Service();
        webservicies.ServiceUser port = service.getServiceUserPort();
        return port.eliminar(idUser);
    }

    public int validarExiste(java.lang.String name) {
        webservicies.ServiceUser_Service service = new webservicies.ServiceUser_Service();
        webservicies.ServiceUser port = service.getServiceUserPort();
        return port.validarExiste(name);
    }    
    
    
}
