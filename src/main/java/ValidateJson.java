import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

class User1 {
    private String name;
    private String email;

    public User1() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "'}";
    }
}
public class ValidateJson {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Validate structure by deserializing into POJO
            User1 user = mapper.readValue(new File("user.json"), User1.class);

            System.out.println("Valid JSON structure");
            System.out.println(user);

        } catch (Exception e) {
            System.out.println("Invalid JSON structure: " + e.getMessage());
        }
    }
}
