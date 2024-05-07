package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US01Stepdefs {


    @Then("user sees below module")
    public void userSeesBelowModule(List<String> expectedOptions) {

        List<String>actualOptions = BrowserUtils.dropdownOptions_as_STRING(BasePage.menuOptions);

        Assert.assertEquals(actualOptions, expectedOptions);
    }
}
