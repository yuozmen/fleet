Feature:Access to the Oroinc Documentation page by clicking the
  question mark icon.

  Scenario Outline:Question_mark icon functionality

    Given the user logged in as "<userName>"
    Then user click on the question_mark icon
    Then user sees "Welcome to Oro Documentation" is in the title

    Examples:
      | userName      |
      | driver        |
      | sales manager |
      | store manager |


