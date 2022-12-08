package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import pageObjects.LocalCouncilAssessedPage;
import utilities.DriverFactory;


public class LocalCouncilAssessedStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private LocalCouncilAssessedPage localCouncilAssessedPage = new LocalCouncilAssessedPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);

    @When("User Select pay for your care home from your local council {string} and click next")
    public void GPScot_Wales(String select) {
        localCouncilAssessedPage.SelectCouncilAssessedYesNO(select);
        commonPage.clickNext();
    }
}
