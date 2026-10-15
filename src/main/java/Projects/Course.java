package Projects;

public record Course(String code, String title, int capacity) {

    public Course {

        // Null throws and rejects Course object creation because this course only would make sense with full specified values and clearly defined code that is used to identify , search and many more
        if (code == null) {
            throw new IllegalArgumentException("Code mustn't be null");
        }

        // Fors consistency and compactness we required specific format for the code and fo this instance we won't be needing many combinations and if it is required, we will adjust
        if (!code.matches("[A-Z]{2,5}\\d{3}")) {
            throw new IllegalArgumentException("code doesn't match specified format");
        }

        if (title == null) {
            throw new IllegalArgumentException("title mustn't be null");
        }

        if (title.length() < 2 || title.length() > 40) {
            throw new IllegalArgumentException("titles character count must be in between 2 and 40 inclusively");
        }

        if (capacity < 1 || capacity > 150) {
            throw new IllegalArgumentException("capacity must be in between 1 and 150 inclusively");
        }
    }

}
