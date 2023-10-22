package ForBeginners.ForBeginners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class zExersare {

    public WebDriver driver;

    @Test
    public void TestMethode() {
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Index.html");
        driver.manage().window().maximize();


        WebElement skipSignInElement = driver.findElement(By.id("btn2"));
        skipSignInElement.click();

        WebElement firstNameElement = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        firstNameElement.sendKeys("Ruben");

        WebElement lastNameElement = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        lastNameElement.sendKeys("Ivan");

        WebElement addressElement = driver.findElement(By.cssSelector("textarea[ng-model='Adress']"));
        addressElement.sendKeys("Cluj-Napoca");

        WebElement emailElement = driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
        emailElement.sendKeys("abracadabra@yahoo.com");

        WebElement phoneElement = driver.findElement(By.cssSelector("input[ng-model=\"Phone\"]"));
        phoneElement.sendKeys("008098254");

        WebElement sexElement = driver.findElement(By.cssSelector("input[value='Male']"));
        sexElement.click();

        List<WebElement> hobbiesListElements = driver.findElements(By.cssSelector("input[type='checkbox']"));
        for (int i = 0; i < hobbiesListElements.size(); i++) {
            hobbiesListElements.get(i).click();
        }

        WebElement languagesElement = driver.findElement(By.id("msdd"));
        languagesElement.click();

        List<WebElement> languageElement = driver.findElements(By.cssSelector("a[class='ui-corner-all']"));
        for (int i = 0; i < languageElement.size(); i++) {
            if (languageElement.get(i).getText().equals("French")) {
                languageElement.get(i).click();
            }
        }
        sexElement.click();

        WebElement skillsElement = driver.findElement(By.id("Skills"));
        skillsElement.click();
        Select pickSkills = new Select(skillsElement);
        pickSkills.selectByVisibleText("Android");

        sexElement.click();

        WebElement countryElement = driver.findElement(By.cssSelector("span[role='combobox']"));
        countryElement.click();
        WebElement countrySearchElement = driver.findElement(By.cssSelector("input[role='textbox']"));
        countrySearchElement.click();
        countrySearchElement.sendKeys("India");
        countrySearchElement.sendKeys(Keys.ENTER);

        WebElement yearElement = driver.findElement(By.id("yearbox"));
        Select dropDownYear = new Select(yearElement);
        dropDownYear.selectByVisibleText("1985");

        WebElement monthElement = driver.findElement(By.cssSelector("select[placeholder='Month']"));
        Select dorpDownMont = new Select(monthElement);
        dorpDownMont.selectByVisibleText("April");

        WebElement dayElement = driver.findElement(By.id("daybox"));
        Select dorpDownDay = new Select(dayElement);
        dorpDownDay.selectByVisibleText("4");

        WebElement firstPassElement = driver.findElement(By.id("firstpassword"));
        firstPassElement.sendKeys("password");

        WebElement secondPassElement = driver.findElement(By.id("secondpassword"));
        secondPassElement.sendKeys("password");


    }
}
