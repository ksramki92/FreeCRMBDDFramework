Feature: Free CRM Deals page feature 

Scenario: Free CRM deals page scenario 
	Given User is already on Login Page 
	When title of Login Page is Free CRM 
	Then user enters username and password 
		|ksramki92@gmail.com|Yourwish@18|
	Then user clicks on Login button 
	And user is on home page 
	Then user clicks on deals link 
	Then user clicks on New button 
	Then user enters title and amount and commission 
		|Mobile|50000|50|
	Then user clicks on save 
	And user closes the browser 
