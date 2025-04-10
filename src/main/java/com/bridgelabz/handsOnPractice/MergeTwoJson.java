package com.bridgelabz.handsOnPractice;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Map;

public class MergeTwoJson {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // Read both JSONs as maps
        Map<String, Object> map1 = mapper.readValue(new File("user.json"), Map.class);
        Map<String, Object> map2 = mapper.readValue(new File("user2.json"), Map.class);

        // Merge map2 into map1
        map1.putAll(map2);

        // Convert merged map back to JSON
        String mergedJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map1);
        System.out.println(mergedJson);
    }
}

