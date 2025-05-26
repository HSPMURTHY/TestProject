package stepsforHOOKES;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookesDemo {
	@Before
	@Given("Hookes user is on login page")
	public void hookes_user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("@Given(\"Hookes user is on login page\")");
	    System.out.println("Inside - @Before");
	}
	    		

	@When("Hookes user enters (.*) and (.*)")
	public void hookes_user_enters_admin_and_admin123(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("@When(\"Hookes user enters Admin and admin123\")"+password +username);
	}

	@And("Hookes clicks on login button")
	public void hookes_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("\"Hookes clicks on login button\"");
	}
	
	
    @After
	@Then("Hookes user is naviagated to home page")
	public void hookes_user_is_naviagated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("\"Hookes user is naviagated to home page\"");
		System.out.println("Inside @After");
	}

}
