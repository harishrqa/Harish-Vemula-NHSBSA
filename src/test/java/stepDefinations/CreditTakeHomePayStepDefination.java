package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import pageObjects.CreditTakeHomePayPage;
import utilities.DriverFactory;


public class CreditTakeHomePayStepDefination extends BasePage {

    private WebDriver _driver = DriverFactory.getDriver();
    private CreditTakeHomePayPage creditTakeHomePayPage = new CreditTakeHomePayPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);

    @When("User Select take home pay {string} and click next")
    public void GPScot_Wales(String select) {
        creditTakeHomePayPage.SelectTakeHomeYesNO(select);
        commonPage.clickNext();
    }
}
