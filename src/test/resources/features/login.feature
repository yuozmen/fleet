@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

@wip
  Scenario: Verify login with different user types
    Given the user logged in as "store manager"
    Given the user logged in with username as "storemanager56" and password as "UserUser123"




