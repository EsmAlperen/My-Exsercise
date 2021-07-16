package com.exercise.pages;

import com.exercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage {
    public DropDownPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="dropdown")
    public WebElement dropdown;

    @FindBy(xpath = "//input[@type='checkbox'][2]")
    public WebElement checkBox2;

}
