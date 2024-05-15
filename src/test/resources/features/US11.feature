
@vk

Feature: Vehicles Odometer page functionalty.

  Agile Story : As a user, I want to view car odometer info on the Vehicles Odometer page.


  Scenario: Verify that Store managers and Sales managers can access the Vehicles Odometer page

    Given the user logged in as "store manager"
    And  User able to hover on Fleet Tab and User able to click Vehicles Odometer page
    Then User should see expected Error message
    # You do not have permission to perform this action.

  Scenario: Verify that Drivers see the default page as 1.
    Given the user logged in as "driver"
    And driver able to hover on Fleet Tab and User able to click Vehicles Odometer page
    And user should see see the default page as 1.

  @ynsoo
    Scenario: Verify that Drivers see the View Per Page as 25 by default.
      Given the user logged in as "driver"
      And driver able to hover on Fleet Tab and User able to click Vehicles Odometer page
      And user should see see View Per Page as 25 by default..


