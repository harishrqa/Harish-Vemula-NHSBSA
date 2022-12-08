package stepDefinations;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;
import pageObjects.GPScotWalesPage;
import pageObjects.ResultsPage;
import utilities.DriverFactory;


public class ResultsStepDefination extends BasePage {
    private WebDriver _driver = DriverFactory.getDriver();
    private ResultsPage resultsPage = new ResultsPage(_driver);
    @Then("Verify the final result without benefits")
    public void verify_without_benefit_result() {
        resultsPage.ResultWithoutBenefits();
    }
    @Then("Verify the final result for minor in England")
    public void verify_minor_england_result() {
        resultsPage.ResultMinorEngland();
    }
    @Then("Verify Healthy Start Link displayed")
    public void verify_Healthy_Start_Link_result() {
        resultsPage.HealthyStartLink();
    }
    @Then("Verify the final result with benefits")
    public void verify_with_benefit_result() {
        resultsPage.ResultWithBenefits();
    }
    @Then("Verify the final result with armed forces")
    public void verify_with_armedForces_result() {
        resultsPage.ResultWithArmedForces();
    }
    @Then("Verify the final result with care home")
    public void verify_with_CareHome_result() {
        resultsPage.ResultWithCareHome();
    }
    @Then("Verify the final result without benefits for scotland")
    public void verify_without_Scot_result() {
        resultsPage.ResultWithoutScotland();
    }
    @Then("Verify Services not available in Northern Ireland")
    public void verify_Northern_Ireland() {
        resultsPage.ResultNorthernIreland();
    }
}
