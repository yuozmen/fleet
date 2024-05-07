
@CheckboxFunctionality
  Feature: Checkbox functionality on Vehicles page
    Agile Story: As a Sales manager and Store manager, I should be able to select any vehicle from the
    Vehicles page

    @wip
  Scenario:Verify that different user types able to see all checkboxes as unchecked once launches on vehicles page
    Given  User types "<userType>" able to see Fleet module
      And User types "<userType>" click on Fleet Button
    Then User types "<userType>" can see all the checkboxes as unchecked under Vehicle

