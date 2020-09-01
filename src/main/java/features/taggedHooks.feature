Feature: Free CRM Tagged Hooks Feature

@First
Scenario Outline: Free CRM Login Test Scenario1
Given User is already on Login Page
When title of Login Page is Free CRM
Then user enters "<username>" and "<password>"  
Then user clicks on Login button
And user is on home page
Examples:
	|username				|password|
	|ksramki92@gmail.com	|Yourwish@18|
	|ksramki92@gmail.com	|Yourwish@18|
	
	
@Second	
Scenario Outline: Free CRM Login Test Scenario2
Given User is already on Login Page
When title of Login Page is Free CRM
Then user enters "<username>" and "<password>"  
Then user clicks on Login button
And user is on home page
Examples:
	|username				|password|
	|ksramki92@gmail.com	|Yourwish@18|
	