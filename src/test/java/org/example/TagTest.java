package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;


class TagTest {
    private Tag testTag;
    private Map<MutableTag, String> testMap;

    @BeforeEach
    public void populate() {
        testTag = new Tag("Java");
        testMap = new HashMap<>();
    }

    @Test
    public void testTagEqualReflexRule() {
        assertEquals(testTag, testTag);
    }

    @Test
    public void testTagEqualSymmetricRule() {
        Tag tag = new Tag("Java");

        assertEquals(testTag, tag);
        assertEquals(tag, testTag);
    }

    @Test
    public void testTagEqualTransitiveRule() {
        Tag tag1 = new Tag("Java");
        Tag tag2 = new Tag("Java");
        Tag tag3 = new Tag("Java");

        assertEquals(tag1, tag2);
        assertEquals(tag2, tag3);
        assertEquals(tag1, tag3);
    }

    @Test
    public void testTagEqualNullRule() {
        assertFalse(testTag.equals(null));
    }


    @Test
    public void testTagEqualAndHashcodeAreConsistent() {
        Map<Tag, String> testMap = new HashMap<>();

        Tag tag1 = new Tag("Java");
        Tag tag2 = new Tag("Java");

        assertEquals(tag1, tag2);
        assertEquals(tag1.hashCode(), tag2.hashCode());

        testMap.put(tag1, "testing");

        assertEquals("testing", testMap.get(tag2));

    }

    @Test
    public void testHashMapLookupFailsAfterKeyMutation() {
        MutableTag mutableTag = new MutableTag("Java");

        testMap.put(mutableTag, "testing");

        mutableTag.setName("Spring");

        assertNull(testMap.get(mutableTag));
    }


    @Test
    public void testHashMapLookupFreshKeyWithOldNameFails() {
        MutableTag mutableTag1 = new MutableTag("Java");
        MutableTag mutableTag2 = new MutableTag("Java");

        testMap.put(mutableTag1, "testing");

        mutableTag1.setName("Spring");

        assertNull(testMap.get(mutableTag2));
    }

    @Test
    public void compareTestToStringFails(){
        String text = "Java";

        assertNotEquals(text, testTag);
    }


    private static class MutableTag {
        private String name;

        MutableTag(String name) {
            this.name = name;
        }

        void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            return Objects.equals(name, ((MutableTag) o).name);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(name);
        }
    }
}