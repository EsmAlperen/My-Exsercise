package com.exercise.pages;

import com.exercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {
    public CheckBoxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@type='checkbox'][1]")
    public WebElement checkBox1;

    @FindBy(xpath = "//input[@type='checkbox'][2]")
    public WebElement checkBox2;


}
