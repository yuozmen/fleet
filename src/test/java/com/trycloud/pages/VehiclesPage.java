package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class VehiclesPage extends LoginPage{

    public VehiclesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//li[@class='dropdown dropdown-level-1'])[1]")
    public WebElement FleetButton;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement VehiclesButton;

    @FindBy(xpath = "(//ul[@class='nav nav-pills icons-holder launchers-list'])[1]/li")
    public List<WebElement> InfoCarsIcons;

    public void vehicleLogin(){
        FleetButton.click();
        BrowserUtils.sleep(2);
        VehiclesButton.click();
    }

    public static  List<String> Icons(List<WebElement> list) {
        List<String> IconsTitle = new ArrayList<>();

        for (WebElement each : list){
            WebElement link= each.findElement(By.tagName("a"));
            IconsTitle.add(link.getAttribute("title"));

        }
        return IconsTitle;
    }



}
