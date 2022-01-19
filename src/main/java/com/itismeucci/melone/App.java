package com.itismeucci.melone;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//import org.junit.Assert.assertEquals;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */

public class App 
{
     
    public static void main( String[] args ) throws IOException
    {
        deserializeXml prova= new deserializeXml();
        prova.whenJavaDeserializedFromXmlFile_thenCorrect();
    }


}
