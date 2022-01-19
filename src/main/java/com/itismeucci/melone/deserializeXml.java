package com.itismeucci.melone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class deserializeXml
{

    public void whenJavaDeserializedFromXmlFile_thenCorrect() throws IOException {
        File file=new File("classe.xml");
        XmlMapper xmlMapper = new XmlMapper();
        //String xml=inputStreamToString(new FileInputStream(file));
        root value = xmlMapper.readValue(file,root.class);

        System.out.println(value.getAnnoDiInizio());
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
}

