package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinationdeal {
	
	@Before
	public void setup() {
		System.out.println("launch br");
		System.out.println("enter uri");
	}
	
	@After
	public void teardown() {
		System.out.println("closed browser");
	}

@Given("user is on deal page")
public void user_is_on_deal_page() {
    System.out.println("user is on deal page");
}

@When("user fill details")
public void user_fill_details() {
    System.out.println("user fill details");
}

@Then("deal is created")
public void deal_is_created() {
  System.out.println("deal is created");
}



}
