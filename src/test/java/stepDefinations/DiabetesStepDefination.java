package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import pageObjects.DiabetesPage;
import utilities.DriverFactory;


public class DiabetesStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private DiabetesPage diabetesPage = new DiabetesPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);

    @When("User Select have diabetes {string} and click next")
    public void GPScot_Wales(String select) {
        diabetesPage.SelectDiabetesYesNO(select);
        commonPage.clickNext();
    }
}
