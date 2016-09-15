
package com.afpa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.afpa package. 
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

    private final static QName _MaFonctionAgeResponse_QNAME = new QName("http://afpa.com/", "maFonctionAgeResponse");
    private final static QName _MaFonctionAge_QNAME = new QName("http://afpa.com/", "maFonctionAge");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.afpa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MaFonctionAgeResponse }
     * 
     */
    public MaFonctionAgeResponse createMaFonctionAgeResponse() {
        return new MaFonctionAgeResponse();
    }

    /**
     * Create an instance of {@link MaFonctionAge }
     * 
     */
    public MaFonctionAge createMaFonctionAge() {
        return new MaFonctionAge();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaFonctionAgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://afpa.com/", name = "maFonctionAgeResponse")
    public JAXBElement<MaFonctionAgeResponse> createMaFonctionAgeResponse(MaFonctionAgeResponse value) {
        return new JAXBElement<MaFonctionAgeResponse>(_MaFonctionAgeResponse_QNAME, MaFonctionAgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaFonctionAge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://afpa.com/", name = "maFonctionAge")
    public JAXBElement<MaFonctionAge> createMaFonctionAge(MaFonctionAge value) {
        return new JAXBElement<MaFonctionAge>(_MaFonctionAge_QNAME, MaFonctionAge.class, null, value);
    }

}
