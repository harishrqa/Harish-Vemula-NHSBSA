package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.BenefitsTaxCreditsPage;
import pageObjects.CommonPage;
import pageObjects.GPScotWalesPage;
import utilities.DriverFactory;


public class BenefitsTaxCreditsStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private BenefitsTaxCreditsPage benefitsTaxCreditsPage = new BenefitsTaxCreditsPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);

    @When("User Select claim any benefits or tax credits {string} and click next")
    public void GPScot_Wales(String select) {
        benefitsTaxCreditsPage.SelectBenefitsTaxCreditsYesNO(select);
        commonPage.clickNext();
    }
}
