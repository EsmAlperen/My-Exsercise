package com.exercise.pages;

import com.exercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {
  public DragAndDropPage(){
      PageFactory.initElements(Driver.getDriver(), this);
  }
    @FindBy(id = "column-a")
    public WebElement column1;

    @FindBy(id = "column-b")
    public WebElement column2;



}
