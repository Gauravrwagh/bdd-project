package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import PageObjects.AppointmentDetails;
import PageObjects.LoginPage;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import utility.utilities;

public class Steps extends BaseClass {
	
	
	

@Given("user launch Chrome browser")
public void user_launch_chrome_browser() {
	utilities u = new utilities();
	driver= u.setUP("Chrome");
    lp= new LoginPage(driver);
    ad= new AppointmentDetails(driver);
}

@When("user opens URL {string}")
public void user_opens_url(String URL) {
  driver.get(URL);
  
}
@When("click on appointment")
public void click_on_appointment() {
	lp.clickappointment();}

@When("user enter id as {string} and password as {string}")
public void user_enter_id_as_and_password_as(String id, String password) {
   lp.setUserName(id);
   lp.setPassword(password);
}

@When("click on login")
public void click_on_login() {
lp.clickLogin();
}

	//User filling Appointment details----------------------------------------------------------------------------------------------------------------


@Then("user can view appointment detail page")
public void user_can_view_appointment_detail_page() {
	 String title= driver.getTitle();
	 
	 System.out.println(title);
//	 Assert.assertEquals("CURA HEALTH CARE" , title);
   
}

@Then("user click on facility list")
public void user_click_on_facility_list() throws InterruptedException {
  ad.clickFacility();
  Thread.sleep(3000);
  Select select = new Select(ad.facilitiy);
	select.selectByValue("Hongkong CURA Healthcare Center");
  
  
}
       

@Then("user click checkbox")
public void user_click_checkbox() throws InterruptedException {
	Thread.sleep(5000);
	
	ad.clickcheckbox();
    
}
@Then("user select healthcare program")
public void user_select_healthcare_program() {
   ad.clicknone();
}
@Then("user enter visit date as {string}")
public void user_enter_visit_date_as(String string) {
	   ad.enterdate("12/08/1994");

}
@Then("user write comment abouut issue as {string}")
public void user_write_comment_abouut_issue_as(String string) {
   ad.comment_text("Backpain");
}
@Then("user click on book Appointment")
public void user_click_on_book_appointment() {
    ad.bookAppointment();
    }
  
}



	


