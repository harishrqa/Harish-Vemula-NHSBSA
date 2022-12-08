package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utilities.Constants.*;

public class ResultsPage extends BasePage{
    private WebDriver _driver;

    public ResultsPage(WebDriver driver) {
        _driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "lis-advert")
    WebElement option1;

    @FindBy(id = "ppc-advert")
    WebElement option2;
    @FindBy(xpath ="//a[@href=\""+ HEALTHY_START +"\"]")
    WebElement lHealthyStart;
    public void HealthyStartLink(){
        lHealthyStart.isDisplayed();
    }
    public void ResultWithoutBenefits(){
        option1.isDisplayed();
        option2.isDisplayed();
        Assert.assertTrue(_driver.getPageSource().contains(HELP_CIRCUMSTANCES));
        Assert.assertTrue(_driver.getPageSource().contains(PAY_YOUR_NHS_COST));
        Assert.assertTrue(_driver.getPageSource().contains(COUNCIL_AND_HOUSING_COST));
        Assert.assertTrue(_driver.getPageSource().contains(CLAIMING_BENEFITS));
        Assert.assertTrue(_driver.getPageSource().contains(PARTNER_CHILDREN));
        Assert.assertTrue(_driver.getPageSource().contains(PRESCRIPTION));
        Assert.assertTrue(_driver.getPageSource().contains(DENTAL));
        Assert.assertTrue(_driver.getPageSource().contains(SIGHT));
        Assert.assertTrue(_driver.getPageSource().contains(GLASSES));
        Assert.assertTrue(_driver.getPageSource().contains(REPAIR_GLASSES));
        Assert.assertTrue(_driver.getPageSource().contains(WIGS_FABRIC));
        Assert.assertTrue(_driver.getPageSource().contains(TRAVEL));
        Assert.assertTrue(_driver.getPageSource().contains(SAVE_PRESCRIPTIONS));
        Assert.assertTrue(_driver.getPageSource().contains(PAY_PRESCRIPTIONS));
        Assert.assertTrue(_driver.getPageSource().contains(CHILD_SUPPORT));
        Assert.assertTrue(_driver.getPageSource().contains(CHILD_BELOW1));
        Assert.assertTrue(_driver.getPageSource().contains(CHILD_1_TO_4));
        Assert.assertTrue(_driver.getPageSource().contains(VITAMIN_SUPPLEMENTS));

    }
    public void ResultWithBenefits(){
        Assert.assertTrue(_driver.getPageSource().contains(FREE));
        Assert.assertTrue(_driver.getPageSource().contains(MONEY_OFF));

    }
    public void ResultWithArmedForces(){
        Assert.assertTrue(_driver.getPageSource().contains(FREE));
        Assert.assertTrue(_driver.getPageSource().contains(HELP_CIRCUMSTANCES));

    }
    public void ResultWithCareHome(){
        Assert.assertTrue(_driver.getPageSource().contains(FREE));
        Assert.assertTrue(_driver.getPageSource().contains(MONEY_OFF));

    }
    public void ResultWithoutScotland(){
        Assert.assertTrue(_driver.getPageSource().contains(FREE));
        Assert.assertTrue(_driver.getPageSource().contains(HELP_CIRCUMSTANCES));

    }
    public void ResultNorthernIreland(){
        Assert.assertTrue(_driver.getPageSource().contains(NO_SERVICES));
    }
    public void ResultMinorEngland(){
        Assert.assertTrue(_driver.getPageSource().contains(FREE));
        Assert.assertTrue(_driver.getPageSource().contains(MONEY_OFF));
        Assert.assertTrue(_driver.getPageSource().contains(DO_NOT_GET_HELP));

    }
}
