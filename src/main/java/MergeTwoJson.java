import org.json.JSONObject;

public class MergeTwoJson {

    public static void main(String[] args) {

        JSONObject obj1 = new JSONObject();
        obj1.put("name", "Nikhil");
        obj1.put("age", 21);

        JSONObject obj2 = new JSONObject();
        obj2.put("email", "nikhilrawaa311@gmail.com");
        obj2.put("id", 948);

        JSONObject merge = new JSONObject();

        for(String abc: obj1.keySet()){
            merge.put(abc, obj1.get(abc));
        }
        for(String abc: obj2.keySet()){
            merge.put(abc, obj2.get(abc));
        }

        System.out.println(merge);







    }
}
