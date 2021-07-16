package com.exercise.tests;

import com.exercise.pages.CheckBoxPage;
import com.exercise.utilities.ConfigurationReader;
import com.exercise.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CheckBox {
    @Test
    public void checkBox(){
        Driver.getDriver().get(ConfigurationReader.getProperty("checkBoxURL"));

        CheckBoxPage checkBoxPage = new CheckBoxPage();


        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(checkBoxPage.checkBox1).click().perform();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertTrue(checkBoxPage.checkBox1.isEnabled());

        actions.moveToElement(checkBoxPage.checkBox2).click().perform();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertTrue(checkBoxPage.checkBox2.isDisplayed());



    }
}
