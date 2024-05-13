Feature: As a user, I want to see edit car info icons on the Vehicles page.

Scenario: US07-Verify that Sales manager able to see all checkboxes as checked once clicks on header row checkbox
Given the user logged in as "sales manager"
And User able to hover on Fleet Tab and User able to click Vehicle Module
And Verify the User on the Vehicle page
Then User clicks on headerRow checkbox and see all the checkboxes are checked
