package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import jdk.internal.org.objectweb.asm.commons.Method;

public class OrangeloginPage_PF {
	
	@FindBy(name="username")WebElement PF_username;
	
	@FindBy(name="password")WebElement PF_password;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")WebElement PF_clickbutton;
	
	WebDriver PFdriver;
	
	public OrangeloginPage_PF(WebDriver driver) {
		this.PFdriver = driver;
		//PageFactory.initElements(PFdriver, Orangeloginpage_PF.class);
		PageFactory.initElements(PFdriver,this);
		System.out.println("PF - Constructor ");
	}
	
	/*By text_user = By.name("username");
	By text_password = By.name("password");
	By button_click = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	*/
	
	public void PFenterusername(String username) {
		PF_username.sendKeys(username);
		System.out.println("PF - PFenterusername " );
	}

	public void PFenterpassword(String password) {
		PF_password.sendKeys(password);
		System.out.println("PF - PFenterpassword " );
	}
	
	public void PFbuttonclick() {
		PF_clickbutton.click();
		System.out.println("PF - PFbuttonclick()  " );
		
	}
}
