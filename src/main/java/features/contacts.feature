Feature: Free CRM contacts page feature
Scenario Outline: Free CRM create contact scenario
Given User is already on Login Page
When title of Login Page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on Login button
And user is on home page
Then user clicks on contacts link
Then user clicks on New button
Then user enters "<firstname>" and "<lastname>" and "<position>"
Then user clicks on save
And user closes the browser

Examples:
	|username				|password		|firstname	|lastname	|position	|
	|ksramki92@gmail.com	|Yourwish@18	|Ramki		|Kuppusamy	|Manager	|
	|ksramki92@gmail.com	|Yourwish@18	|Ramki2		|Kuppusamy	|Director	|