package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPage {

    public PinbarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//a[.='Learn how to use this space']")
    public WebElement space;


    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement pinbarUsage;

    @FindBy(xpath = "//div//p[1]")
    public WebElement fastAccessText;

    @FindBy(xpath = "//div//p[2]")
    public WebElement pinbarImage ;
}
