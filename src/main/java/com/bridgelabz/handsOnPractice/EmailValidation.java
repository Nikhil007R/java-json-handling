package com.bridgelabz.handsOnPractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.File;
import java.io.IOException;

public class EmailValidation {
    public static void main(String[] args) throws IOException, ProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        // Load JSON Schema from file
        JsonNode schemaNode = objectMapper.readTree(new File("schema.json"));
        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema schema = factory.getJsonSchema(schemaNode);

        // Load JSON data from file
        JsonNode jsonData = objectMapper.readTree(new File("user.json"));

        // Validate JSON
        if (schema.validate(jsonData).isSuccess()) {
            System.out.println("Email JSON is valid!");
        } else {
            System.out.println("Email JSON is invalid!");
        }
    }
}

