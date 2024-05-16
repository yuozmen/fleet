package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.VehiclesPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US04_Step_Definitions extends BasePage {

    VehiclesPage vehiclesPage = new VehiclesPage();



    @And("User able to hover on Fleet Tab and User able to click Vehicle Module")
    public void userAbleToHoverOnFleetTabAndUserAbleToClickVehicleModule() {

     navigateToModule("Fleet","Vehicle Contracts");
     waitUntilLoaderScreenDisappear();

    }
    @Then("User sees expectedUrl  on page")
    public void userSeesExpectedUrlOnPage() {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl ="All - Vehicle Contract - Entities - System - Car - Entities - System";



        waitUntilLoaderScreenDisappear();

    }

    @Then("user sees expectedTitle is on page")
    public void userSeesExpectedTitleIsOnPage() {
        String expedtedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
      String actualTitle = Driver.getDriver().getTitle();

      Assert.assertEquals(actualTitle,expedtedTitle);

    }


    @Then("Driver  will able to  hold  on the Fleet button than select Vehicle Contracts button")
    public void driverWillAbleToHoldOnTheFleetButtonThanSelectVehicleContractsButton() {

        vehiclesPage.driverFleetButton.click();
        vehiclesPage.VehiclesContractButton.click();
        waitUntilLoaderScreenDisappear();





    }

    @Then("Driver user will not able to see Vehicle contracts page and user will see a warning message")
    public void driverUserWillNotAbleToSeeVehicleContractsPageAndUserWillSeeAWarningMessage() {


        String expectedErrorMessage = "You do not have permission to perform this action.";
         String actualErrorMessage = vehiclesPage.errorMessage.getText();

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);






    }













}
