package cucumberTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import person.Person;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/java", glue = "praemien")
public class PersonStepsTest {
	
	private Person person;

	
	@Given("a person with id {int}, name {string} and firstname {string} and lizenzno {int}")
	public void a_person_with_id_name_and_first_name(int id, String name, String firstName, int lizenzno) {
		person = new Person(id, name, firstName, lizenzno);
	}

	@When("I create the person")
	public void i_create_the_person() {
		assertNotNull(person);
	}

	@Then("the person's id should be {int}")
	public void the_person_s_id_should_be(int id) {
		assertEquals(id, person.personId());
	}

	@Then("the person's name should be {string}")
	public void the_person_s_name_should_be(String name) {
		assertEquals(name, person.getPersonName());
	}

	@Then("the person's firstname should be {string}")
	public void the_person_s_firstname_should_be(String firstName) {
		assertEquals(firstName, person.getPersonVorname());
	}
	
	@Then("the person's lizenzno should be {int}")
	public void the_person_s_lizenzno_should_be(int lizenzno) {
	    assertEquals(lizenzno, person.getPersonLizenz());
	    
	}

}