package assignment1;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
//        DoubleTest doubleTest = new DoubleTest(52.52);
//        System.out.println(doubleTest.getaDouble());
//
//        StringTest stringTest = new StringTest("SQA Learning");
//        System.out.println(stringTest.getString());
//
//        IntegerTest integerTest = new IntegerTest(98754);
//        System.out.println(integerTest.getInteger());

//        DaTaTypeTest<Integer> integerDaTaTypeTest=new DaTaTypeTest<>(98754);
//        System.out.println(integerDaTaTypeTest.getData());
//
//        DaTaTypeTest<String> stringDaTaTypeTest=new DaTaTypeTest<>("SQA Learning");
//        System.out.println(stringDaTaTypeTest.getData());
//
//        DaTaTypeTest<Double> doubleDaTaTypeTest = new DaTaTypeTest<>(52.52);
//        System.out.println(doubleDaTaTypeTest.getData());

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
