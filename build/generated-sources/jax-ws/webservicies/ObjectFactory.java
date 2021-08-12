
package webservicies;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservicies package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Actualizar_QNAME = new QName("http://WebServicies/", "Actualizar");
    private final static QName _ActualizarResponse_QNAME = new QName("http://WebServicies/", "ActualizarResponse");
    private final static QName _Consulta_QNAME = new QName("http://WebServicies/", "Consulta");
    private final static QName _ConsultaResponse_QNAME = new QName("http://WebServicies/", "ConsultaResponse");
    private final static QName _Crear_QNAME = new QName("http://WebServicies/", "Crear");
    private final static QName _CrearResponse_QNAME = new QName("http://WebServicies/", "CrearResponse");
    private final static QName _Eliminar_QNAME = new QName("http://WebServicies/", "Eliminar");
    private final static QName _EliminarResponse_QNAME = new QName("http://WebServicies/", "EliminarResponse");
    private final static QName _ObtenerUsuario_QNAME = new QName("http://WebServicies/", "ObtenerUsuario");
    private final static QName _ObtenerUsuarioResponse_QNAME = new QName("http://WebServicies/", "ObtenerUsuarioResponse");
    private final static QName _ValidarExiste_QNAME = new QName("http://WebServicies/", "ValidarExiste");
    private final static QName _ValidarExisteResponse_QNAME = new QName("http://WebServicies/", "ValidarExisteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservicies
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Actualizar }
     * 
     */
    public Actualizar createActualizar() {
        return new Actualizar();
    }

    /**
     * Create an instance of {@link ActualizarResponse }
     * 
     */
    public ActualizarResponse createActualizarResponse() {
        return new ActualizarResponse();
    }

    /**
     * Create an instance of {@link Consulta }
     * 
     */
    public Consulta createConsulta() {
        return new Consulta();
    }

    /**
     * Create an instance of {@link ConsultaResponse }
     * 
     */
    public ConsultaResponse createConsultaResponse() {
        return new ConsultaResponse();
    }

    /**
     * Create an instance of {@link Crear }
     * 
     */
    public Crear createCrear() {
        return new Crear();
    }

    /**
     * Create an instance of {@link CrearResponse }
     * 
     */
    public CrearResponse createCrearResponse() {
        return new CrearResponse();
    }

    /**
     * Create an instance of {@link Eliminar }
     * 
     */
    public Eliminar createEliminar() {
        return new Eliminar();
    }

    /**
     * Create an instance of {@link EliminarResponse }
     * 
     */
    public EliminarResponse createEliminarResponse() {
        return new EliminarResponse();
    }

    /**
     * Create an instance of {@link ObtenerUsuario }
     * 
     */
    public ObtenerUsuario createObtenerUsuario() {
        return new ObtenerUsuario();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioResponse }
     * 
     */
    public ObtenerUsuarioResponse createObtenerUsuarioResponse() {
        return new ObtenerUsuarioResponse();
    }

    /**
     * Create an instance of {@link ValidarExiste }
     * 
     */
    public ValidarExiste createValidarExiste() {
        return new ValidarExiste();
    }

    /**
     * Create an instance of {@link ValidarExisteResponse }
     * 
     */
    public ValidarExisteResponse createValidarExisteResponse() {
        return new ValidarExisteResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actualizar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServicies/", name = "Actualizar")
    public JAXBElement<Actualizar> createActualizar(Actualizar value) {
        return new JAXBElement<Actualizar>(_Actualizar_QNAME, Actualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServicies/", name = "ActualizarResponse")
    public JAXBElement<ActualizarResponse> createActualizarResponse(ActualizarResponse value) {
        return new JAXBElement<ActualizarResponse>(_ActualizarResponse_QNAME, ActualizarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consulta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServicies/", name = "Consulta")
    public JAXBElement<Consulta> createConsulta(Consulta value) {
        return new JAXBElement<Consulta>(_Consulta_QNAME, Consulta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServicies/", name = "ConsultaResponse")
    public JAXBElement<ConsultaResponse> createConsultaResponse(ConsultaResponse value) {
        return new JAXBElement<ConsultaResponse>(_ConsultaResponse_QNAME, ConsultaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Crear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServicies/", name = "Crear")
    public JAXBElement<Crear> createCrear(Crear value) {
        return new JAXBElement<Crear>(_Crear_QNAME, Crear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServicies/", name = "CrearResponse")
    public JAXBElement<CrearResponse> createCrearResponse(CrearResponse value) {
        return new JAXBElement<CrearResponse>(_CrearResponse_QNAME, CrearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServicies/", name = "Eliminar")
    public JAXBElement<Eliminar> createEliminar(Eliminar value) {
        return new JAXBElement<Eliminar>(_Eliminar_QNAME, Eliminar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServicies/", name = "EliminarResponse")
    public JAXBElement<EliminarResponse> createEliminarResponse(EliminarResponse value) {
        return new JAXBElement<EliminarResponse>(_EliminarResponse_QNAME, EliminarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServicies/", name = "ObtenerUsuario")
    public JAXBElement<ObtenerUsuario> createObtenerUsuario(ObtenerUsuario value) {
        return new JAXBElement<ObtenerUsuario>(_ObtenerUsuario_QNAME, ObtenerUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServicies/", name = "ObtenerUsuarioResponse")
    public JAXBElement<ObtenerUsuarioResponse> createObtenerUsuarioResponse(ObtenerUsuarioResponse value) {
        return new JAXBElement<ObtenerUsuarioResponse>(_ObtenerUsuarioResponse_QNAME, ObtenerUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarExiste }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServicies/", name = "ValidarExiste")
    public JAXBElement<ValidarExiste> createValidarExiste(ValidarExiste value) {
        return new JAXBElement<ValidarExiste>(_ValidarExiste_QNAME, ValidarExiste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarExisteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServicies/", name = "ValidarExisteResponse")
    public JAXBElement<ValidarExisteResponse> createValidarExisteResponse(ValidarExisteResponse value) {
        return new JAXBElement<ValidarExisteResponse>(_ValidarExisteResponse_QNAME, ValidarExisteResponse.class, null, value);
    }

}
