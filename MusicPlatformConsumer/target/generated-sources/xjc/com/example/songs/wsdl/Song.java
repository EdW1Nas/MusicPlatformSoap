//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.30 at 12:02:41 PM EEST 
//


package com.example.songs.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Song complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Song"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="artist" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="releaseYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="genre" type="{http://example.com/songs}Genre"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Song", propOrder = {
    "name",
    "artist",
    "releaseYear",
    "genre"
})
public class Song {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String artist;
    protected int releaseYear;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Genre genre;

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
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
     * Gets the value of the artist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Sets the value of the artist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtist(String value) {
        this.artist = value;
    }

    /**
     * Gets the value of the releaseYear property.
     * 
     */
    public int getReleaseYear() {
        return releaseYear;
    }

    /**
     * Sets the value of the releaseYear property.
     * 
     */
    public void setReleaseYear(int value) {
        this.releaseYear = value;
    }

    /**
     * Gets the value of the genre property.
     * 
     * @return
     *     possible object is
     *     {@link Genre }
     *     
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Sets the value of the genre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Genre }
     *     
     */
    public void setGenre(Genre value) {
        this.genre = value;
    }

}