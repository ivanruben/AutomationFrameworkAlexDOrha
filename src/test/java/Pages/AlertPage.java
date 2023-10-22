package Pages;

import Logger.LoggerUtility;
import ObjectData.AlertObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertPage extends BasedPage {

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "analystic")
    private List<WebElement> alertOptions;
    @FindBy(css = ".btn-danger")
    private WebElement buttonAlert;
    @FindBy(css = ".btn-primary")
    private WebElement buttonAlert2;
    @FindBy(css = ".btn-info")
    private WebElement buttonAlert3;

    public void interactOkAlert() {
        elementMethodes.clickElement(alertOptions.get(0));
        LoggerUtility.infoTest("The user click on first ALERT");
        elementMethodes.clickElement(buttonAlert);
        LoggerUtility.infoTest("The user click on ALERT button");
        alertMethodes.alertOk();
        LoggerUtility.infoTest("The user click on OK ALERT");
    }

    public void ineractOkCancelAlert() {
        elementMethodes.clickElement(alertOptions.get(1));
        LoggerUtility.infoTest("The user click on second ALERT");
        elementMethodes.clickElement(buttonAlert2);
        LoggerUtility.infoTest("The user click on ALERT2 button");
        alertMethodes.alertOkCancel();
        LoggerUtility.infoTest("The user click on Cancel ALERT");
    }

    public void ineractTextAlert(AlertObject alertObject) {
        elementMethodes.clickElement(alertOptions.get(2));
        LoggerUtility.infoTest("The user click on third ALERT");
        elementMethodes.clickElement(buttonAlert3);
        LoggerUtility.infoTest("The user click on ALERT3 button");
        alertMethodes.alertText(alertObject.getAlerta());
        LoggerUtility.infoTest("The user click on Text ALERT");
    }

}
