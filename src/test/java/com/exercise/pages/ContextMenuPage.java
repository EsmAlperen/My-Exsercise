package com.exercise.pages;

import com.exercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPage {
    public ContextMenuPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="hot-spot")
    public WebElement contextMenu;

    @FindBy(id="//button[.='Click for JS Alert']")
    public WebElement alert;
//[id='hot-spot']





}
