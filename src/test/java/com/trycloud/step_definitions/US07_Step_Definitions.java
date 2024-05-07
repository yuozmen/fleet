package com.trycloud.step_definitions;

import com.trycloud.pages.VehiclesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US07_Step_Definitions {
    VehiclesPage vehiclesPage=new VehiclesPage();
    @Given("User types {string} able to see Fleet module")
    public void userTypesAbleToSeeFleetModule(String userType) {
        vehiclesPage.FleetButton.isDisplayed();
    }


    @And("User types {string} click on Fleet Button")
    public void userTypesClickOnFleetButton(String arg0) {

    }

    @Then("User types {string} can see all the checkboxes as unchecked under Vehicle")
    public void userTypesCanSeeAllTheCheckboxesAsUncheckedUnderVehicle(String arg0) {
    }
}
