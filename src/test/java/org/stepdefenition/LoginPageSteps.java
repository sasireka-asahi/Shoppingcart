package org.stepdefenition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.packag.LoginpagePojoClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends BaseClass1{

	

@Given("User is in loginpage")
public void user_is_in_loginpage() {
    LaunchBrowser();
    goToUrl("https://www.facebook.com/");
}
//
//@When("User has to enter the username and password and click the login button")
//public void user_has_to_enter_the_username_and_password_and_click_the_login_button() {
//	LoginpagePojoClass l = new LoginpagePojoClass();
//	insertValues(l.getUserName(),"Navin");
//	insertValues(l.getPassword(),"123456666");
//    l.getBtn().click();
//}

@When("User has to enter the {string},{string} and click the login button")
public void user_has_to_enter_the_and_click_the_login_button(String s1, String s2) {
  LoginpagePojoClass l =new LoginpagePojoClass();
  insertValues(l.getUserName(),s1);
  insertValues(l.getPassword(),s2);
  l.getBtn().click();

}

@When("User has to enter the {string},{string},{string},{string},{string},{string},{string} and click the register button")
public void user_has_to_enter_the_and_click_the_register_button(String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
	  LoginpagePojoClass l =new LoginpagePojoClass();
      insertValues(l.getFirstnamefb(),s1);
      insertValues(l.getLastnamefb(),s2);
      insertValues(l.getMobilenofb(),s3);
      insertValues(l.getNewpassfb(),s4);
      dropdown1(l.getDayfb(),s5);
      dropdown(l.getMonthfb());
      dropdown2(l.getYearfb(), s7);
      l.getSexfb().click();
      l.getSubmitfb().click();
      System.out.println("User's registrationform submitted");
      

}


@Then("when user enters the wrong credentials then user should not able to login to Homepage")
public void when_user_enters_the_wrong_credentials_then_user_should_not_able_to_login_to_Homepage() {
    Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
}



@Then("when user enters the correct then otp is generated to their mobile number")
public void when_user_enters_the_correct_then_otp_is_generated_to_their_mobile_number() {
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
	System.out.println("The user is sent with OTP to your mobile number,please verify thats you");
	
}


@Then("close the browser")
public void close_the_browser() {
    driver.close();
}
//@Then("when user enters the correct credentials then user should able to login to Homepage")
//public void when_user_enters_the_correct_credentials_then_user_should_able_to_login_to_Homepage() {
//	
// 
//}

	
	
	
	
	
	
	
	
	
}
