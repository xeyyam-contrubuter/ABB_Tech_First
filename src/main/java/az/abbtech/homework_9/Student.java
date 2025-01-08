package az.abbtech.homework_9;

// Student class implementing Comparable
class Student implements Comparable<Student> {
    private String name;
    private int mathGrade;
    private int scienceGrade;
    private int englishGrade;

    public Student(String name, int mathGrade, int scienceGrade, int englishGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.englishGrade = englishGrade;
    }

    public String getName() {
        return name;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getScienceGrade() {
        return scienceGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public int getTotalGrade() {
        return mathGrade + scienceGrade + englishGrade;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(other.getTotalGrade(), this.getTotalGrade()); // Descending order
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Math: %d, Science: %d, English: %d, Total: %d",
                name, mathGrade, scienceGrade, englishGrade, getTotalGrade());
    }
}
