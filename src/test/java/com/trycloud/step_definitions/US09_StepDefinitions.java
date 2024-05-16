package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.CalendarRepeatPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class US09_StepDefinitions extends BasePage {

    CalendarRepeatPage calendarRepeatPage = new CalendarRepeatPage();


    @When("User howers the mouse over the Activities button")
    public void user_howers_the_mouse_over_the_activities_button() {

        navigateToModule("Activities", "Calendar Events");
    }

    @When("User clicks on the Calendar Events button")
    public void user_clicks_on_the_calendar_events_button() {

    }

    @When("User clicks on the Create Calander Event button")
    public void user_clicks_on_the_create_calander_event_button() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",calendarRepeatPage.CalendarEventButton);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(calendarRepeatPage.CalendarEventButton).click().perform();

        //calendarRepeatPage.calendarEventButton.click();

    }
    @When("User selects the Repeat field")
    public void user_selects_the_repeat_field() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",calendarRepeatPage.RepeatBox);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(calendarRepeatPage.RepeatBox).click().perform();

        //calendarRepeatPage.RepeatBox.click();

    }

    @And("User deletes the number {int} in the Repeat Every input box")
    public void userDeletesTheNumberInTheRepeatEveryInputBox(int arg0) {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement((WebElement) calendarRepeatPage.RepeatEvery).click().perform();

        calendarRepeatPage.RepeatEvery.clear();

    }


/*
    @When("User enters {string} into the Repeat Every input box")
    public void userEntersIntoTheRepeatEveryInputBox(int input) {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",calendarRepeatPage.RepeatEvery);

        String invalidInput = String.valueOf(input);
        calendarRepeatPage.RepeatEvery.sendKeys(invalidInput);

    }

    @Then("User should see an error message {string}")
    public void userShouldSeeAnErrorMessage(String expectedErrorMessage) {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",calendarRepeatPage.ErrorMessage);
        String actualErrorMessage = calendarRepeatPage.ErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);

    }

 */

}
