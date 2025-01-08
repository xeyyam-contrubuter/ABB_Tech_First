package az.abbtech.homework_9;

import java.util.*;

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a map to store students
        Map<String, Student> studentMap = new HashMap<>();

        // Add some sample students
        studentMap.put("Alice", new Student("Alice", 85, 90, 80));
        studentMap.put("Bob", new Student("Bob", 75, 85, 95));
        studentMap.put("Charlie", new Student("Charlie", 90, 70, 85));

        // Sorting and displaying by total grades (natural order)
        List<Student> studentsByGrades = new ArrayList<>(studentMap.values());
        Collections.sort(studentsByGrades);

        System.out.println("Students sorted by total grades (descending):");
        for (Student student : studentsByGrades) {
            System.out.println(student);
        }

        // Sorting and displaying by name (alphabetical order)
        List<Student> studentsByName = new ArrayList<>(studentMap.values());
        studentsByName.sort(new NameComparator());

        System.out.println("\nStudents sorted by name (alphabetical):");
        for (Student student : studentsByName) {
            System.out.println(student);
        }
    }
}

