//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.24 at 09:04:41 PM EEST 
//


package com.example.songs;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.songs package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.songs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSongRequest }
     * 
     */
    public GetSongRequest createGetSongRequest() {
        return new GetSongRequest();
    }

    /**
     * Create an instance of {@link GetSongResponse }
     * 
     */
    public GetSongResponse createGetSongResponse() {
        return new GetSongResponse();
    }

    /**
     * Create an instance of {@link Song }
     * 
     */
    public Song createSong() {
        return new Song();
    }

}
