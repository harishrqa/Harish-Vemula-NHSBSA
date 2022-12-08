package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class CommonPage extends BasePage{
    private WebDriver _driver;

    public CommonPage(WebDriver driver) {
        _driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "next-button")
    WebElement nextButton;
    public void clickNext(){
        clickOnButton(nextButton);
    }
}
