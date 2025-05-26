package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeLogin {
		
	/*WebDriver driver1 =  null;
	
	
	@SuppressWarnings("deprecation")
	@Given("user is on login page")
	public void user_is_on_login_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("@Given(\"user is on login page\")");
	    System.out.println("======inside stepdefinition OrangeLogin====");
	    driver1 = new ChromeDriver();
	    driver1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    //driver1.quit();
	    Thread.sleep(3000);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username1, String password1) throws Exception  {
		driver1.findElement(By.name("username")).sendKeys(username1);
		Thread.sleep(300);
		//<input data-v-1f99f73c="" class="oxd-input oxd-input--active" type="password" name="password" placeholder="Password">
		driver1.findElement(By.name("password")).sendKeys(password1);
		Thread.sleep(300);
		//driver1.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		//Thread.sleep(3000);
		driver1.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		}

	@And("clicks on login button")
	public void clicks_on_login_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("@And(\"clicks on login button\")");
		//<button data-v-10d463b7="" data-v-0af708be="" type="submit" class="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"><!----> Login <!----></button>
		////*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button
		//  /html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button 
		//driver1.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
	}

	@Then("user is naviagated to home page")
	public void user_is_naviagated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("@Then(\"user is naviagated to home page\")");
		driver1.close();
		driver1.quit();
		
	}

	*/
}
