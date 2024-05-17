package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalenderRepeatPage {
    public CalenderRepeatPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy()
    public WebElement ActivitiesModule;

    @FindBy()
    public WebElement CalenderEvents;

    @FindBy(xpath ="//a[@title='Create Calendar event']")
    public WebElement CreateCalender;

    @FindBy(xpath ="//input[@data-name= 'recurrence-repeat']")
    public WebElement RepeatBox;

    //(xpath = "//label[contains(text(),'Repeat')]")

    @FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
    public  WebElement RadioButtonInput;



   @FindBy(xpath = "//span[@style='top: 443.8px; left: 919.6px;']")
    public WebElement ErrorMessage;


}


