package com.exercise.tests;

import com.exercise.pages.ContextMenuPage;
import com.exercise.utilities.ConfigurationReader;
import com.exercise.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContextMenu {
    @Test
    public void contextMenuTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("contextMenu"));

        ContextMenuPage contextMenuPage = new ContextMenuPage();
        contextMenuPage.contextMenu.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(contextMenuPage.contextMenu).perform();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Driver.getDriver().switchTo().alert().accept();


        String actualTitle2 = Driver.getDriver().getTitle();
        String expectedTitle2 = "The Internet";
        Assert.assertEquals(actualTitle2,expectedTitle2);


    }
}
