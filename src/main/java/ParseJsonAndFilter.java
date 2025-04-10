import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ParseJsonAndFilter {

    public static void main(String[] args) {

        try{

            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(new File("users.json"));

            for (JsonNode node : root) {
                int age = node.get("age").asInt();
                if (age > 25) {
                    String name = node.get("name").asText();
                    System.out.println("Name: " + name + ", Age: " + age);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
