package az.abbtech.lesson_8;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
