package com.itismeucci.melone;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonHandler {
    public void serializeJson(String prova) throws IOException
    {
        XmlMapper xmlMapper = new XmlMapper();
        JsonNode node = xmlMapper.readTree(prova.getBytes());

        ObjectMapper jsonMapper = new ObjectMapper();
        String json = jsonMapper.writeValueAsString(node);
    }
    
}
