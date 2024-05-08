package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US01Stepdefs {


    @Then("user sees below module")
    public void userSeesBelowModule(List<String> expectedOptions) {

       // List<String>actualOptions = BrowserUtils.getElementsText(By.xpath("//span[@class='title title-level-1']"));

       // System.out.println("actualOptions = " + actualOptions);


        // List<WebElement> listOfModule = Driver.getDriver().findElements(By.xpath("//ul[@class='nav-multilevel main-menu']/li"));

       // List<String>actualOptions = BrowserUtils.getElementsText(listOfModule);



        //Assert.assertEquals(expectedOptions,actualOptions);




        List<WebElement> listOfModule = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        BrowserUtils.waitFor(3);

        for (WebElement each : listOfModule) {
            System.out.println("each.getText() = " + each.getText());
        }

        BrowserUtils.waitFor(3);

        List<String> actualOptions = new ArrayList<>();

        for (WebElement element : listOfModule) {

            String text = element.getText();

            if (!text.isEmpty()) {
                actualOptions.add(text);
            }
        }

        BrowserUtils.waitFor(3);

        Assert.assertEquals(actualOptions, expectedOptions);


        //System.out.println("actualOptions = " + actualOptions);

        //BrowserUtils.getElementsText(listOfModule);

       /* List<String> actualOptions = new ArrayList<>();

        for (WebElement element : listOfModule) {

            String text = element.getText();

            if (!text.isEmpty()) {
                actualOptions.add(text);
            }

        }

        System.out.println("actualOptions = " + actualOptions);


        System.out.println("listOfModule.size() = " + listOfModule.size());

        */



       // List<String>actualOptions = BrowserUtils.getElementsText(listOfModule);

        //Assert.assertEquals(expectedOptions,actualOptions);

       /* List<String>actualOptions = BrowserUtils.dropdownOptions_as_STRING(BasePage.menuOptions);

        Assert.assertEquals(actualOptions, expectedOptions);

        */
    }


}
