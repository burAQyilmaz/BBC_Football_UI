package com.bbc.step_definitions;

import com.bbc.pages.BasePage;
import com.bbc.pages.SearchPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;

public class Search_SD {

    BasePage basePage= new BasePage();
    SearchPage searchPage=new SearchPage();

    @When("clicks search box")
    public void clicks_search_box() {

        basePage.searchBox.click();
    }
    @When("user types {string} into search box and hits enter")
    public void user_types_into_search_box_and_hits_enter(String string) {

        searchPage.searchInput.sendKeys(string, Keys.ENTER);

    }
    @Then("list first heading and the last heading on the page")
    public void list_first_heading_and_the_last_heading_on_the_page() {

        System.out.println(searchPage.articleHeaders.get(0).getText());
        System.out.println(searchPage.articleHeaders.get(searchPage.articleHeaders.size()-1).getText().split(". Listen Now")[0]);

    }
}
