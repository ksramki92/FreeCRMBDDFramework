Feature: Free CRM tagging feature file

@SmokeTest @RegressionTest @End2EndTest
Scenario: Verify login
Given user is on the login page

@SmokeTest @End2EndTest
Scenario: Verify home page title
Given user is on the home page

@RegressionTest @End2EndTest
Scenario: Verify creating a contact
Given user is on the contacts page

@RegressionTest @End2EndTest
Scenario: Verify creating a deal
Given user is on the deals page

@RegressionTest @End2EndTest
Scenario: Verify creating a task
Given user is on the tasks page

@End2EndTest
Scenario: Verify the documents
Given user is on the documents page

@SmokeTest @RegressionTest @End2EndTest
Scenario: Logout
Given user is logged in

@SmokeTest @RegressionTest @End2EndTest
Scenario: Close the browser
Given user is logged out

 