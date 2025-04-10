package com.bridgelabz.handsOnPractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class PrintKeyValues {
    public static void main(String[] args) throws Exception {

//        we can use readValue with mapping as Map<String, object>

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("user.json"));  // parsing JSON

        // Iterate through fields (keys and values)
        root.fieldNames().forEachRemaining(field -> {
            JsonNode value = root.get(field);
            System.out.println("Key: " + field + ", Value: " + value);
        });
    }
}

