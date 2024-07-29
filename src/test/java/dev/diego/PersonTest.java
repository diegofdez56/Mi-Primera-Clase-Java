package dev.diego;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    Person person1 = new Person("Diego", "Fernandez", "3939-A", 2003, "Spain", 'M');
    Person person2 = new Person("Jose", "Martinez", "3069-B", 2000, "Spain", 'M');

    @Test
    void testFirstName() {
        assertEquals("Diego", person1.getFirstName());
        assertEquals("Jose", person2.getFirstName());
    }

    @Test
    void testLastName() {
        assertEquals("Fernandez", person1.getLastName());
        assertEquals("Martinez", person2.getLastName());
    }

    @Test
    void testIdNumber() {
        assertEquals("3939-A", person1.getIdNumber());
        assertEquals("3069-B", person2.getIdNumber());
    }

    @Test
    void testBirthYear() {
        assertEquals(2003, person1.getBirthYear());
        assertEquals(2000, person2.getBirthYear());
    }

    @Test
    void testBirthCountry() {
        assertEquals("Spain", person1.getBirthCountry());
        assertEquals("Spain", person2.getBirthCountry());
    }

    @Test
    void testGender() {
        assertEquals('M', person1.getGender());
        assertEquals('M', person2.getGender());
    }
}