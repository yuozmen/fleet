Feature: Pinbar functionality page

  Agile Story : As a user, I want to learn how to use the pinbar

@pinbar
  Scenario Outline: Verify that when the different users click the “Learn how to use this space” link on the homepage
    Given the user logged in as "<userType>"
    And User clicks the “Learn how to use this space” link on the homepage,
    Then User be able to see “How To Use Pinbar”
    And User be able to see expected text
    #expectedText : Use the pin icon on the right top corner of page to create fast access link in the pinbar.
    Then User see an image on the page
    Examples:
      | userType      |
      | driver        |
      | Sales Manager |
      | Store Manager |