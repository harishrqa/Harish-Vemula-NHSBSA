package stepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import pageObjects.DOBPage;
import utilities.DriverFactory;


public class DOBStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private DOBPage dobPage = new DOBPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);

    @When("User enters DOB {string} and click next")
    public void userEntersDOB(String dob) {
        dobPage.enterDOB(dob);
        commonPage.clickNext();
    }
    @Then("Verify Why we ask for your date of birth")
    public void Why_We_Use_DOB() {
        dobPage.UseDOB();
    }
}
