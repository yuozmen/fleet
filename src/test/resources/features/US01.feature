Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page
    And wait until the user sees page title is "Dashboard"

  @wip
  Scenario: Verify login with different user types
    Given the user logged in with username as "User1" and password as "UserUser123"
    And click to login button
    And wait until the user sees page title is "Dashboard"
    Then user sees below module
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |



  Scenario: Verify login with different user types
    Given the user logged in with username as "salesmanager101" and password as "UserUser123"
    And click to login button
    And wait until the user sees page title is "Dashboard"
    Then user sees below module
      | Dashboards        |
      | Fleet             |
      | Customers         |
      | Sales             |
      | Activities        |
      | Marketing         |
      | Reports & Segments |
      | System            |

  Scenario: Verify login with different user types
    Given the user logged in with username as "storemanager85" and password as "UserUser123"
    And click to login button
    And wait until the user sees page title is "Dashboard"
    Then user sees below module
      | Dashboards        |
      | Fleet             |
      | Customers         |
      | Sales             |
      | Activities        |
      | Marketing         |
      | Reports & Segments |
      | System            |





