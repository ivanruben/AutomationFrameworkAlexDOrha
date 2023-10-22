package HelpMethodes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertMethodes {

    private WebDriver driver;

    public AlertMethodes(WebDriver driver) {
        this.driver = driver;
    }

    public void alertOk(){
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
    }
    public void alertOkCancel(){
        Alert alertOkCancel = driver.switchTo().alert();
        alertOkCancel.dismiss();
    }
    public void alertText(String value){
        Alert alertTextBox = driver.switchTo().alert();
        alertTextBox.sendKeys(value);
        alertTextBox.accept();
    }
}
