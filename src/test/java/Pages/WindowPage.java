package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowPage extends BasedPage {

    public WindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".analystic")
    private List<WebElement> tabOptions;

    @FindBy(css = "#Tabbed button")
    private WebElement tabOptionElement;

    @FindBy(css = "#Seperate>button")
    private WebElement WindowOption2Element;

    @FindBy(css = "#Multiple>button")
    private WebElement tabsOptionElement;

    public void interactSingleTab() {
        elementMethodes.clickElement(tabOptions.get(0));
        System.out.println(driver.getTitle());
        elementMethodes.clickElement(tabOptionElement);
        System.out.println(driver.getTitle());
        windowMethodes.moveFocusSpecificTabe(1);
        windowMethodes.closeCurrentTab();
        windowMethodes.moveFocusSpecificTabe(0);

    }

    public void interactSingleWindow() {
        driver.navigate().to("https://demo.automationtesting.in/Windows.html");
        elementMethodes.clickElement(tabOptions.get(1));
        elementMethodes.clickElement(WindowOption2Element);
        System.out.println(driver.getTitle());
        windowMethodes.moveFocusSpecificTabe(1);
        windowMethodes.closeCurrentTab();
        windowMethodes.moveFocusSpecificTabe(0);
    }

    public void interactMultipleTab() {
        elementMethodes.clickElement(tabOptions.get(2));
        elementMethodes.clickElement(tabsOptionElement);
        System.out.println(driver.getTitle());
        windowMethodes.moveFocusSpecificTabe(2);
        windowMethodes.closeCurrentTab();
        windowMethodes.moveFocusSpecificTabe(1);
        windowMethodes.closeCurrentTab();
        windowMethodes.moveFocusSpecificTabe(0);
    }
}
