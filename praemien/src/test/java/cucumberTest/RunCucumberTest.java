package cucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import cucumberTest.PersonStepsTest;
import cucumberTest.AdresseStepsTest;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/java/features")
public class RunCucumberTest {
	
}
