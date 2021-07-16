package com.exercise.tests;

import com.exercise.pages.DynamicConentPage;
import com.exercise.utilities.ConfigurationReader;
import com.exercise.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DynamicContent {
    @Test
    public void dynamicContent(){
        Driver.getDriver().get(ConfigurationReader.getProperty("dynamicContent"));
        DynamicConentPage dynamicConentPage = new DynamicConentPage();
       String content1 = dynamicConentPage.content.getText();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.getDriver().navigate().refresh();
        String content2 = dynamicConentPage.content.getText();
        Assert.assertTrue(!content1.equals(content2));

    }

}
