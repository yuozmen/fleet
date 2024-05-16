@B33G1-190
Feature: Default

	
	@B33G1-188
	Scenario Outline: Verify that Store managers and Sales managers can access the Vehicle Contracts page.
		Given the user logged in as "<userType>"
		  And User able to hover on Fleet Tab and User able to click Vehicle Module
		 Then User sees expectedUrl  on page
		 Then user sees expectedTitle is on page
		
		  Examples:
		
		  |userType|
		  |sales manager|
		  |store manager|	

	
	@B33G1-189
	Scenario: Verify that Drivers can NOT access the Vehicle Contracts page and the app displays “You do not have permission to perform this action.”
		Given the user logged in as "driver"
		 Then Driver  will able to  hold  on the Fleet button than select Vehicle Contracts button
		 Then Driver user will not able to see Vehicle contracts page and user will see a warning message