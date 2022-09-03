package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using= "Make Appointment")
	WebElement appointment;
	

	@FindBy(id="txt-username")
	@CacheLookup
	WebElement username;
	
	@FindBy(id="txt-password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="btn-login")
	@CacheLookup
	WebElement Login;
	
/*	@FindBy(linkText="Logout")
	@CacheLookup
	WebElement lnkLogout;
*/	
	public void  clickappointment() {
		appointment.click();
	}
	
	public void setUserName(String uname) {
		username.clear();
		username.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		Login.click();
	}

	
	
}
