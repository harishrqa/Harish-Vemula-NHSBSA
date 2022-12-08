package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import pageObjects.ListMedicalConditionsPage;
import utilities.DriverFactory;


public class ListMedicalConditionsStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private ListMedicalConditionsPage listMedicalConditionsPage = new ListMedicalConditionsPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);

    @When("User Select list of medical conditions {string} and click next")
    public void GPScot_Wales(String select) {
        listMedicalConditionsPage.SelectListMedicalConditionsYesNO(select);
        commonPage.clickNext();
    }
}
