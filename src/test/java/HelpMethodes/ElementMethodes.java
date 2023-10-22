package HelpMethodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ElementMethodes {
    private WebDriver driver;
    public ElementMethodes(WebDriver driver) {
        this.driver = driver;
    }
    public void moveToElement(WebElement element){
        Actions action = new Actions(driver);// clasa Actions te ajuta sa faci actiunile din mouse
        action.moveToElement(element).perform();//
    }
    public void waitVisibleElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void clickElement(WebElement element){
        waitVisibleElement(element);
        element.click();
    }
    public void fillElement(WebElement element, String text){
        waitVisibleElement(element);
        element.sendKeys(text);
    }
    public void validateTextElement(WebElement element, String text){
        waitVisibleElement(element);
        String actualeValue = element.getText();
        Assert.assertEquals(actualeValue,text);
    }
    public void selectByText(WebElement element, String text){
        Select DropDownBtn  = new Select(element);
        DropDownBtn.selectByVisibleText(text);
    }
    public void selectByValue(WebElement element, String text){
        Select DropDownBtn  = new Select(element);
        DropDownBtn.selectByValue(text);
    }
}
