package com.exercise.pages;

import com.exercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {
    public DynamicControlsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="checkbox-example")
    public WebElement checkBox;
    @FindBy(xpath = "//button[@type='button']")
    public WebElement button;



}