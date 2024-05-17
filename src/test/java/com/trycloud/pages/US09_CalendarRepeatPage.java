package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US09_CalendarRepeatPage {

    public US09_CalendarRepeatPage() {

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

    @FindBy(xpath = "//span[.='The value have not to be less than 1.']")
    public WebElement ErrorMessage;
    //span[.='The value have not to be less than 1.']
    //id = "temp-validation-name-1039-error"
    //span[@style='top: 297.4px; left: 888.8px;']

    @FindBy(xpath = "//span[.='The value have not to be more than 99.']")
    public WebElement ErrorMessage2;


}
