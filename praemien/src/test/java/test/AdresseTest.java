
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import person.Adresse;
import person.Person;
import java.time.LocalDate;

class AdresseTest {

    @Test
    public void testAdresseCreation() {
        Person person = new Person(1, "John", "Doe", 1234);
        Adresse adresse = new Adresse(1, 1, "Zielgasse", 99, 1234, "Altenrhein", LocalDate.now());
        adresse.setPerson(person);

        assertEquals(Integer.valueOf(1), adresse.getAdresseId());
        assertEquals(person, adresse.getPerson());
        assertEquals("Zielgasse", adresse.getAdresseStrasse());
        assertEquals(Integer.valueOf(99), adresse.getAdresseNummer());
        assertEquals(Integer.valueOf(1234), adresse.getAdressePlz());
        assertEquals("Altenrhein", adresse.getAdresseOrt());
    }
}
