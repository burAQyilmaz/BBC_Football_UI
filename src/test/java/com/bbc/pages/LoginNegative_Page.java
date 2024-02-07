package com.bbc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginNegative_Page extends BasePage {

    @FindBy(id = "user-identifier-input")
    public WebElement inputBox;

    @FindBy(className = "sb-form-message__text")
    public WebElement errorMessage;

    @FindBy(id = "submit-button")
    public WebElement nextButton;
}
