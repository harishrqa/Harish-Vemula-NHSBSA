package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


import static utilities.Constants.HEADER_LIVING_COUNTRY;


public class WhereYouLivePage extends BasePage {
    private WebDriver _driver;

    public WhereYouLivePage(WebDriver driver) {
        _driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "question-heading")
    WebElement header;
    @FindBy(id = "radio-england")
    WebElement CountryEngland;
    @FindBy(id = "radio-scotland")
    WebElement CountryScotland;
    @FindBy(id = "radio-wales")
    WebElement CountryWales;
    @FindBy(id = "radio-nire")
    WebElement CountryNIreland;

    public void VerifyHeader(){
        Assert.assertEquals(header.getText(),HEADER_LIVING_COUNTRY);
    }
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
          }

    }
}
