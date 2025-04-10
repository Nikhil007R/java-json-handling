import org.json.JSONArray;
import org.json.JSONObject;

public class JsonStudent {

    public static void main(String[] args) {

        JSONObject Student = new JSONObject();
        JSONArray subjects = new JSONArray();

        subjects.put("Computer Networks");
        subjects.put("Operating System");
        subjects.put("Data Structures");

        Student.put("name", "Nikhil");
        Student.put("age", 22);
        Student.put("subjects", subjects);

        System.out.println(Student);

    }
}
