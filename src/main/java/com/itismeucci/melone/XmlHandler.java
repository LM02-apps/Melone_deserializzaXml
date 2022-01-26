package com.itismeucci.melone;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XmlHandler
{

    public root DeserializeXml() throws IOException {
        File file=new File("classe.xml");
        XmlMapper xmlMapper = new XmlMapper();
        //String xml=inputStreamToString(new FileInputStream(file));
        root value = xmlMapper.readValue(file,root.class);

        System.out.println ("la classe "+value.getClasse()+value.getSpecializzazione() +" si trova nell'aula "+value.getAula().getNome()+" ed è composta dai seguenti studenti:\n");
        System.out.println (value.getStudenti().get(0).getCognome()+"\n"+value.getStudenti().get(1).getCognome());
        return value;
       
    }
    
    public String SerializeXml(root prova) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(prova);
        return xml;
    }
    
    
    public  String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }


    public static void prettyPrint(String xml) throws TransformerException, ParserConfigurationException, SAXException, IOException
    {
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;

        builder=factory.newDocumentBuilder();
        Document doc= builder.parse(new InputSource(new StringReader(xml)));
  
    
        Transformer tf = TransformerFactory.newInstance().newTransformer();
        tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        tf.setOutputProperty(OutputKeys.INDENT, "yes");
        Writer out = new StringWriter();
        tf.transform(new DOMSource(doc), new StreamResult(out));
        System.out.println(out.toString());
    }
    
}

