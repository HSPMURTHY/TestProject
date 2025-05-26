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
import pages.OrangeloginPage_PF;

public class OrangeLoginTestScript_PF {
		
	WebDriver driverPF =  null;
	
	OrangeloginPage_PF login;
	
	//@SuppressWarnings("deprecation")
	@Given("user is on login page")
	public void user_is_on_login_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("@Given(\"user is on login page\")");
	    System.out.println("======PF inside stepdefinition OrangeLogin==== PF");
	    driverPF = new ChromeDriver();
	    //driverPF.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    driverPF.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    login = new OrangeloginPage_PF(driverPF);
	    //LoginPOM login = new LoginPOM(driver1);
	    //driver1.quit();
	    Thread.sleep(3000);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username1, String password1) throws Exception  {
		
		//login = new OrangeloginPage_PF(driverPF);
		System.out.println("======PF inside stepdefinition OrangeLogin==== PF");
		login.PFenterusername(username1);
		Thread.sleep(300);
		login.PFenterpassword(password1);
		Thread.sleep(300);
		//login.PFbuttonclick();
		
		/*
		driver1.findElement(By.name("username")).sendKeys(username1);
		
		//<input data-v-1f99f73c="" class="oxd-input oxd-input--active" type="password" name="password" placeholder="Password">
		driver1.findElement(By.name("password")).sendKeys(password1);
		Thread.sleep(300);
		//driver1.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		//Thread.sleep(3000);
		driver1.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();*/
		}

	@And("clicks on login button")
	public void clicks_on_login_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("@And(\"clicks on login button\")");
		System.out.println("======PF inside stepdefinition OrangeLogin==== PF");
		Thread.sleep(300);
		login.PFbuttonclick();
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
		System.out.println("======PF inside stepdefinition OrangeLogin==== PF");
		driverPF.close();
		driverPF.quit();
		
	}

	
}
