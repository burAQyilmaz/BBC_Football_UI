package com.bbc.step_definitions;

import com.bbc.pages.ScoreFixture_Page;
import com.bbc.utilities.ConfigurationReader;
import com.bbc.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ScoreFixture_SD {

    ScoreFixture_Page scoreFixturePage = new ScoreFixture_Page();

    @Given("user lands on the {string} page")
    public void user_lands_on_the_page(String title) {

        Driver.getDriver().get(ConfigurationReader.getProperty(title));
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }

    @When("user sees all team names with a match today")
    public void user_sees_all_team_names_with_a_match_today() {
        if (scoreFixturePage.teamNames.isEmpty()) return;
        for (WebElement teamName : scoreFixturePage.teamNames)

            System.out.println(teamName.getText());

    }

    @When("if there is no matches today display, a message")
    public void if_there_is_no_matches_today_display_a_message() {

        if (scoreFixturePage.teamNames.isEmpty()) System.out.println("There is no matches today!");
    }
}
