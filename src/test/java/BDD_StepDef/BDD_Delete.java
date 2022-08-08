package BDD_StepDef;

import cucumber.api.java.en.Given;
import static org.hamcrest.Matchers.*;



public class BDD_Delete {
	@Given("delete data")
	public void delete_data() {
		given().when().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
	}
}
