package BDD_Runner;

import junit.framework.TestCase;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions(features=".//Feature/BDD_Delete.feature",
glue="BDD_StepDef",
dryRun = false,
monochrome = true)

public class BDD_DeleteRunner extends TestCase {

}


