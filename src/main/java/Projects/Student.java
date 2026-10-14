package Projects;

public record Student(long id, String name, String surname, String email) {

    public Student {
        if (id < 1) {
            throw new IllegalArgumentException("id must be positive");
        }
        requireLetters(name, "name");
        requireLetters(surname, "surname");

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("invalid email");
        }
    }

    private static void requireLetters(String value, String field) {

        if(field == null){
             throw new IllegalArgumentException("field mustn't be null");
        }

        if (value == null) {
            throw new IllegalArgumentException(field + " cannot be null");
        }

        if (!value.matches("\\p{L}{2,20}")) {
            throw new IllegalArgumentException(field + " must be in between 2-20 inclusive");
        }

    }

}