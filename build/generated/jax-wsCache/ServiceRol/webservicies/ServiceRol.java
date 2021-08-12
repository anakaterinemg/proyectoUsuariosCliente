
package webservicies;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceRol", targetNamespace = "http://WebServicies/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceRol {


    /**
     * 
     * @return
     *     returns java.util.List<webservicies.Role>
     */
    @WebMethod(operationName = "Listar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Listar", targetNamespace = "http://WebServicies/", className = "webservicies.Listar")
    @ResponseWrapper(localName = "ListarResponse", targetNamespace = "http://WebServicies/", className = "webservicies.ListarResponse")
    @Action(input = "http://WebServicies/ServiceRol/ListarRequest", output = "http://WebServicies/ServiceRol/ListarResponse")
    public List<Role> listar();

}
