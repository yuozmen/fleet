Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: Verify login with different user types
    Given the user logged in with username as "User1" and password as "UserUser123"
    And click to login button
    Then user sees below module
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


  Scenario: Verify login with different user types
    Given the user logged in with username as "salesmanager101" and password as "UserUser123"
    And click to login button
    Then user sees below module
      | Fleet             |
      | Customers         |
      | Activities        |
      | System            |
      | Dashboards        |
      | Sales             |
      | Marketing         |
      | Report & Segments |

  Scenario: Verify login with different user types
    Given the user logged in with username as "storemanager85" and password as "UserUser123"
    And click to login button
    Then user sees below module
      | Fleet             |
      | Customers         |
      | Activities        |
      | System            |
      | Dashboards        |
      | Sales             |
      | Marketing         |
      | Report & Segments |





