package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LiveInHighlandsPage extends BasePage{
    private WebDriver _driver;

    public LiveInHighlandsPage(WebDriver driver) {
        _driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "radio-yes")
    WebElement Yes;
    @FindBy(id = "radio-no")
    WebElement No;

    public void SelectLiveHighlandYesNO(String YesNO){
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
