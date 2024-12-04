package az.abbtech.lesson_8;

import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("A");
        for (String s : hashSet) {
            System.out.println(s);
        }

    }
}
