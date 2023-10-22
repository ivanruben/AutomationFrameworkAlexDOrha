package Pages;

import HelpMethodes.AlertMethodes;
import HelpMethodes.ElementMethodes;
import HelpMethodes.FrameMethodes;
import HelpMethodes.WindowMethodes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasedPage {

    public WebDriver driver;
    public FrameMethodes frameMethodes;
    public ElementMethodes elementMethodes;
    public AlertMethodes alertMethodes;
    public WindowMethodes windowMethodes;

    public BasedPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
        elementMethodes = new ElementMethodes(driver);
        alertMethodes = new AlertMethodes(driver);
        windowMethodes = new WindowMethodes(driver);
        frameMethodes = new FrameMethodes(driver);

    }
}
