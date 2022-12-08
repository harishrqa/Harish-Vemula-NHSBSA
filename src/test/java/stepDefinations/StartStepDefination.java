package stepDefinations;


import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import pageObjects.StartPage;
import io.cucumber.java.en.*;
import utilities.DriverFactory;;


public class StartStepDefination {

    private WebDriver _driver = DriverFactory.getDriver();
    private StartPage startPage = new StartPage(_driver);


    @Given("User opens nhs cost checker tool")
    public void user_opens_url() throws Exception {
        startPage.navigateToStartPage();
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String title) {
        if (_driver.getTitle().contains(title)){
            Assert.assertTrue("Web page Launched",true);
        }
    }
    @When("Click on Start now")
    public void click_on_start_now() {
        startPage.clickStartNow();
    }
}
