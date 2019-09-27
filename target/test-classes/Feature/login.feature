Feature: Login Action

Background:

	Given User is in landing page
	When User has to click the Signin button
	Then Signin button navigate to open the  Authentication page

#Scenario Outline: : Verify signin page invalid input
#	When User has to enter the invalid "<userName>","<password>" and click the login button
#	Then promopt the error message
#	Then close the browser
#Examples:
#|userName|password|
#|sasireka|Asahi@123|
#|s#$$##|asahi3|

#Scenario Outline: : Verify signin page valid input
#	Given User is in Signinpage and verify tiltle
#	When User has to enter the valid "<userName>","<password>" and click the login button
#	Then Navigate to open the Home page
#	Then close the browser
#Examples:
#|userName|password|
#|sasireka@mail.asahitechnologies.com|Asahi@123|


#Scenario Outline: : Verify signup page invalid input
#	When User has to enter the invalid "<email>" "<firstname>","<lastname>","<password>","<Address>","<city>","<state>","<Zip>","<country>","<mobileno>","<Address1>" and click the register button and click the register button
#	Then Prompt the error
#	Then close the browser
#Examples:
#|email|firstname|lastname|password|Address|city|state|Zip|country|mobileno|Address1|
#	|ss3@mail.com|sree|ji|Asahi|Asahi,46 Fanepet 2nd Street|chenn|aaaa|@#$$12|cdf|9944021251|address1|
#	|ss4@mail.com|niki|raj|Asahi|Asahi,46 Fanepet 2nd Street|chenn|aaaa|99|cdf|2345|address1|
#	|ss5@mail.com|haritha|r|A|address|chenn|aaaa|600091|cdf|2345|address1|
#|sscom|sasi|r|Asahi|Asahi,46 Fanepet 2nd Street|chenn|aaaa|99|cdfedf|2345|address1|
#|s#$3!@@com|vinay|r|Asahi|Asahi,46 Fanepet 2nd Street|chennai|aaaa|600091|cdf|2345|address1|*/


Scenario Outline: : Verify signup page valid input
	When User has to enter the valid "<email>" "<firstname>","<lastname>","<password>","<Address>","<city>","<state>","<Zip>","<country>","<mobileno>","<Address1>" and click the register button and click the register button
	Then close the browser
Examples:
|email|firstname|lastname|password|Address|city|state|Zip|country|mobileno|Address1|
|ss12345@mail.com|ram|sita|Asahi@123|Asahi,46 Fanepet 2nd Street|chennai|32|600091|United States|9944021254|address1|


