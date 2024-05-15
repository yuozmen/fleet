package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;


import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;


public class VehiclesPage extends LoginPage{

    public VehiclesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//tr[@class='grid-header-row']")
    public List<WebElement> InfoCarsIcons;


    // US07- Verify Check box functionality --start
   @FindBy(xpath="//table[@class='grid table-hover table table-bordered table-condensed']//tr[@class='grid-header-row']//input[@type='checkbox']")
   public WebElement chkBox_Elem;

    @FindBy(xpath="//table[@class='grid table-hover table table-bordered table-condensed']//tbody//tr//input[@type='checkbox']")
    public List<WebElement> chkBox_TotalCars;

   public void unCheckedRows(){
       List<WebElement> rows_Elem=chkBox_TotalCars;
       for(WebElement eachRow:rows_Elem){
           Assert.assertTrue(!eachRow.isSelected());
       }

   }


    public void checkedRows(){
        List<WebElement> rows_Elem=chkBox_TotalCars;
        chkBox_Elem.click(); // click first chkbox then entire got clicked
        for(WebElement eachRow:rows_Elem){
            Assert.assertTrue(eachRow.isSelected());
        }

    }

    public void randomSelectRow(){
        List<WebElement> rows_Elem=chkBox_TotalCars;
        // Generate a random index within the range of checkboxes
        Random random = new Random();
        int randomIndex = random.nextInt(rows_Elem.size());

        // Click on the checkbox at the randomly generated index
        BrowserUtils.sleep(2);
        rows_Elem.get(randomIndex).click();
        Assert.assertTrue(rows_Elem.get(randomIndex).isSelected());

        // Print the class attribute of the selected checkbox
        System.out.println("Class attribute of selected checkbox: "
                + rows_Elem.get(randomIndex).getAttribute("class"));

    }

    // US07-- User to verify Check box functionalities --





    public static List<String> infoCarIconsText (List<WebElement> list){

        List<String> InfoCarText =new ArrayList<>();

        for (WebElement each : list) {
            InfoCarText.add(each.getText());
        }
        return  InfoCarText;

        //
    }



    @FindBy(xpath="//div[@class='btn-group dropdown']//input[@type='checkbox']")
    public WebElement Vehicle_DropdownChkBox;

    @FindBy(xpath = "(//li[@class='dropdown dropdown-level-1'])[1]")
    public WebElement FleetButton;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement VehiclesButton;

    @FindBy(xpath = "(//ul[@class='nav nav-pills icons-holder launchers-list'])[1]/li")
    public List<WebElement> InfoCarsIcon;

    public void vehicleLogin(){
        FleetButton.click();
        BrowserUtils.sleep(2);
        VehiclesButton.click();
    }
    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[4]")
    public WebElement ThreeDotIcons;
    public static  List<String> Icons(List<WebElement> list) {
        List<String> IconsTitle = new ArrayList<>();

        for (WebElement each : list){
            WebElement link= each.findElement(By.tagName("a"));
            IconsTitle.add(link.getAttribute("title"));
        }
        return IconsTitle;
    }




}
