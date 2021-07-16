package com.exercise.tests;

import com.exercise.pages.DropDownPage;
import com.exercise.utilities.ConfigurationReader;
import com.exercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown {
    @Test
    public void dropDown(){
        Driver.getDriver().get(ConfigurationReader.getProperty("dropDown"));
        DropDownPage dropDownPage=new DropDownPage();

        List<WebElement> options = new Select(dropDownPage.dropdown).getOptions();
        for (WebElement each: options
             ) {
            System.out.println(each.getText());
        }

    }

}
