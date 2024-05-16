Feature: Recurring calendar event functionality
  Agile story : As a user, I want to create a recurring (repetitive) calendar event

    @wip
    Scenario Outline: The error message verification.
    Given the user logged in as "<userName>"
    When user navigates to the Activities module
    And user clicks on the Calender Events button
    And user clicks on the Create Calender Event button
    When user selects the Repeat box
    Then user sees the number 1 by default in the Repeat Every input option.
      Examples:
      | userName      |
      | store manager |
      | sales manager |
      | driver        |

    @login
    Scenario Outline: The error message verification.
    Given the user logged in as "<userName>"
    And user navigates to the Activities module
    And user clicks on the Calender Events button
    And user clicks on the Create Calender Event button
    And user selects the Repeat box
    When use deletes the number 1 in the Calendar event Repeat Every field
    Then user should see the error message "This value should not be blank."

    Examples:
    | userName      |
    | store manager |
    | sales manager |
    | driver        |


