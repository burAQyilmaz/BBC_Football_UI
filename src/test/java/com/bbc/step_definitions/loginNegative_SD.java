package com.bbc.step_definitions;

import com.bbc.pages.BasePage;
import com.bbc.pages.LoginNegative_Page;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class loginNegative_SD {

    BasePage basePage = new BasePage();
    LoginNegative_Page loginNegativePage = new LoginNegative_Page();


    @When("user clicks sign in button")
    public void user_clicks_sign_in_button() {

        basePage.signInButton.click();
    }

    @When("user types {string} into input box and {string}")
    public void user_types_into_input_box_and(String keyword, String submitAction) {
        loginNegativePage.inputBox.sendKeys(keyword);
        if (submitAction.equals("enter")) loginNegativePage.inputBox.sendKeys(Keys.ENTER);

        else loginNegativePage.nextButton.click();
    }

    @Then("user should see {string}")
    public void user_should_see(String errorMessage) {

        Assert.assertEquals(errorMessage, loginNegativePage.errorMessage.getText() );
    }


}
