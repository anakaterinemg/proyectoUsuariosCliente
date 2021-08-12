
package webservicies;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiceRol", targetNamespace = "http://WebServicies/", wsdlLocation = "http://localhost:40151/ServiciesUser/ServiceRol?wsdl")
public class ServiceRol_Service
    extends Service
{

    private final static URL SERVICEROL_WSDL_LOCATION;
    private final static WebServiceException SERVICEROL_EXCEPTION;
    private final static QName SERVICEROL_QNAME = new QName("http://WebServicies/", "ServiceRol");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:40151/ServiciesUser/ServiceRol?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEROL_WSDL_LOCATION = url;
        SERVICEROL_EXCEPTION = e;
    }

    public ServiceRol_Service() {
        super(__getWsdlLocation(), SERVICEROL_QNAME);
    }

    public ServiceRol_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEROL_QNAME, features);
    }

    public ServiceRol_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICEROL_QNAME);
    }

    public ServiceRol_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEROL_QNAME, features);
    }

    public ServiceRol_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceRol_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceRol
     */
    @WebEndpoint(name = "ServiceRolPort")
    public ServiceRol getServiceRolPort() {
        return super.getPort(new QName("http://WebServicies/", "ServiceRolPort"), ServiceRol.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceRol
     */
    @WebEndpoint(name = "ServiceRolPort")
    public ServiceRol getServiceRolPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebServicies/", "ServiceRolPort"), ServiceRol.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEROL_EXCEPTION!= null) {
            throw SERVICEROL_EXCEPTION;
        }
        return SERVICEROL_WSDL_LOCATION;
    }

}
