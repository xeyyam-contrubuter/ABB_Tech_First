package az.abbtech.homework_7;

public class Main {
    public static void main(String[] args) {
        // Generic Storage for Students
        GenericStorage<Student> studentStorage = new GenericStorage<>();
        studentStorage.addItem("Khayyam", 20);
        studentStorage.addItem("Renat", 22);

        // Generic Storage for Teachers
        GenericStorage<Teacher> teacherStorage = new GenericStorage<>();
        teacherStorage.addItem("Javidan", 45);
        teacherStorage.addItem("Rovshan", 50);

        // Display all students
        System.out.println("\nStudents:");
        studentStorage.displayAllItems();

        // Display all teachers
        System.out.println("\nTeachers:");
        teacherStorage.displayAllItems();

        // Search for a student
        System.out.println("\nSearch for Student with ID 1:");
        System.out.println(studentStorage.searchItem(1));

        // Remove a teacher
        teacherStorage.removeItem(2);

        // Display all teachers after removal
        System.out.println("\nTeachers after removal:");
        teacherStorage.displayAllItems();
    }
}
