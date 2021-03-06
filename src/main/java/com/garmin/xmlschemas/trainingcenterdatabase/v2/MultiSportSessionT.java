//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.10.26 um 08:16:51 PM CET 
//


package com.garmin.xmlschemas.trainingcenterdatabase.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für MultiSportSession_t complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MultiSportSession_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FirstSport" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}FirstSport_t"/>
 *         &lt;element name="NextSport" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}NextSport_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSportSession_t", propOrder = {
    "id",
    "firstSport",
    "nextSport",
    "notes"
})
public class MultiSportSessionT {

    @XmlElement(name = "Id", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar id;
    @XmlElement(name = "FirstSport", required = true)
    protected FirstSportT firstSport;
    @XmlElement(name = "NextSport")
    protected List<NextSportT> nextSport;
    @XmlElement(name = "Notes")
    protected String notes;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setId(XMLGregorianCalendar value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der firstSport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FirstSportT }
     *     
     */
    public FirstSportT getFirstSport() {
        return firstSport;
    }

    /**
     * Legt den Wert der firstSport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstSportT }
     *     
     */
    public void setFirstSport(FirstSportT value) {
        this.firstSport = value;
    }

    /**
     * Gets the value of the nextSport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextSport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextSport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NextSportT }
     * 
     * 
     */
    public List<NextSportT> getNextSport() {
        if (nextSport == null) {
            nextSport = new ArrayList<NextSportT>();
        }
        return this.nextSport;
    }

    /**
     * Ruft den Wert der notes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Legt den Wert der notes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}
