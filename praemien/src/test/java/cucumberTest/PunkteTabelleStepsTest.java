package cucumberTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reglement.PunkteTabelle;

public class PunkteTabelleStepsTest extends PunkteTabelle {

	private PunkteTabelle punkteTabelle;

	@Given("a punktetabelle with id {int}, idRennart {int} and rang {int} and punkte {int}")
	public void a_punktetabelle_with_id_id_rennart_and_rang_and_punkte(int id, int idRennart, int rang, int punkte) {
		punkteTabelle = new PunkteTabelle(id, idRennart, rang, punkte);
		// Write code here that turns the phrase above into concrete actions
	}

	@When("I create the punktetabelle")
	public void i_create_the_punktetabelle() {
		assertNotNull(punkteTabelle);
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("the punktetabelle's id should be {int}")
	public void the_punktetabelle_s_id_should_be(int id) {
		assertEquals(id, punkteTabelle.getPunktId());
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("the punktetabelle's rang should be {int}")
	public void the_punktetabelle_s_rang_should_be(int rang) {
		assertEquals(rang, punkteTabelle.getPunktRang());
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("the punktetabelle's idRennart should be {int}")
	public void the_punktetabelle_s_id_rennart_should_be(Integer idRennart) {
		assertEquals(idRennart, punkteTabelle.getPunktRennartId());
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("the punktetabelle's punkte should be {int}")
	public void the_punktetabelle_s_punkte_should_be(int punkte) {
		assertEquals(punkte, punkteTabelle.getPunktPunkte());
		// Write code here that turns the phrase above into concrete actions
	}



	@Given("I have a rang {int} and a idRennart {int}")
	public void i_have_a_rang_and_a_id_rennart(int rang, int idRennart) {
		this.punktRang = rang;
		this.punktRennartId = idRennart;
	}

	@When("I check the value for {int} punkte")
	public void i_check_the_value_for_id_rennart_und_punkte(int punkte) {
		
		this.punktPunkte = punkte;
	}

	@Then("the punkte should be korrekt")
	public void the_punkte_should_be_korrekt() {
		assertTrue(punktPunkte > 5, "Die Punkte sind korrekt");
	}

}
