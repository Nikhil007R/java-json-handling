import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;

import java.util.List;
import java.util.ArrayList;

class Person{
    private String name;
    private int age;
    private String color;

    Person(){}

    Person(String name, int age ,String color){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }
}

public class ListOfObjectsIntoArray {
    public static void main(String[] args) {

        Person p1 = new Person("Nikhil", 22 ,"black");
        Person p2 = new Person("Prakul", 21,"White");
        Person p3 = new Person("Pranav", 16,"Green");

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        ObjectMapper mapper = new ObjectMapper();
        try{
            String jsonArray = mapper.writeValueAsString(list);
            JSONArray jsonArray1 = new JSONArray(jsonArray);
            System.out.println(jsonArray1);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
