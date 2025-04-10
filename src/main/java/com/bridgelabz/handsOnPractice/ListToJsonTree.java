package com.bridgelabz.handsOnPractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

class Car {
    public String brand;
    public String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}

public class ListToJsonTree {
    public static void main(String[] args) throws Exception {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Suzuki", "Baleno"));
        cars.add(new Car("Toyota", "Camry"));

        ObjectMapper mapper = new ObjectMapper();

        // Step 1: Convert list to JSON string
        String jsonArray = mapper.writeValueAsString(cars);

        // Step 2: Parse the JSON string as a JsonNode tree
        JsonNode root = mapper.readTree(jsonArray);

        // Step 3: Now you can access JSON array elements
        for (JsonNode carNode : root) {
            System.out.println("Brand: " + carNode.get("brand").asText());
            System.out.println("Model: " + carNode.get("model").asText());
        }
    }
}

