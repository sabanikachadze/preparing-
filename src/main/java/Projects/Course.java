package Projects;

public record Course(String code, String title, int capacity) {

    public Course {

        if (code == null) {
            throw new IllegalArgumentException("null code cannot exist");
        }

        if (!code.matches("[A-Z]{2,5}\\\\d{3}")) {
            throw new IllegalArgumentException("code doesn't match correct format");
        }

        if (title == null) {
            throw new IllegalArgumentException("title cannot be null");
        }

        if (title.length() < 2 || title.length() > 40) {
            throw new IllegalArgumentException("title must have character not more then 40 and not less then 2");
        }

        if (capacity < 1 || capacity > 150) {
            throw new IllegalArgumentException("capacity must be in between 1 and 150 inclusive");
        }
    }

}
