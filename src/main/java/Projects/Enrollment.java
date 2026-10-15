package Projects;

public record Enrollment(long studentId, String courseCode) {

    public Enrollment {

        if (studentId < 1){
            throw new IllegalArgumentException("studentId must be positive number");
        }


        // I am not testing format of the code because that is job of other record itself, here we only check if there was a slip up in creation of the enrollment, correctness should be checked before creation of enrolment
        if(courseCode == null){
            throw new IllegalArgumentException("courseCode must not be null");
        }

    }
}