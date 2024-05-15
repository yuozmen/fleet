package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class VehiclesPage extends LoginPage{



    public VehiclesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement FleetButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement driverFleetButton;



    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement VehiclesButton;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement VehiclesOdometerErrorText;

    @FindBy(xpath = "//span[.='Vehicle Contracts']")
    public WebElement VehiclesContractButton;

    @FindBy(xpath = "//span[.='Vehicle Odometer']")
    public WebElement VehiclesOdometerButton;

    @FindBy(xpath = "//tr[@class='grid-header-row']")
    public List<WebElement> InfoCarsIcons;

    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']")
    public List<WebElement> allModules;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement defaultPage;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement defaultLastPage;


    public void vehicleLogin(){
        FleetButton.click();
        BrowserUtils.sleep(2);
        VehiclesButton.click();
    }

    public static List<String> infoCarIconsText (List<WebElement> list){

        List<String> InfoCarText =new ArrayList<>();

        for (WebElement each : list) {
            InfoCarText.add(each.getText());
        }
        return  InfoCarText;

        //
    }


}
