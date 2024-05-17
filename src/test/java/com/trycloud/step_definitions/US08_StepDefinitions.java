package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.CalenderRepeatPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;


public class US08_StepDefinitions extends BasePage {
    CalenderRepeatPage calenderRepeatPage= new CalenderRepeatPage();

    @When("user navigates to the Activities module")
    public void user_navigates_to_the_activities_module() {

        navigateToModule("Activities", "Calendar Events");
    }

    @When("user clicks on the Calender Events button")
    public void user_clicks_on_the_calender_events_button() {

    }

    @When("user clicks on the Create Calender Event button")
    public void user_clicks_on_the_create_calender_event_button() {

        BrowserUtils.sleep(5);
        calenderRepeatPage.CreateCalender.click();

    }

    @When("user selects the Repeat box")
    public void user_selects_the_repeat_box() {

        calenderRepeatPage.RepeatBox.click();
    }

    @Then("user sees the number {int} by default in the Repeat Every input option.")
    public void userSeesTheNumberByDefaultInTheRepeatEveryInputOption(int expectedValue) {

      JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
      js.executeScript("arguments[0].click();",calenderRepeatPage.RadioButtonInput);

        String actualValue = calenderRepeatPage.RadioButtonInput.getAttribute("value");
        int actualIntValue = Integer.parseInt(actualValue.trim());
        Assert.assertEquals(expectedValue, actualIntValue);


    }
    @When("use deletes the number {int} in the Calendar event Repeat Every field")
    public void use_deletes_the_number_in_the_calendar_event_repeat_every_field(Integer expectedValue) {

        calenderRepeatPage.RadioButtonInput.clear();

    }
    @Then("user should see the error message {string}")
    public void user_should_see_the_error_message(String expectedErrorMessage) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",calenderRepeatPage.ErrorMessage);
        String actualErrorMessage = calenderRepeatPage.ErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);

    }

    }





