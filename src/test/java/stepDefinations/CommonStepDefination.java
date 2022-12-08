package stepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import utilities.DriverFactory;


public class CommonStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private CommonPage commonPage = new CommonPage(_driver);
    @When("User Click Next")
    public void click_Next() {
        commonPage.clickNext();
 }
}
