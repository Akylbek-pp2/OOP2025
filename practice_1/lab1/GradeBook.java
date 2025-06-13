package lab1;

import practice_2.Student;
import java.util.*;

public class GradeBook {
    private Course course;
    private List<Student> students;

    public GradeBook(Course course, List<Student> students) {
        this.course = course;
        this.students = students;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.toString() + "!");
    }

    public void displayGradeReport() {
        System.out.println("\nPlease, input grades for students:");

        Scanner scanner = new Scanner(System.in);
        Map<Student, Integer> grades = new HashMap<>();

        for (Student s : students) {
            System.out.print(s.getName() + ": ");
            int grade = scanner.nextInt();
            grades.put(s, grade);
        }

        int sum = 0;
        int min = 101;
        int max = -1;
        Student minStudent = null;
        Student maxStudent = null;
        int[] distribution = new int[11];

        for (Map.Entry<Student, Integer> entry : grades.entrySet()) {
            int grade = entry.getValue();
            Student student = entry.getKey();
            sum += grade;

            if (grade < min) {
                min = grade;
                minStudent = student;
            }

            if (grade > max) {
                max = grade;
                maxStudent = student;
            }

            if (grade == 100) distribution[10]++;
            else distribution[grade / 10]++;
        }

        double avg = (double) sum / grades.size();

        System.out.printf("\nClass average is %.2f. ", avg);
        System.out.println("Lowest grade is " + min + " (" + minStudent.getName() + ", id: " + minStudent.getId() + ").");
        System.out.println("Highest grade is " + max + " (" + maxStudent.getName() + ", id: " + maxStudent.getId() + ").");

        System.out.println("\nGrades distribution:");
        for (int i = 0; i <= 10; i++) {
            if (i == 10) {
                System.out.print("100: ");
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            for (int j = 0; j < distribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public String toString() {
        return course.toString();
    }
}
