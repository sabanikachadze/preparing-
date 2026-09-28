package org.example;

import java.util.Objects;

public class CorrectEqualsAndHashCode {

    class Tag {
        private final String name;

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Tag tag = (Tag) o;
            return Objects.equals(name, tag.name);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(name);
        }

        Tag(String name) {
            Objects.requireNonNull(name, "Name must not be null");
            this.name = name;
        }
    }
}
