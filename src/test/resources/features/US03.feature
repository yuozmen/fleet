@B33G1-186
Feature: Default

	
	@B33G1-184
	Scenario Outline: US03 Verify that when users click the “Learn how to use this space” link on the homepage.
		Given the user logged in as "<userType>"
		    And User clicks the “Learn how to use this space” link on the homepage,
		    Then User be able to see “How To Use Pinbar”
		    And User be able to see expected text
		    #expectedText : Use the pin icon on the right top corner of page to create fast access link in the pinbar.
		    Examples:
		      | userType      |
		      | driver        |
		      | Sales Manager |
		      | Store Manager |	

	
	@B33G1-185
	Scenario Outline: US03 Verify that  users see an image on the page.
		Given the user logged in as "<userType>"
		    And User clicks the “Learn how to use this space” link on the homepage,
		    Then User see an image on the page
		    Examples:
		      | userType      |
		      | driver        |
		      | Sales Manager |
		      | Store Manager |