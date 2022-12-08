package pageObjects;

import com.google.common.base.Splitter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class DOBPage extends BasePage{
    private WebDriver _driver;

    public DOBPage(WebDriver driver) {
        _driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "dob-day")
    WebElement day;
    @FindBy(id = "dob-month")
    WebElement month;
    @FindBy(id = "dob-year")
    WebElement year;
    @FindBy(className = "summary")
    WebElement Summary;

    public void enterDOB(String DofB){
        List<String> dmy = Splitter.on('-')
                .trimResults()
                .omitEmptyStrings()
                .splitToList(DofB);
        day.sendKeys(dmy.get(0));
        month.sendKeys(dmy.get(1));
        year.sendKeys(dmy.get(2));
    }
    public void UseDOB(){
       Summary.click();
    }
}
