package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DentalCountryPage extends BasePage{
    private WebDriver _driver;

    public DentalCountryPage(WebDriver driver) {
        _driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "radio-england")
    WebElement CountryEngland;
    @FindBy(id = "radio-scotland")
    WebElement CountryScotland;
    @FindBy(id = "radio-wales")
    WebElement CountryWales;
    @FindBy(id = "radio-nire")
    WebElement CountryNIreland;
    @FindBy(id = "radio-not-registered")
    WebElement NotRegistered;

    public void SelectCountry(String Country){
         switch (Country){
          case "England":
              CountryEngland.click();
              break;
          case "Scotland":
              CountryScotland.click();
              break;
          case "Wales":
              CountryWales.click();
              break;
          case "Northern Ireland":
              CountryNIreland.click();
              break;
          case "Not Registered":
              NotRegistered.click();
             break;
          }

    }
}
