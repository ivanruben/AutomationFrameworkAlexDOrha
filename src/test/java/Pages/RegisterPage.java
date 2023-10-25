package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.NoSuchElementException;

public class RegisterPage extends BasedPage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p[text()='Consent']")
    private WebElement consentElement;
    @FindBy(css = "input[placeholder='First Name']")
    private WebElement firstNameElement;
    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement lastNameElement;
    @FindBy(css = "textarea[ng-model='Adress']")
    private WebElement addresNameElement;
    @FindBy(css = "input[ng-model='EmailAdress']")
    private WebElement emailAdressElement;
    @FindBy(css = "input[ng-model='Phone']")
    private WebElement phoneElement;
    @FindBy(css = "input[value='Male']")
    private WebElement maleElement;
    @FindBy(css = "input[type='checkbox']")
    private List<WebElement> hobbiesElement;
    @FindBy(id = "msdd")
    private WebElement languagesElement;
    @FindBy (css = ".ui-corner-all")
    private List<WebElement> languagesOptions;
    @FindBy(id = "Skills")
    private WebElement skillsElement;
    @FindBy(className = "select2-selection__arrow")
    public WebElement countryElement;
    @FindBy(className = "select2-search__field")
    private WebElement country2Element;
    @FindBy(id = "yearbox")
    private WebElement yearElement;
    @FindBy(css = "select[placeholder='Month']")
    private WebElement monthElement;
    @FindBy(id = "daybox")
    private WebElement dayElement;
    @FindBy(id = "firstpassword")
    private WebElement firstpassword;
    @FindBy(id = "secondpassword")
    private WebElement secondpassword;
    @FindBy(id = "submitbtn")
    private WebElement submitbtn;
    //------------------------------------------------
    @FindBy(xpath = "//a[text()='SwitchTo']")
    public WebElement switchToElement;
    @FindBy(xpath = "//a[text()='Alerts']")
    public WebElement alertElement;
    @FindBy(xpath = "//a[text()='Frames']")
    public WebElement frameElement;
    @FindBy(xpath = "//a[text()='Windows']")
    public WebElement windowElement;

    public void populateBasicInfo(String firstNameValue, String lastNameValue, String adressValue, String emailVlue,String phoneValue,
                                  List<String> languageValues, String skillValue, String countryValue,
                                  String yearDOBvalue, String monthDOBvalue, String dayDOBvalue, String passwordValue , String renterPasswordValue){
        elementMethodes.fillElement(firstNameElement,firstNameValue);
        elementMethodes.fillElement(lastNameElement,lastNameValue);
        elementMethodes.fillElement(addresNameElement, adressValue);
        elementMethodes.fillElement(phoneElement,phoneValue);
        elementMethodes.clickElement(maleElement);
        elementMethodes.fillElement(emailAdressElement,emailVlue);
        for (int index = 0; index < hobbiesElement.size(); index++) {
            hobbiesElement.get(index).click();
        }
        selectLanguage(languageValues);
        elementMethodes.selectByText(skillsElement, skillValue);
        elementMethodes.clickElement(countryElement);
        elementMethodes.fillElement(country2Element,countryValue);
        country2Element.sendKeys(Keys.ENTER);
        elementMethodes.selectByText(yearElement, yearDOBvalue);
        elementMethodes.selectByText(monthElement,monthDOBvalue);
        elementMethodes.selectByText(dayElement,dayDOBvalue);
        elementMethodes.fillElement(firstpassword, passwordValue);
        elementMethodes.fillElement(secondpassword, renterPasswordValue);
        elementMethodes.clickElement(submitbtn);
    }

    public void selectLanguage(List<String> values){
        languagesElement.click();
        for (int index = 0; index < languagesOptions.size(); index++) {
            if (values.contains(languagesOptions.get(index).getText())) {
                languagesOptions.get(index).click();
            }
        }
    }
    public void navigateToAlert(){
        elementMethodes.moveToElement(switchToElement);
        LoggerUtility.infoTest("The user moves the focus to Alert");
        elementMethodes.clickElement(alertElement);
        LoggerUtility.infoTest("The user clicks on Aler");
        driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
        LoggerUtility.infoTest("The user navigates to Alert");
    }
    public void navigateToFrame(){
        elementMethodes.moveToElement(switchToElement);
        LoggerUtility.infoTest("The user moves the focus to Frame");
        elementMethodes.clickElement(frameElement);
        LoggerUtility.infoTest("The user clicks on Frame");
        driver.navigate().to("https://demo.automationtesting.in/Frames.html");
        LoggerUtility.infoTest("The user navigates to Frame");
    }

    public void navigateToWindow(){
        elementMethodes.moveToElement(switchToElement);
        //LoggerUtility.infoTest("The user moves the focus to Window");
        elementMethodes.clickElement(windowElement);
        //LoggerUtility.infoTest("The user clicks on Window");
        driver.navigate().to("https://demo.automationtesting.in/Windows.html");
        //LoggerUtility.infoTest("The user navigates to Window");

    }

    public void clickConsent(){
        try {
            consentElement.click();
        }
        catch (NoSuchElementException ignored){
        }
        //elementMethodes.clickElement(consentElement);
        LoggerUtility.infoTest("User cklics on Consent button");
    }
}
