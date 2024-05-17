package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class US02_Step_Definitions extends  BasePage{
    DashboardPage dashboardPage=new DashboardPage();
    BasePage basePage=new BasePage();


    @Then("user click on the question_mark icon")
    public void user_click_on_the_question_mark_icon() {
        basePage.waitUntilLoaderScreenDisappear();
        basePage.waitUntilLoaderScreenDisappear();
        dashboardPage.question_mark.click();

    }
    @Then("user sees {string} is in the title")
    public void user_sees_is_in_the_title(String string) {

        //get window handlers as list
        List<String> browserTabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        //switch to new tab
        Driver.getDriver().switchTo().window(browserTabs.get(1));
        //check is it correct page opened or not (e.g. check page's title)
        BrowserUtils.verifyTitle("Welcome to Oro Documentation");
        //then close tab and get back
        Driver.getDriver().close();
        Driver.getDriver().switchTo().window(browserTabs.get(0));
        userName.click();
        logOutLink.click();


    }



}