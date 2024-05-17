@B33G1-183
Feature: Default

	@B33G1-162
	Scenario: Verify question mark icon functionality and title verification for multiple users
		Scenario Outline:Question mark icon Functionality 
		Given the user logged in as "<userName>"
		Then user click on the question_mark icon
		Then user sees "Welcome to Oro Documentation" is in the title
		 Examples:
		      | userName      |
		      | driver        |
		      | sales manager |
		      | store manager |