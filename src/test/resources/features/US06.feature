
@B33G1-157
Feature: Default

	
	@B33G1-156
	Scenario: Verify that the Driver can see the edit car icons on the Vehicles page.
		Given the user logged in as "driver"
		    Then the user clicks  on the Fleet button then selects the Vehicles button
		    When  the user  hovers the mouse over the three dots icon
		    Then the user sees below options
		      | view   |
		      | edit   |
		      | delete |	

	
	@B33G1-180
	Scenario: Verify that the Sales Manager can see the edit car icons on the Vehicles page.
		Given the user logged in as "sales manager"
		    Then the user clicks  on the Fleet button then selects the Vehicles button
		    When  the user  hovers the mouse over the three dots icon
		    Then the user sees below options
		      | view   |
		      | edit   |
		      | delete |	

	
	@B33G1-181
	Scenario: Verify that the Store Manager can see the edit car icons on the Vehicles page.
		Given the user logged in as "store manager"
		    Then the user clicks  on the Fleet button then selects the Vehicles button
		    When  the user  hovers the mouse over the three dots icon
		    Then the user sees below options
		      | view   |
		      | edit   |
		      | delete |

