package EmailRegs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageFactrory.EmailRegsPageFactrory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefn {
	
	WebDriver driver;
	 private EmailRegsPageFactrory factory;
	
	
	 @Given("^User is on registration page$")
	 public void user_is_on_registration_page() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
		 driver = new FirefoxDriver();
		 Thread.sleep(1000);
		   factory = new EmailRegsPageFactrory(driver);
		   driver.get("file:///D:/Module%203/BDD%20for%20Full%20Stack/Demos/Lesson%205-HTML%20Pages/WorkingWithForms.html");
	 }

	 @Then("^check the heading of the page$")
	 public void check_the_heading_of_the_page() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
		 
		 String strheading = driver.findElement(By.xpath("html/body/h1")).getText();
			if(strheading.contentEquals("Email Registration")) {
				System.out.println("Heading matches");
			}
			else {
				System.out.println("Heading does not match");
			}
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			 Thread.sleep(1000);
			driver.close();
		 
	 }
	 
	 @When("^User enters two different passwords$")
	 public void user_enters_two_different_passwords() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException(); factory.setPassword("capg1234#");
		 driver.manage().window().maximize();
		 factory.setPassword("capg1234#");
		 factory.setConfirm("capg");
		 
		
		 
		 	 }

	 @Then("^display alert messgaes$")
	 public void display_alert_messgaes() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
		 driver.manage().window().maximize();		 		 
		 Thread.sleep(1000);
		   
	 }

	 @When("^User enters all details correctly$")
	 public void user_enters_all_details_correctly() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
		 driver.manage().window().maximize();
		 factory.setuName("shruti@gmail.com");
		 Thread.sleep(1000);
		 factory.setPassword("capg1234#");Thread.sleep(1000);
		 factory.setConfirm("capg1234#");Thread.sleep(1000);
		 factory.setfName("Shruti");Thread.sleep(1000);
		 factory.setlName("Shukla");Thread.sleep(1000);
		 factory.setRadio("Female");Thread.sleep(1000);
		 factory.setDate("20-11-1996");Thread.sleep(1000);
		 factory.setEmail("shukla20@gmail.com");Thread.sleep(1000);
		 factory.setAddress("Hinjewadi");Thread.sleep(1000);
		 factory.setCity("Pune");Thread.sleep(1000);
		 factory.setNumber("9568624212");Thread.sleep(1000);
		 factory.setHobbies("Reading");Thread.sleep(1000);
		 factory.setHobbies("Music");Thread.sleep(1000);
		 factory.setSub();
		 
	 }

	
	 @Then("^display the success message$")
	 public void display_the_success_message() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
		 driver.manage().window().maximize();
		 System.out.println("Registration successfull");
		 
		 driver.navigate().to("file:///D:/Users/shrutshu/Desktop/success.html");
	 }


	
	 @When("^User clicks on reset button$")
	 public void user_clicks_on_reset_button() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
		 driver.manage().window().maximize();
		 factory.setuName("shruti@gmail.com");
		 Thread.sleep(1000);
		 factory.setPassword("capg1234#");Thread.sleep(1000);
		 factory.setConfirm("capg1234#");Thread.sleep(1000);
		 factory.setfName("Shruti");Thread.sleep(1000);
		 factory.setlName("Shukla");Thread.sleep(1000);
		 factory.setRadio("Female");Thread.sleep(1000);
		 factory.setDate("20-11-1996");Thread.sleep(1000);
		 factory.setEmail("shukla20@gmail.com");Thread.sleep(1000);
		 factory.setAddress("Hinjewadi");Thread.sleep(1000);
		 factory.setCity("Pune");Thread.sleep(1000);
		 factory.setNumber("9568624212");Thread.sleep(1000);
		 factory.setHobbies("Reading");Thread.sleep(1000);
		 factory.setHobbies("Music");Thread.sleep(1000);
		 factory.setRest();
	 }

	 @Then("^navigate to registration page$")
	 public void navigate_to_registration_page() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
		 driver.navigate().to("file:///D:/Module%203/BDD%20for%20Full%20Stack/Demos/Lesson%205-HTML%20Pages/WorkingWithForms.html");
	 }


}
