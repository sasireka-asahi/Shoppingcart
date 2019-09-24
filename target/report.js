$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "To Validate the login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To verify login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the \"\u003cusername\u003e\",\"\u003cpassword\u003e\" and click the login button",
  "keyword": "When "
});
formatter.step({
  "name": "when user enters the wrong credentials then user should not able to login to Homepage",
  "keyword": "Then "
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Navin",
        "12345"
      ]
    },
    {
      "cells": [
        "Kumar",
        "54321"
      ]
    },
    {
      "cells": [
        "Suresh",
        "78999"
      ]
    },
    {
      "cells": [
        "Vijay",
        "444444"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_in_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the \"Navin\",\"12345\" and click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_enter_the_and_click_the_login_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user enters the wrong credentials then user should not able to login to Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.when_user_enters_the_wrong_credentials_then_user_should_not_able_to_login_to_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_in_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the \"Kumar\",\"54321\" and click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_enter_the_and_click_the_login_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user enters the wrong credentials then user should not able to login to Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.when_user_enters_the_wrong_credentials_then_user_should_not_able_to_login_to_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_in_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the \"Suresh\",\"78999\" and click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_enter_the_and_click_the_login_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user enters the wrong credentials then user should not able to login to Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.when_user_enters_the_wrong_credentials_then_user_should_not_able_to_login_to_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_in_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the \"Vijay\",\"444444\" and click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_enter_the_and_click_the_login_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user enters the wrong credentials then user should not able to login to Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.when_user_enters_the_wrong_credentials_then_user_should_not_able_to_login_to_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To verify the registration page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the \"\u003cfirstname\u003e\",\"\u003clastname\u003e\",\"\u003cmobilenumber\u003e\",\"\u003cpassword\u003e\",\"\u003cday\u003e\",\"\u003cmonth\u003e\",\"\u003cyear\u003e\" and click the register button",
  "keyword": "When "
});
formatter.step({
  "name": "when user enters the correct then otp is generated to their mobile number",
  "keyword": "Then "
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "mobilenumber",
        "password",
        "day",
        "month",
        "year"
      ]
    },
    {
      "cells": [
        "Navin",
        "kumar",
        "9997777444",
        "Navin@123",
        "12",
        "Apr",
        "1995"
      ]
    },
    {
      "cells": [
        "Kavin",
        "Kumar",
        "7778888999",
        "Kumar@123",
        "13",
        "Jun",
        "2001"
      ]
    },
    {
      "cells": [
        "Saravanan",
        "nandha",
        "44444555554",
        "nandha@123",
        "12",
        "Jul",
        "2005"
      ]
    },
    {
      "cells": [
        "anand",
        "Kumar",
        "7777788888",
        "singa@123",
        "13",
        "Mar",
        "1984"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_in_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the registration page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the \"Navin\",\"kumar\",\"9997777444\",\"Navin@123\",\"12\",\"Apr\",\"1995\" and click the register button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_enter_the_and_click_the_register_button(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user enters the correct then otp is generated to their mobile number",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.when_user_enters_the_correct_then_otp_is_generated_to_their_mobile_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_in_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the registration page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the \"Kavin\",\"Kumar\",\"7778888999\",\"Kumar@123\",\"13\",\"Jun\",\"2001\" and click the register button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_enter_the_and_click_the_register_button(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user enters the correct then otp is generated to their mobile number",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.when_user_enters_the_correct_then_otp_is_generated_to_their_mobile_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_in_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the registration page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the \"Saravanan\",\"nandha\",\"44444555554\",\"nandha@123\",\"12\",\"Jul\",\"2005\" and click the register button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_enter_the_and_click_the_register_button(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user enters the correct then otp is generated to their mobile number",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.when_user_enters_the_correct_then_otp_is_generated_to_their_mobile_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in loginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_in_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the registration page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the \"anand\",\"Kumar\",\"7777788888\",\"singa@123\",\"13\",\"Mar\",\"1984\" and click the register button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_enter_the_and_click_the_register_button(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when user enters the correct then otp is generated to their mobile number",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.when_user_enters_the_correct_then_otp_is_generated_to_their_mobile_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});