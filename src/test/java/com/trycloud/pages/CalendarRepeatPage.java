package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarRepeatPage {

    public CalendarRepeatPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy()
    public WebElement activitiesButton;
    //"(//i[@class='fa-puzzle-piece menu-icon'])[1]"
    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement CalendarEventButton;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement RepeatBox;

    @FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
    public WebElement RepeatEvery;

    @FindBy(xpath = "//span[@style='top: 443.8px; left: 919.6px;']")
    public WebElement ErrorMessage;


}
