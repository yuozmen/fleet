@B33G1-179
Feature: Default

	
	@B33G1-175
	Scenario: US07-Verify that Sales manager able to see all checkboxes as checked once clicks on header row checkbox
		Given the user logged in as "sales manager"
		    And User able to hover on Fleet Tab and User able to click Vehicle Module
		    And Verify the User on the Vehicle page
		    Then User clicks on headerRow checkbox and see all the checkboxes are checked	

	
	@B33G1-176
	Scenario: US07-Verify that Store manager able to see all checkboxes as checked once clicks on header row checkbox
		Given the user logged in as "store manager"
		And User able to hover on Fleet Tab and User able to click Vehicle Module
		And Verify the User on the Vehicle page
		Then User clicks on headerRow checkbox and see all the checkboxes are checked

	#US07-Verify that Sales manager once the launch on the Vehicles page, able to see all the checkboxes as unchecked.
	@B33G1-173
	Scenario: US07-Verify that Sales manager once the  launch on the Vehicles page, able to see all the checkboxes as unchecked.
		Given the user logged in as "sales manager"
		And User able to hover on Fleet Tab and User able to click Vehicle Module
		And Verify the User on the Vehicle page
		Then User able to see all the checkboxes are unchecked	

	
	@B33G1-174
	Scenario: US07-Verify that Store manager able to see all checkboxes as unchecked once launches on vehicles page
		Given the user logged in as "store manager"
		And User able to hover on Fleet Tab and User able to click Vehicle Module
		And Verify the User on the Vehicle page
		Then User able to see all the checkboxes are unchecked	

	
	@B33G1-177
	Scenario: US07-Verify that Sales manager able to click on Random checkbox
		Given the user logged in as "sales manager"
		And User able to hover on Fleet Tab and User able to click Vehicle Module
		And Verify the User on the Vehicle page
		Then User able click on random checkbox	

	#US07-Verify that Store manager able to click on Random checkbox
	@B33G1-178
	Scenario: US07-Verify that Store manager able to click on Random checkbox
		Given the user logged in as "store manager"
		And User able to hover on Fleet Tab and User able to click Vehicle Module
		And Verify the User on the Vehicle page
		Then User able click on random checkbox