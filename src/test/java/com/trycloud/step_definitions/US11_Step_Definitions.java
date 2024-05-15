package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.VehiclesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class US11_Step_Definitions extends BasePage {

    VehiclesPage vehiclepage = new VehiclesPage();

    @Given("User able to hover on Fleet Tab and User able to click Vehicles Odometer page")
    public void user_able_to_hover_on_fleet_tab_and_user_able_to_click_vehicles_odometer_page() {

        navigateToModule("Fleet","Vehicle Odometer");
        waitUntilLoaderScreenDisappear();

    }
    @Then("User should see expected Error message")
    public void user_should_see_expected_error_message() {

        String actualErrorMessage = vehiclepage.VehiclesOdometerErrorText.getText();
        String expectedErrorMessage = "You do not have permission to perform this action.";

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

    }


    @Given("driver able to hover on Fleet Tab and User able to click Vehicles Odometer page")
    public void driverAbleToHoverOnFleetTabAndUserAbleToClickVehiclesOdometerPage() {

     navigateToModule("Fleet","Vehicle Odometer");
    }


    @And("user should see see the default page as {int}.")
    public void userShouldSeeSeeTheDefaultPageAs(int pageNumber) {


        BrowserUtils.verifyElementDisplayed(vehiclepage.defaultPage);


    }

    @And("user should see see View Per Page as {int} by default..")
    public void userShouldSeeSeeViewPerPageAsByDefault(int viewPerPage) {

        Assert.assertTrue(vehiclepage.defaultLastPage.isDisplayed());


        
    }
}
