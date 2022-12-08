package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import pageObjects.SavingsPage;
import utilities.DriverFactory;


public class SavingsStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private SavingsPage savingsPage = new SavingsPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);


    @When("User Select more than in savings, investments or property {string} and click next")
    public void SelectSavingsYesNO(String select) {
        savingsPage.SelectSavingsYesNO(select);
        commonPage.clickNext();
    }
}
