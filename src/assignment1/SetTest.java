package assignment1;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(54);
        integers.add(10);
        integers.add(54);
        integers.add(100);

        for (Integer integer : integers) {
            System.out.println(integer);
        }

        integers.add(80);
        integers.remove(54);

        System.out.println("==========================================");
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
