package org.stepdefenition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.packag.LoginpagePojoClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends BaseClass1{

	

@Given("User is in landing page")
public void user_is_in_loginpage() {
    LaunchBrowser();
    goToUrl("http://automationpractice.com/index.php");    
}

@When("User has to click the Signin button")
public void User_has_to_click_the_Signin_button() {
	LoginpagePojoClass l = new LoginpagePojoClass();
	l.sigin().click();
}

@Then("Signin button navigate to open the  Authentication page")
public void signin_button_navigate_to_open_the_Authentication_page() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(driver.getTitle().contains("My Store"));
}


@When("User has to enter the invalid {string},{string} and click the login button")
public void user_enter_invalid_username_and_password(String s1,String s2) {
    // Write code here that turns the phrase above into concrete actions
	 LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  insertValues(l.getUserName(),s1);
	  insertValues(l.getPassword(),s2);
	  l.getBtn().click();
}

@Then("promopt the error message")
public void promopt_the_error_message1() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("the error message is");
}

@Given("User is in Signinpage and verify tiltle")
public void user_is_in_Signinpage_and_verify_tiltle() {
    // Write code here that turns the phrase above into concrete actions
	 Assert.assertTrue(driver.getTitle().contains("Login - My Store"));
}

@When("User has to enter the valid {string},{string} and click the login button")
public void user_enter_valid_username_and_password(String s1,String s2) {
    // Write code here that turns the phrase above into concrete actions
	 LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  insertValues(l.getUserName(),s1);
	  insertValues(l.getPassword(),s2);
	  l.getBtn().click();
}

@Then("Navigate to open the Home page")
public void promopt_the_error_message() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("the error message is");
}
    
@When("User has to enter the invalid {string} {string},{string},{string},{string},{string},{string},{string},{string},{string},{string} and click the register button and click the register button")
public void signupinvalid(String s0,String s1,String s2, String s3, String s4, String s5, String s6, String s7,String s8, String s9, String s10) {
    // Write code here that turns the phrase above into concrete actions
	LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  insertValues(l.getsignupemail(),s0);
	  l.getcreateBtn().click();
	  insertValues(l.getregFirstname(),s1);
      insertValues(l.getregLastname(),s2);
      insertValues(l.getregpassword(),s3);
      insertValues(l.getregaddress(),s4);
      insertValues(l.getregcity(),s5);
      System.out.println("s6 is" +s6);
      System.out.println((l.getstate()));
      dropdown1(l.getstate(),s6);
       insertValues(l.getregzip(), s7);
	   dropdown2(l.getregcountry(),s8);
	   insertValues(l.getregmobileno(), s9);
	   insertValues(l.getregaddress1(), s10);
      l.getSubmitregbtn().click();
}


@Then("Prompt the error")
public void signupinvalidemail() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(driver.getTitle().contains("Invalid email address"));
}


 @When("User has to enter the valid {string} {string},{string},{string},{string},{string},{string},{string},{string},{string},{string} and click the register button and click the register button")
public void registrationvalid(String s0,String s1, String s2, String s3, String s4, String s5, String s6, String s7,String s8, String s9, String s10) {
	 LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  insertValues(l.getsignupemail(),s0);
	  l.getcreateBtn().click();
	  insertValues(l.getregFirstname(),s1);
      insertValues(l.getregLastname(),s2);
      insertValues(l.getregpassword(),s3);
      insertValues(l.getregaddress(),s4);
      insertValues(l.getregcity(),s5);
      dropdown1(l.getstate(),s6);
       insertValues(l.getregzip(), s7);
	   dropdown2(l.getregcountry(),s8);
	   insertValues(l.getregmobileno(), s9);
	   insertValues(l.getregaddress1(), s10);
      l.getSubmitregbtn().click();
      

}


@Then("close the browser")
public void close_the_browser() {
    driver.close();
}
}