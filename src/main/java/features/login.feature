Feature: Free CRM Login Feature


# This is a single line comment
# """This is a multi-line comments"""

#This is data provide without Examples keyword

#Scenario: Free CRM Login Test Scenario
#Given User is already on Login Page
#When title of Login Page is Free CRM
#Then user enters "ksramki92@gmail.com" and "Yourwish@18"  
#Then user clicks on Login button
#And user is on home page
#Then user closes the browser

#With Examples keyword- Note that if we use Examples, then we should create Scenario Outline
Scenario Outline: Free CRM Login Test Scenario
Given User is already on Login Page
When title of Login Page is Free CRM
Then user enters "<username>" and "<password>"  
Then user clicks on Login button
And user is on home page
Then user closes the browser
Examples:
	|username				|password|
	|ksramki92@gmail.com	|Yourwish@18|
	|ksramki92@gmail.com	|Yourwish@18|
	

