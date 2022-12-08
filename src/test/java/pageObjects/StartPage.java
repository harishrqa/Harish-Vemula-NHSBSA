package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.TestPropertyUtilities;

public class StartPage extends BasePage {
    private WebDriver _driver;

    public StartPage(WebDriver driver) {
        _driver = driver;
        PageFactory.initElements(_driver, this);
    }

    @FindBy(id = "next-button")
    WebElement StartNow;
    @FindBy(id = "nhsuk-cookie-banner__link_accept")
    WebElement cookieAccept;


    public void clickStartNow(){
        clickOnButton(StartNow);
        clickOnButton(cookieAccept);
    }

    public void navigateToStartPage() throws Exception {
        TestPropertyUtilities testPropertyUtilities = new TestPropertyUtilities();
        String baseUrl = testPropertyUtilities.getStringProperty("BASE_URL").toString();
        _driver.navigate().to(baseUrl);

    }
}
