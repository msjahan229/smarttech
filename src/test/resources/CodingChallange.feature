Feature: Verify loging feture in Automaiton Practice page 

Scenario: User able to loging feature 

	Given user go to automationpractice page 
	When user enter valid username and passward 
	And user click the log in button 
	Then navigate to the welcome page 
	And user verify page title as "AutomationPractice"
	And user verify user name is displays at top right 
	Then user log out 
	Then user close browser 
	