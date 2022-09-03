package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentDetails {
	
	public WebDriver driver;
	
	
	
	@FindBy(xpath ="//*[@class='col-sm-4']/select")
	public WebElement facilitiy;
	
	@FindBy(id="chk_hospotal_readmission")
	WebElement checkbox;
	
	@FindBy(id="radio_program_none")
	WebElement none;
	
	@FindBy(id="txt_visit_date")
	WebElement date;
	
	@FindBy(id="txt_comment")
	WebElement text;
	
	@FindBy(id ="btn-book-appointment")
	WebElement book;
	
	
	public void clickFacility() {
		facilitiy.click();
		
	}
	
	public AppointmentDetails(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	public void clickcheckbox() {
		checkbox.click();
	}
	
	public void clicknone() {
		none.click();
	}
	
	public void enterdate(String A_date) {
		date.sendKeys(A_date);
	}
	
	public void comment_text(String txt) {
		text.sendKeys(txt);
	}
	
	public void bookAppointment() {
		book.click();
	}

}
