//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.06 at 10:43:41 PM EST 
//


package com.bharat.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TOTAL_ASSETS_IMPUTED" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TOTAL_ASSETS_SENSITIVITY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TOTAL_ASSETS_PERCONTR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LOAN_OVER_DEPOSITS_IMPUTED" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "totalassetsimputed",
    "totalassetssensitivity",
    "totalassetspercontr",
    "loanoverdepositsimputed"
})
@XmlRootElement(name = "getStudentResponse")
public class GetStudentResponse {

    @XmlElement(name = "TOTAL_ASSETS_IMPUTED")
    protected int totalassetsimputed;
    @XmlElement(name = "TOTAL_ASSETS_SENSITIVITY", required = true)
    protected String totalassetssensitivity;
    @XmlElement(name = "TOTAL_ASSETS_PERCONTR")
    protected int totalassetspercontr;
    @XmlElement(name = "LOAN_OVER_DEPOSITS_IMPUTED", required = true)
    protected String loanoverdepositsimputed;

    /**
     * Gets the value of the totalassetsimputed property.
     * 
     */
    public int getTOTALASSETSIMPUTED() {
        return totalassetsimputed;
    }

    /**
     * Sets the value of the totalassetsimputed property.
     * 
     */
    public void setTOTALASSETSIMPUTED(int value) {
        this.totalassetsimputed = value;
    }

    /**
     * Gets the value of the totalassetssensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALASSETSSENSITIVITY() {
        return totalassetssensitivity;
    }

    /**
     * Sets the value of the totalassetssensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALASSETSSENSITIVITY(String value) {
        this.totalassetssensitivity = value;
    }

    /**
     * Gets the value of the totalassetspercontr property.
     * 
     */
    public int getTOTALASSETSPERCONTR() {
        return totalassetspercontr;
    }

    /**
     * Sets the value of the totalassetspercontr property.
     * 
     */
    public void setTOTALASSETSPERCONTR(int value) {
        this.totalassetspercontr = value;
    }

    /**
     * Gets the value of the loanoverdepositsimputed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOANOVERDEPOSITSIMPUTED() {
        return loanoverdepositsimputed;
    }

    /**
     * Sets the value of the loanoverdepositsimputed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOANOVERDEPOSITSIMPUTED(String value) {
        this.loanoverdepositsimputed = value;
    }

}