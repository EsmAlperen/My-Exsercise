package com.exercise.tests;

import com.exercise.pages.DynamicControlsPage;
import com.exercise.utilities.ConfigurationReader;
import com.exercise.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControls {
    @Test
    public void dynamicControl() {
        Driver.getDriver().get(ConfigurationReader.getProperty("dynamicControls"));
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
     String text1 =   dynamicControlsPage.checkBox.getText();
      dynamicControlsPage.button.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(dynamicControlsPage.button));

        String text2 =   dynamicControlsPage.button.getText();
        wait.until(ExpectedConditions.visibilityOf(dynamicControlsPage.button));
        Assert.assertTrue(!text1.equals(text2));
    }
}
//dynamicControls