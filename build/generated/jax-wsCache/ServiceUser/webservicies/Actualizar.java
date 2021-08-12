
package webservicies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Actualizar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Actualizar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="idRole" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Actualizar", propOrder = {
    "idUser",
    "idRole",
    "name",
    "active"
})
public class Actualizar {

    protected short idUser;
    protected short idRole;
    protected String name;
    protected int active;

    /**
     * Obtiene el valor de la propiedad idUser.
     * 
     */
    public short getIdUser() {
        return idUser;
    }

    /**
     * Define el valor de la propiedad idUser.
     * 
     */
    public void setIdUser(short value) {
        this.idUser = value;
    }

    /**
     * Obtiene el valor de la propiedad idRole.
     * 
     */
    public short getIdRole() {
        return idRole;
    }

    /**
     * Define el valor de la propiedad idRole.
     * 
     */
    public void setIdRole(short value) {
        this.idRole = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad active.
     * 
     */
    public int getActive() {
        return active;
    }

    /**
     * Define el valor de la propiedad active.
     * 
     */
    public void setActive(int value) {
        this.active = value;
    }

}
