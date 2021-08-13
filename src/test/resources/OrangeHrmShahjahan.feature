@smoketest @regressionTest @jenkinsTest
Feature: Verify login feature in Orange HRM website 

Scenario: User able to successfully login to orange HRM site 
	Given user go to Orange HRM home page 
	When user enter valid username and passward 
	And user click the log in button 
	Then user navigate to the welcome page 
	And user verify page title as "OrangeHRM" 
	And user verify user name is displays at top right 
	Then user log out 
	Then user close browser