package cucumberTest;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reglement.KilometerGeld;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class KilometerGeldStepsTest {

    private KilometerGeld kilometerGeld;

    @Given("a kilometergeld with id {int}, anzahlFahrer {int} and frankenProKm {double}")
    public void a_kilometergeld_with_id_anzahlFahrer_and_frankenProKm(int id, int anzahlFahrer, double frankenProKm) {
        kilometerGeld = new KilometerGeld(id, anzahlFahrer, frankenProKm);
    }

    @When("I create the kilometergeld")
    public void i_create_the_kilometergeld() {
        assertNotNull(kilometerGeld);
    }

    @Then("the kilometergeld's id should be {int}")
    public void the_kilometergeld_s_id_should_be(int id) {
        assertEquals(id, kilometerGeld.getKmgId());
    }

    @Then("the kilometergeld's anzahlFahrer should be {int}")
    public void the_kilometergeld_s_anzahlFahrer_should_be(int anzahlFahrer) {
        assertEquals(anzahlFahrer, kilometerGeld.getKmgAnzahlFahrer());
    }

    @Then("the kilometergeld's frankenProKm should be {double}")
    public void the_kilometergeld_s_frankenProKm_should_be(double frankenProKm) {
        assertEquals(frankenProKm, kilometerGeld.getKmgFrankenProKm(), 0.0001);
    }

    @Given("I have a kilometergeld with id {int}, anzahlFahrer {int}, and frankenProKm {double}")
    public void i_have_a_kilometergeld_with_id_anzahlFahrer_and_frankenProKm(int id, int anzahlFahrer, double frankenProKm) {
        kilometerGeld = new KilometerGeld(id, anzahlFahrer, frankenProKm);
    }

    @When("I verify the kmgvalues")
    public void i_verify_the_kmgvalues() {
        assertNotNull(kilometerGeld);
    }
}
