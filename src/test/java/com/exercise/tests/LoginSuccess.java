package com.exercise.tests;

import com.exercise.pages.LoginSuccessPage;
import com.exercise.utilities.ConfigurationReader;
import com.exercise.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSuccess {
@Test
    public void loginSuccess(){
    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    String actualTitle = Driver.getDriver().getTitle();
    String expectedTitle = "The Internet";
    Assert.assertEquals(actualTitle,expectedTitle);
    LoginSuccessPage loginSuccessPage = new LoginSuccessPage();
    loginSuccessPage.userName.sendKeys(ConfigurationReader.getProperty("username"));
    loginSuccessPage.password.sendKeys(ConfigurationReader.getProperty("password"));
    loginSuccessPage.loginButton.click();

    String actualTitle2 = Driver.getDriver().getTitle();
    String expectedTitle2 = "The Internet";
    Assert.assertEquals(actualTitle2,expectedTitle2);


    String text = loginSuccessPage.secureArea.getText();
    System.out.println(text);
   Assert.assertTrue(text.contains("Welcome to the Secure Area."));

}

}
