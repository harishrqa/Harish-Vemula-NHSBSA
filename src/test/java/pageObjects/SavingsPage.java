package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SavingsPage extends BasePage{
    private WebDriver _driver;

    public SavingsPage(WebDriver driver) {
        _driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "radio-yes")
    WebElement Yes;
    @FindBy(id = "radio-no")
    WebElement No;

    public void SelectSavingsYesNO(String YesNO){
         switch (YesNO){
          case "Yes":
              Yes.click();
              break;
          case "No":
              No.click();
              break;
          }

    }
}
