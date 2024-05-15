@vys
Feature:Vehicle Contracts page functionalty

  Agile Story : As a user, I want to access to Vehicle Contracts page



 Scenario Outline: Verify that Store managers and Sales managers can access the Vehicle Contracts

  Given the user logged in as "<userType>"
  And User able to hover on Fleet Tab and User able to click Vehicle Module
 Then User sees expectedUrl  on page
 Then user sees expectedTitle is on page

  Examples:

  |userType|
  |sales manager|
  |store manager|




@Driver
Scenario: Login as Driver

 Given the user logged in as "driver"
 Then Driver  will able to  hold  on the Fleet button than select Vehicle Contracts button
 Then Driver user will not able to see Vehicle contracts page and user will see a warning message






