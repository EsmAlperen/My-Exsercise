package com.exercise.pages;

import com.exercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicConentPage {
    public DynamicConentPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="content")
    public WebElement content;



}
