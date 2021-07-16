package com.exercise.pages;

import com.exercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuccessPage {
    public LoginSuccessPage(){PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id= "username")
    public WebElement userName;

    @FindBy(id= "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;


    @FindBy(xpath = "//h4[@class='subheader']")
    public WebElement secureArea;


}
