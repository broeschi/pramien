package cucumberTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reglement.Faktor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FaktorStepsTest {


    private Faktor faktor;

    @Given("a faktor with id {int}, idKat {int} and faktor {double}")
    public void a_faktor_with_id_idKat_and_faktor(int id, int idKat, double faktorWert) {
        faktor = new Faktor(id, idKat, faktorWert);
    }

    @When("I create the faktor")
    public void i_create_the_faktor() {
        assertNotNull(faktor);
    }

    @Then("the faktor's id should be {int}")
    public void the_faktor_s_id_should_be(int id) {
        assertEquals(id, faktor.getFaktorId());
    }

    @Then("the faktor's idKat should be {int}")
    public void the_faktor_s_idKat_should_be(int idKat) {
        assertEquals(idKat, faktor.getFaktorKatId());
    }

    @Then("the faktor's faktor should be {double}")
    public void the_faktor_s_faktor_should_be(double faktorWert) {
        assertEquals(faktorWert, faktor.getFaktorFaktor(), 0.0001);
    }

    @Given("I have a faktor with id {int}, idKat {int}, and faktor {double}")
    public void i_have_a_faktor_with_id_idKat_and_faktor(int id, int idKat, double faktorWert) {
        faktor = new Faktor(id, idKat, faktorWert);
    }

    @When("I verify the values")
    public void i_verify_the_values() {
        assertNotNull(faktor);
    }
}

