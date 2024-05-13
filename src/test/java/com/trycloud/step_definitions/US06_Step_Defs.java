package com.trycloud.step_definitions;
import com.trycloud.pages.BasePage;
import com.trycloud.pages.VehiclePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
public class US06_Step_Defs extends BasePage {
    VehiclePage page = new VehiclePage();
    @Then("the user clicks  on the Fleet button then selects the Vehicles button")
    public void the_user_clicks_on_the_fleet_button_then_selects_the_vehicles_button() {
        navigateToModule("Fleet", "Vehicles");
        BrowserUtils.sleep(2);
    }

    @When("the user  hovers the mouse over the three dots icon")
    public void the_user_hovers_the_mouse_over_the_three_dots_icon() {
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(page.ThreeDotIcons).perform();

    }

    @Then("the user sees below options")
    public void the_user_sees_below_options(List<String> expectedIcons) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",page.ThreeDotIcons);
        List<String> actualIcons = VehiclePage.Icons(page.InfoCarsIcon);
        Assert.assertEquals(expectedIcons,actualIcons);


    }





}






















