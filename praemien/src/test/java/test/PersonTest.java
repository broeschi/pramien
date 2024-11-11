package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import person.Person;



class PersonTest {

	@Test
	public void testPersonCreation() {
		Person person = new Person(1, "Müller", "Hans", 1234567891);
		assertEquals(Integer.valueOf(1), person.getPersonId());
		assertEquals("Müller", person.getPersonName());
		assertEquals("Hans", person.getPersonVorname());
		assertEquals(Integer.valueOf(1234567891), person.getPersonLizenz());
		assertNotEquals(Integer.valueOf(123456789), person.getPersonLizenz());		
		

	}

}
