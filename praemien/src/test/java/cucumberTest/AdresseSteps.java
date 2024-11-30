
package cucumberTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import person.Adresse;
import person.Person;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AdresseSteps {
    private Adresse adresse;

    @Given("a adresse with adrid {int}, idPerson {int} and strasse {string} and nummer {int} and plz {int} and ort {string}")
    public void a_adresse_with_id_adresse_and_id_Person(int adrid, int idPerson, String strasse, int nummer, int plz, String ort) {
        Person person = new Person(idPerson, "John", "Doe", 1234); // Create a dummy person
        adresse = new Adresse(adrid, idPerson, strasse, nummer, plz, ort, LocalDate.now());
        adresse.setPerson(person); // Set the person object
    }

    @When("I create the adresse")
    public void i_create_the_adresse() {
        assertNotNull(adresse);
    }

    @Then("the adresse's adrid should be {int}")
    public void the_adresse_s_id_should_be(int adrid) {
        assertEquals(adrid, adresse.getAdresseId());
    }

    @Then("the adresse's idPerson should be {int}")
    public void the_adresse_person_id_should_be(int idPerson) {
        assertEquals(idPerson, adresse.getPerson().getPersonId());
    }

    @Then("the adresse's strasse should be {string}")
    public void the_adresse_s_strasse_should_be(String strasse) {
        assertEquals(strasse, adresse.getAdresseStrasse());
    }

    @Then("the adresse's nummer should be {int}")
    public void the_adresse_s_strasse_souhld_be(int nummer) {
        assertEquals(nummer, adresse.getAdresseNummer());
    }

    @Then("the adresse's plz should be {int}")
    public void the_adresse_s_plz_should_be(int plz) {
        assertEquals(plz, adresse.getAdressePlz());
    }

    @Then("the adresse's ort should be {string}")
    public void the_adresse_s_ort_should_be(String ort) {
        assertEquals(ort, adresse.getAdresseOrt());
    }
}
