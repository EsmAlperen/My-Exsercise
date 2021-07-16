package com.exercise.tests;

import com.exercise.pages.DragAndDropPage;
import com.exercise.utilities.ConfigurationReader;
import com.exercise.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    @Test
    public void dragAndDrop(){
        Driver.getDriver().get(ConfigurationReader.getProperty("dragAndDrop"));
        DragAndDropPage dragAndDropPage = new DragAndDropPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.clickAndHold(dragAndDropPage.column1).perform();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions.dragAndDrop(dragAndDropPage.column1,dragAndDropPage.column2).build().perform();
   actions.dragAndDrop(dragAndDropPage.column2,dragAndDropPage.column1).build().perform();
   actions.clickAndHold().build().perform();


     //   Assert.assertTrue(dragAndDropPage.column2.isEnabled()&&dragAndDropPage.column1.isEnabled());
    }
}
