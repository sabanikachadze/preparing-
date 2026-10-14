package Projects;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Line 1, valid.
        // expected: no exception, prints Student[id=5, name=Anna, surname=Berg, email=a@b.c]
        System.out.println(new Student(5, "Anna", "Berg", "a@b.c"));

        // Line 2, bad name AND bad surname.
        // expected: name must be in between 2-20 inclusive (the surname is never checked)
        try {
            new Student(1, "12", "@@", "a@b.c");
            System.out.println("NO EXCEPTION");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Line 3, null email.
        // expected: Email is faulty (change this comment if you changed the string in Student)
        try {
            new Student(1, "Anna", "Berg", null);
            System.out.println("NO EXCEPTION");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


