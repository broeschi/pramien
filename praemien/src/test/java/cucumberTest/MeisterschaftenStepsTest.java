package cucumberTest;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reglement.Meisterschaften;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MeisterschaftenStepsTest extends Meisterschaften {

    private Meisterschaften meisterschaft;

    @Given("a meisterschaft with id {int}, name {string} and abk {string}")
    public void a_meisterschaft_with_id_name_and_abk(int id, String name, String abk) {
        meisterschaft = new Meisterschaften(id, name, abk);
    }

    @When("I create the meisterschaft")
    public void i_create_the_meisterschaft() {
        assertNotNull(meisterschaft);
    }

    @Then("the meisterschaft's id should be {int}")
    public void the_meisterschaft_s_id_should_be(int id) {
        assertEquals(id, meisterschaft.getMeisterId());
    }

    @Then("the meisterschaft's name should be {string}")
    public void the_meisterschaft_s_name_should_be(String name) {
        assertEquals(name, meisterschaft.getMeisterName());
    }

    @Then("the meisterschaft's abk should be {string}")
    public void the_meisterschaft_s_abk_should_be(String abk) {
        assertEquals(abk, meisterschaft.getMeisterAbk());
    }

}
