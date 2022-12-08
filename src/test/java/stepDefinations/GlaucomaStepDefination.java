package stepDefinations;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.CommonPage;
import pageObjects.GPScotWalesPage;
import pageObjects.GlaucomaPage;
import utilities.DriverFactory;


public class GlaucomaStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private GlaucomaPage glaucomaPage = new GlaucomaPage(_driver);
    private CommonPage commonPage = new CommonPage(_driver);

    @When("User Select you or a family member have glaucoma {string} and click next")
    public void GPScot_Wales(String select) {
        glaucomaPage.SelectGlaucomaYesNO(select);
        commonPage.clickNext();
    }
}
