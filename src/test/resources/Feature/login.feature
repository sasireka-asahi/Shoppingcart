Feature: To Validate the login functionality

Background:
Given User is in loginpage




Scenario Outline: To verify login page


When User has to enter the "<username>","<password>" and click the login button

Then when user enters the wrong credentials then user should not able to login to Homepage 

Then close the browser


Examples: 
   |username|password|
   |Navin|12345|
   |Kumar|54321|
   |Suresh|78999|
   |Vijay|444444|

Scenario Outline: To verify the registration page


When User has to enter the "<firstname>","<lastname>","<mobilenumber>","<password>","<day>","<month>","<year>" and click the register button

Then when user enters the correct then otp is generated to their mobile number 


Then close the browser

Examples: 
   |firstname|lastname|mobilenumber|password|day|month|year|
      |Navin|kumar|9997777444|Navin@123|12|Apr|1995|
         |Kavin|Kumar|7778888999|Kumar@123|13|Jun|2001|
          |Saravanan|nandha|44444555554|nandha@123|12|Jul|2005|
         |anand|Kumar|7777788888|singa@123|13|Mar|1984|
      
   
  
