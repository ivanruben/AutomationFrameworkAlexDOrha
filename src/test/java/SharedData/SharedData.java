package SharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {

    private WebDriver driver;



    public void initiateDriver(){

        String ci_cd = System.getProperty("ci_cd");

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--window-size=1920,1080");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        if(Boolean.parseBoolean(ci_cd)){
            options.addArguments("--headless");
        }

        driver = new ChromeDriver(options);
        driver.get("https://demo.automationtesting.in/Index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public void clear(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
