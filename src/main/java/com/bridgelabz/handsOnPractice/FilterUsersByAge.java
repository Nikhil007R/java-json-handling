package com.bridgelabz.handsOnPractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class FilterUsersByAge {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootArray = mapper.readTree(new File("users.json")); // Parse JSON array

        for (JsonNode user : rootArray) {
            int age = user.get("age").asInt();
            if (age > 25) {
                System.out.println("Name: " + user.get("name").asText() + ", Age: " + age);
            }
        }
    }
}

