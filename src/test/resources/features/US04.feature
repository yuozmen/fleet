Feature:Vehicle Contracts page functionalty

  Agile Story : As a user, I want to access to Vehicle Contracts page

 @Storemanager
  Scenario: Login as Store managers
 Given user is on the login page
  And user input credentials username and password
  Then click to login button
  Then User will able to  hold  on the Fleet button than select Vehicle Contracts button
  Then  User should see title is as expected
    # All - Vehicle Contract - Entities - System - Car - Entities - System
  Then  User should see Url  is as expected
    # https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract

 # @Salesmanager

  Scenario: Login as Sales managers
    Given user is on the login page
    And user input credentials username and password
    Then click to login button
    Then User will able to  hold  on the Fleet button than select Vehicle Contracts button
    Then  User should see title is as expected
    # All - Vehicle Contract - Entities - System - Car - Entities - System
    Then  User should see Url  is as expected
    # https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract

