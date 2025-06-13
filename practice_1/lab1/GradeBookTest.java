package lab1;

import practice_2.Student;
import java.util.*;

public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course("CS101", "Object-oriented Programming and Design", 4, "None");

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "A"));
        students.add(new Student(2, "B"));
        students.add(new Student(3, "C"));
        students.add(new Student(4, "D"));
        students.add(new Student(5, "E"));
        students.add(new Student(6, "F"));
        students.add(new Student(7, "G"));
        students.add(new Student(8, "H"));
        students.add(new Student(9, "I"));
        students.add(new Student(10, "J"));

        GradeBook gb = new GradeBook(course, students);
        gb.displayMessage();
        gb.displayGradeReport();
    }
}
