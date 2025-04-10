import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

class User {
    private String name;
    private String email;

    // Required: Jackson needs a no-arg constructor
    public User() {}

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Optional: toString() for easy print
    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "'}";
    }
}


public class ReadJsonFile {

    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            User user = mapper.readValue(new File("user.json"),User.class);

            System.out.println("User" + user.getName());
            System.out.println("Email" + user.getEmail());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
