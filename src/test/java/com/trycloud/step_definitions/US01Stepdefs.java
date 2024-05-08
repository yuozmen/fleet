package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US01Stepdefs {


    @Then("user sees below module")
    public void userSeesBelowModule(List<String> expectedOptions) {

        List<WebElement> listOfModule = Driver.getDriver().findElements(By.xpath("//ul[@class='nav-multilevel main-menu']/li"));

        System.out.println("listOfModule.size() = " + listOfModule.size());

       // List<String>actualOptions = BrowserUtils.getElementsText(listOfModule);

        //Assert.assertEquals(expectedOptions,actualOptions);

       /* List<String>actualOptions = BrowserUtils.dropdownOptions_as_STRING(BasePage.menuOptions);

        Assert.assertEquals(actualOptions, expectedOptions);

        */
    }
}
