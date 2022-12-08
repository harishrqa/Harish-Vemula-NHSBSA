package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import pageObjects.UniversalCreditClaimPage;
import utilities.DriverFactory;


public class UniversalCreditClaimStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private UniversalCreditClaimPage universalCreditClaimPage = new UniversalCreditClaimPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);


    @When("User Select Universal Credit {string} and click next")
    public void GPScot_Wales(String select) {
        universalCreditClaimPage.SelectCreditClaimYesNO(select);
        commonPage.clickNext();
    }
}
