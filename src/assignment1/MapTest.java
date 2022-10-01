package assignment1;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> maps = new HashMap<>();
        maps.put("name", "nahisa");
        maps.put("countryName", "USA");
        maps.put("id", "2");
        System.out.println("==========================================");
        System.out.println(maps);
        System.out.println(maps.get("countryName"));

        Map<String, Object> json = new HashMap<>();
        json.put("id", 7);
        json.put("email", "michael.lawson@reqres.in");
        json.put("name", "Ali Ahsan");

        System.out.println("==========================================");
        System.out.println(json);
        json.remove("email");
        System.out.println(json.get("name"));
        System.out.println(json);
    }
}
