package az.abbtech.homework_9;

import java.util.Comparator;

// Comparator for sorting alphabetically by name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
