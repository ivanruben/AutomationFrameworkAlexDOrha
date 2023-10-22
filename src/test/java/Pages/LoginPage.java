package Pages;

import Logger.LoggerUtility;
import ObjectData.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasedPage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[placeholder='E mail']")
    private WebElement emailFieldElement;
    @FindBy(css = "input[placeholder='Password']")
    private WebElement passwordFieldElement;
    @FindBy(id = "enterbtn")
    private WebElement enterButtonElement;
    @FindBy(id = "errormsg")
    private WebElement errorMessageElement;

    public void loginInvalid(LoginObject loginObject){
        elementMethodes.fillElement(emailFieldElement, loginObject.getEmail());
        LoggerUtility.infoTest("The user fills the emailFieldElement with the value " + loginObject.getEmail());
        elementMethodes.fillElement(passwordFieldElement, loginObject.getPassword());
        LoggerUtility.infoTest("The user fills the passwordFieldElement with the value " + loginObject.getPassword());
        elementMethodes.clickElement(enterButtonElement);
        LoggerUtility.infoTest("The user clicks on enterButtonElement");
        elementMethodes.validateTextElement(errorMessageElement,loginObject.getErrorMessage());
        LoggerUtility.infoTest("The user validates errorMessageElement field to have value "+loginObject.getErrorMessage());




    }


}
