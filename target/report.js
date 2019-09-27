$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "Login Action",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": ": Verify signup page valid input",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the valid \"\u003cemail\u003e\" \"\u003cfirstname\u003e\",\"\u003clastname\u003e\",\"\u003cpassword\u003e\",\"\u003cAddress\u003e\",\"\u003ccity\u003e\",\"\u003cstate\u003e\",\"\u003cZip\u003e\",\"\u003ccountry\u003e\",\"\u003cmobileno\u003e\",\"\u003cAddress1\u003e\" and click the register button and click the register button",
  "keyword": "When "
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
        "email",
        "firstname",
        "lastname",
        "password",
        "Address",
        "city",
        "state",
        "Zip",
        "country",
        "mobileno",
        "Address1"
      ]
    },
    {
      "cells": [
        "ss12345@mail.com",
        "ram",
        "sita",
        "Asahi@123",
        "Asahi,46 Fanepet 2nd Street",
        "chennai",
        "32",
        "600091",
        "United States",
        "9944021254",
        "address1"
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
  "name": "User is in landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_in_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the Signin button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.User_has_to_click_the_Signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Signin button navigate to open the  Authentication page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.signin_button_navigate_to_open_the_Authentication_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": ": Verify signup page valid input",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the valid \"ss12345@mail.com\" \"ram\",\"sita\",\"Asahi@123\",\"Asahi,46 Fanepet 2nd Street\",\"chennai\",\"32\",\"600091\",\"United States\",\"9944021254\",\"address1\" and click the register button and click the register button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.registrationvalid(String,String,String,String,String,String,String,String,String,String,String)"
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