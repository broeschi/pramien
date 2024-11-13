package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import person.Adresse;

class AdresseTest {

	@Test
	public void testAdresseCreation() {
		Adresse adresse = new Adresse(1, 1, "Zielgasse", 99, 1234, "Altenrhein");
		assertEquals(Integer.valueOf(1), adresse.getAdresseId());
		assertEquals(Integer.valueOf(1), adresse.getAdressePersonId());
		assertEquals("Zielgasse", adresse.getAdresseStrasse());
		assertEquals(Integer.valueOf(99), adresse.getAdresseNummer());
		assertEquals(Integer.valueOf(1234), adresse.getAdressePlz());
		assertEquals("Altenrhein", adresse.getAdresseOrt());
	}

}
