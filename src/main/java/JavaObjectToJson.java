import org.json.JSONObject;

import java.util.Arrays;

class Car{
    public String brand;
    public String type;
    public String name;

    Car(String brand, String type, String name){
        this.brand = brand;
        this.type = type;
        this.name = name;
    }

    public String toString(){
        return "Car{brand='" + brand + "', type=" + type + ", name='" + name + "'}";
    }
}

public class JavaObjectToJson {

    public static void main(String[] args) {

        JSONObject obj = new JSONObject();

        Car car1 = new Car("Suzuki", "Sedan", "Baleno");

        obj.put("brand", car1.brand);
        obj.put("type", car1.type);
        obj.put("name", car1.name);

        System.out.println(car1.toString());
        System.out.println(obj);
    }
}
