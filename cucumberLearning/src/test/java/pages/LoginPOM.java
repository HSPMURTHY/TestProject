package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {
	
	WebDriver driverPOM;
	
	By text_user = By.name("username");
	By text_password = By.name("password");
	By button_click = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	
	public LoginPOM(WebDriver driverTC) {
		this.driverPOM = driverTC;		
	}
	
	public void enterusername(String username1) {
		
		driverPOM.findElement(text_user).sendKeys(username1);
	}
	
	public void enterpassword(String password1) {
		driverPOM.findElement(text_password).sendKeys(password1);
		//System.out.println("enterpassword - " +this.getClass());
		
	}
	
	public void clickbutton() throws Exception {
		driverPOM.findElement(button_click).click();
		Thread.sleep(3000);
		//System.out.println("enterpassword - " +this.getClass());
	}
	
	public void validateuser(String username, String password) {
		
		driverPOM.findElement(text_user).sendKeys(username);
		driverPOM.findElement(text_password).sendKeys(password);
		driverPOM.findElement(button_click).click();
	}
	

}
