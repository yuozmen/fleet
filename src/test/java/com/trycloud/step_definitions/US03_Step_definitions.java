package com.trycloud.step_definitions;

import com.trycloud.pages.PinbarPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US03_Step_definitions {

    PinbarPage pinbarPage = new PinbarPage();
    @Given("User clicks the “Learn how to use this space” link on the homepage,")
    public void user_clicks_the_learn_how_to_use_this_space_link_on_the_homepage() {
        pinbarPage.space.click();
        BrowserUtils.sleep(2);

    }
    @Then("User be able to see “How To Use Pinbar”")
    public void user_be_able_to_see_how_to_use_pinbar() {
        String actualFirstText = pinbarPage.pinbarUsage.getText();
        String expectedFirstText = "How To Use Pinbar";

        Assert.assertEquals(expectedFirstText, actualFirstText);
        System.out.println("actualFirstText = " + actualFirstText);

    }
    @Then("User be able to see expected text")
    public void user_be_able_to_see_expected_text() {
        String actualSecondText = pinbarPage.fastAccessText.getText();
        String expectedSecondText = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";

        Assert.assertEquals(actualSecondText,expectedSecondText);

        System.out.println("actualSecondText = " + actualSecondText);

    }
    @Then("User see an image on the page")
    public void user_see_an_image_on_the_page() {
        WebElement image = pinbarPage.pinbarImage.findElement(By.tagName("img"));

        String actualSource = image.getAttribute("src");
        String expectedSource = "/bundles/oronavigation/images/pinbar-location.jpg";

        Assert.assertTrue(actualSource.contains(expectedSource));

        System.out.println("actualSource = " + actualSource);


    }

}
