package Q2GradeBook;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private ArrayList<Integer> testScores;

    public Student(String name, String id) throws IllegalArgumentException {
        // Validate ID format
        if (!isValidID(id)) {
            throw new IllegalArgumentException("Invalid ID format");
        }

        this.name = name;
        this.id = id;
        this.testScores = new ArrayList<>();
    }

    public void addTestScore(int score) throws IllegalArgumentException {
        // Validate test score
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Invalid test score");
        }

        testScores.add(score);
    }

    public double calculateAverageScore() {
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        return (double) sum / testScores.size();
    }

    private boolean isValidID(String id) {
        // Add your ID validation logic here
        // For example, you can check if it's of a specific format (e.g., starts with "STU")
        return id.matches("STU\\d{4}");
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Integer> getTestScores() {
        return testScores;
    }

    public static void main(String[] args) {
        try {
            Student student = new Student("John Doe", "STU1234");
            student.addTestScore(85);
            student.addTestScore(92);

            System.out.println("Student Name: " + student.getName());
            System.out.println("Student ID: " + student.getId());
            System.out.println("Test Scores: " + student.getTestScores());
            System.out.println("Average Score: " + student.calculateAverageScore());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
