package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PaidUniversalCreditPage extends BasePage{
    private WebDriver _driver;

    public PaidUniversalCreditPage(WebDriver driver) {
        _driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "yes-universal")
    WebElement Yes;
    @FindBy(id = "not-yet")
    WebElement NotYet;
    @FindBy(id = "different-benefit")
    WebElement NoDifBene;

    public void SelectUniversalCredit(String Benefit){
         switch (Benefit){
          case "Yes":
              Yes.click();
              break;
          case "Not Yet":
              NotYet.click();
              break;
          case "No":
              NoDifBene.click();
              break;
          }

    }
}
