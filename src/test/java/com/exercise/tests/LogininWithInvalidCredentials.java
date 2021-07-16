package com.exercise.tests;

import com.exercise.pages.LoginWithInvalidCredentialsPage;
import com.exercise.utilities.ConfigurationReader;
import com.exercise.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogininWithInvalidCredentials {
    @Test
    public void LogininWithInvalidCredentials(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "The Internet";
        Assert.assertEquals(actualTitle,expectedTitle);
        LoginWithInvalidCredentialsPage loginWithInvalidCredentialsPage = new LoginWithInvalidCredentialsPage();
     loginWithInvalidCredentialsPage.userName.sendKeys("ellie");
     loginWithInvalidCredentialsPage.password.sendKeys("ellie123");
       loginWithInvalidCredentialsPage.loginButton.click();

       String message = loginWithInvalidCredentialsPage.errorMessage.getText();
        System.out.println(message);
        Assert.assertTrue(message.contains("Your username is invalid!"));


    }

}
