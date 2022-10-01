package assignment1;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //press Ctrl + click
        List<String> strings = new ArrayList<>();
        strings.add("Obaidul");
        strings.add("sharif vi");
        strings.add("nahida");
        strings.add("nahida");
        strings.add(null);
        System.out.println("Fist " + strings.get(0));

        System.out.println("==========================================");
        for (String s : strings) {
            System.out.println(s);
        }
        strings.remove(1);

        System.out.println("==========================================");
        for (String s : strings) {
            System.out.println(s);
        }

        strings.add(1, "ali ahsan");
        System.out.println("==========================================");
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
