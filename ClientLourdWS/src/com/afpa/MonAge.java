
package com.afpa;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MonAge", targetNamespace = "http://afpa.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MonAge {


    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "maFonctionAge", targetNamespace = "http://afpa.com/", className = "com.afpa.MaFonctionAge")
    @ResponseWrapper(localName = "maFonctionAgeResponse", targetNamespace = "http://afpa.com/", className = "com.afpa.MaFonctionAgeResponse")
    @Action(input = "http://afpa.com/MonAge/maFonctionAgeRequest", output = "http://afpa.com/MonAge/maFonctionAgeResponse")
    public int maFonctionAge(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}