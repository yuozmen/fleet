

@B33G1-164
Feature: Default


	@B33G1-163
	Scenario Outline: US09_Error Handling for Invalid Integer in Calander Repeat Day Input Box
		Given the user logged in as "sales manager"
		When User howers the mouse over the Activities button
		And User clicks on the Calendar Events button
		And User clicks on the Create Calander Event button
		And User selects the Repeat field
		And User deletes the number 1 in the Repeat Every input box
		When User enters "<invalidInput>" into the Repeat Every input box
		Then User should see an error message "<errorMessage>"

		Examples:
			| invalidInput | errorMessage                           |
			| -1           | The value have not to be less than 1.  |
			| 0            | The value have not to be less than 1.  |

	@B33G1-162
	Scenario Outline: US09_Error Handling for Invalid Integer in Calander Repeat Day Input Box
		Given the user logged in as "store manager"
		When User howers the mouse over the Activities button
		And User clicks on the Calendar Events button
		And User clicks on the Create Calander Event button
		And User selects the Repeat field
		And User deletes the number 1 in the Repeat Every input box
		When User enters "<invalidInput>" into the Repeat Every input box
		Then User should see an error message "<errorMessage>"

		Examples:
			| invalidInput | errorMessage                           |
			| -1           | The value have not to be less than 1.  |
			| 0            | The value have not to be less than 1.  |

	@B33G1-161
	Scenario Outline: US09_Error Handling for Invalid Integer in Calander Repeat Day Input Box
		Given the user logged in as "driver"
		When User howers the mouse over the Activities button
		And User clicks on the Calendar Events button
		And User clicks on the Create Calander Event button
		And User selects the Repeat field
		And User deletes the number 1 in the Repeat Every input box
		When User enters "<invalidInput>" into the Repeat Every input box
		Then User should see an error message "<errorMessage>"

		Examples:
			| invalidInput | errorMessage                           |
			| -1           | The value have not to be less than 1.  |
			| 0            | The value have not to be less than 1.  |
