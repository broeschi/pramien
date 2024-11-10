package test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import person.Person;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = "praemien")
public class PersonStepsTest extends Person{
	
	private Person person;

	@Given("a person with id {int}, name {string}, and frist name {string}, and lizenzno {int}")
	public void a_person_with_id_name_and_first_name(int id, String name, String firstName, int lizenzno) {
		person = new Person(id, name, firstName, lizenzno);
	}

	@When("I create the person")
	public void i_create_the_person() {
		assertNotNull(person);
	}

	@Then("the person's id should be {int}")
	public void the_person_s_id_should_be(IntegerProperty id) {
		assertEquals(id, person.getAdrId());
	}

	@Then("the person's name should be {string}")
	public void the_person_s_name_should_be(StringProperty name) {
		assertEquals(name, person.getAdrName());
	}

	@Then("the person's first name should be {string}")
	public void the_person_s_first_name_should_be(StringProperty firstName) {
		assertEquals(firstName, person.getAdrVorname());
	}
}