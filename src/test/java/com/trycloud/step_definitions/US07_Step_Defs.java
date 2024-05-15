package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.VehiclesPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US07_Step_Defs extends BasePage {
    VehiclesPage obj_Vehicle=new VehiclesPage();

    @And("User able to hover on Fleet Tab and User able to click Vehicle Module")
    public void userAbleToHoverOnFleetTabAndUserAbleToClickVehicleModule() {
        BrowserUtils.waitForPageToLoad(4);
        navigateToModule("Fleet","Vehicles");
   }

    @And("Verify the User on the Vehicle page")
    public void verifyTheUserOnTheVehiclePage() {

        String expectedInTitle="All - Car - Entities - System - Car - Entities - System";
        BrowserUtils.sleep(1);
        BrowserUtils.waitForTitleContains(expectedInTitle);
        BrowserUtils.verifyTitle(expectedInTitle);
    }

    @Then("User able to see all the checkboxes are unchecked")
    public void userAbleToSeeAllTheCheckboxesAreUnchecked() {
         obj_Vehicle.unCheckedRows();
  }


    @Then("User clicks on headerRow checkbox and see all the checkboxes are checked")
    public void userClicksOnHeaderRowCheckboxAndSeeAllTheCheckboxesAreChecked() {
        obj_Vehicle.checkedRows();
    }


    @Then("User able click on random checkbox")
    public void userAbleClickOnRandomCheckbox() {
        obj_Vehicle.randomSelectRow();
    }
}
