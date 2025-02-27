package com.programming.class1;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ReadAndWriteJSON {

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode jsonNode = objectMapper.createObjectNode();
        jsonNode.put("Name", "ABC");
        jsonNode.put("Age", "25");
        jsonNode.put("City", "Bengaluru");
        jsonNode.put("State", "Karnataka");
        jsonNode.put("Country", "India");
        
        ObjectMapper.writeValue(new File("mydata.json"), jsonNode);
        
        JsonNode jsonNode2 = objectMapper.readTree(new File("mydata.json"));
        String name = json
        
        
        
    }
}

