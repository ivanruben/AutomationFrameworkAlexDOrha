package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasedPage{

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "btn1")
    private WebElement signInElement;
    @FindBy(id = "btn2")
    private WebElement skipSignInElement;

    public void clickSignIn(){
        elementMethodes.clickElement(signInElement);
        LoggerUtility.infoTest("The user clicks on signInElement");

    }
    public void clickSkipSignIn(){
        elementMethodes.clickElement(skipSignInElement);
    }
}
