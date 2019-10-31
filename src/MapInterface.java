import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, String> maps = new HashMap<>();
        maps.put("name", "kapil");
        maps.put("actor", " akshay");
        maps.put("company", "google");
//        maps.put("actor", "jony deep"); // key cannot be repeated but values can be repeated and it replace the orginal values

        System.out.println(maps);
        System.out.println(maps.get("name"));
        System.out.println(maps.keySet());
        System.out.println(maps.values());


        Set<String > keys = maps.keySet();
        for(String key : keys)
        {
            System.out.println(key + " " + maps.get(key));
        }
    }
}
