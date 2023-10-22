package HelpMethodes;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowMethodes {
    private WebDriver driver;

    public WindowMethodes(WebDriver driver) {
        this.driver = driver;
    }

    public void moveFocusSpecificTabe(Integer index){
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(index));
        System.out.println(driver.getTitle());
    }

    public void closeCurrentTab(){
        driver.close();
    }
}
