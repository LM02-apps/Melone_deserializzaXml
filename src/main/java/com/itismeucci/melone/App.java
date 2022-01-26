package com.itismeucci.melone;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//import org.junit.Assert.assertEquals;

import javax.swing.text.Document;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import org.xml.sax.SAXException;

/**
 * Hello world!
 *
 */

public class App 
{
     
    public static void main( String[] args ) throws IOException, TransformerException, ParserConfigurationException, SAXException
    {
        serializeXml deserializza= new serializeXml();
        
        root deserializzato=deserializza.whenJavaDeserializedFromXmlFile_thenCorrect();

        String serializzato=deserializza.whenJavaSerializedToXmlStr_thenCorrect(deserializzato);
        
        deserializza.prettyPrint(serializzato);
    }


}
