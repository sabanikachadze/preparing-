package Projects;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Line 1, valid.
        // expected: no exception, prints Enrollment[studentId=15, courseCode=JAVA054]
        System.out.println(new Enrollment(15, "JAVA054"));

        // Line 2, bad courseCode.
        // expected: courseCode must not be null
        try {
            new Enrollment(10, null);
            System.out.println("EXCEPTION");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Line 3, bad studentID AND capacity.
        // expected: studentID mustn't be negative(the courseCode is never checked)
        try {
            new Enrollment(-20, null);
            System.out.println("EXCEPTION");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


