package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import pageObjects.DentalCountryPage;
import utilities.DriverFactory;


public class DentalCountryStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private DentalCountryPage dentalCountryPage = new DentalCountryPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);

    @When("User Select Dental Practice Country {string} and click next")
    public void select_Country(String Country) {
        dentalCountryPage.SelectCountry(Country);
        commonPage.clickNext();
    }
}
