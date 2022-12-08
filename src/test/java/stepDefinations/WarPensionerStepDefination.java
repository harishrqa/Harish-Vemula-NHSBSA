package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import pageObjects.GPScotWalesPage;
import pageObjects.WarPensionerPage;
import utilities.DriverFactory;


public class WarPensionerStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private WarPensionerPage warPensionerPage = new WarPensionerPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);


    @When("User Select injury or illness caused by serving in the armed forces {string} and click next")
    public void GPScot_Wales(String select) {
        warPensionerPage.SelectWarPensionerYesNO(select);
        commonPage.clickNext();
    }
}
