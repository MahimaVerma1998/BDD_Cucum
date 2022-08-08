package BDD_Runner;

import junit.framework.TestCase;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features=".//Feature/BDD_Put.feature",
glue="BDD_StepDef",
dryRun = false,
monochrome = true)

public class BDD_PutRunner extends TestCase {

}


