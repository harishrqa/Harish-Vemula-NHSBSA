package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.CommonPage;
import pageObjects.WhereYouLivePage;
import utilities.DriverFactory;

public class WhereYouLiveStepDefination {

    private WebDriver _driver = DriverFactory.getDriver();
    private WhereYouLivePage whereYouLivePage = new WhereYouLivePage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);
    @When("User Select Country {string} and click next")
    public void select_Country(String Country) {
        whereYouLivePage.SelectCountry(Country);
        commonPage.clickNext();
    }

    @Then("Verify Which country do you live in page displayed")
    public void Verify_Country_Page() {
        whereYouLivePage.VerifyHeader();
    }
}
