package com.bbc.pages;

import com.bbc.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "orbit-search-button-icon-with-text")
    public WebElement searchBox;

    @FindBy(id="idcta-link")
    public WebElement signInButton;
}
