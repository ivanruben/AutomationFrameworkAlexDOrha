package ForBeginners.ForBeginners;

import Pages.IndexPage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class RegisterTestForBeginners extends SharedData {


    @Test
    public void metodaSkipSignInTest() {

//        IndexPage indexPage = new IndexPage(driver);
//        indexPage.clickSkipSignIn();
//        WebElement firstNameElement = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
//        firstNameElement.sendKeys("Ruben-Ioan");
//        WebElement lastNameElement = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
//        lastNameElement.sendKeys("Ivan");
//        WebElement addresNameElement = driver.findElement(By.cssSelector("textarea[ng-model='Adress']"));
//        addresNameElement.sendKeys("Cluj-Napoca, str. Geculescu, nr. 5");
//        WebElement emailAdressElement = driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
//        emailAdressElement.sendKeys("ruben@yahoo.com");
//        WebElement phoneElement = driver.findElement(By.cssSelector("input[ng-model='Phone']"));
//        phoneElement.sendKeys("+40740628409");
//        WebElement maleElement = driver.findElement(By.cssSelector("input[value='Male']"));
//        maleElement.click();


//        WebElement cricketElement = driver.findElement(By.id("checkbox1"));
//        cricketElement.click();
//        WebElement movieElement = driver.findElement(By.id("checkbox2"));
//        movieElement.click();
//        WebElement hockeyElement = driver.findElement(By.id("checkbox3"));
//        hockeyElement.click();

        //sau

//        List<WebElement> hobbiesElement = driver.findElements(By.cssSelector("input[type='checkbox']"));
//        for (int index = 0; index < hobbiesElement.size(); index++) {
//            hobbiesElement.get(index).click();
//        }
//
//        WebElement languagesElement = driver.findElement(By.id("msdd"));
//        languagesElement.click();
//
//        List<WebElement> languagesOptions = driver.findElements(By.cssSelector(".ui-corner-all"));
//        for (int index = 0; index < languagesOptions.size(); index++) {
//            if (languagesOptions.get(index).getText().equals("Romanian")) {
//                languagesOptions.get(index).click();
//            }
//            if (languagesOptions.get(index).getText().equals("English")) {
//                languagesOptions.get(index).click();
//            }
//            if (languagesOptions.get(index).getText().equals("French")) {
//                languagesOptions.get(index).click();
//            }
//        }
//        maleElement.click();
//
//        WebElement skillsElement = driver.findElement(By.id("Skills"));
//        Select skillsDropDown = new Select(skillsElement);
//        skillsDropDown.selectByVisibleText("Android");
//
//        WebElement countryElement = driver.findElement(By.className("select2-selection__arrow"));
//        countryElement.click();
//        WebElement country2Element = driver.findElement(By.className("select2-search__field"));
//        country2Element.sendKeys("India");
//        country2Element.sendKeys(Keys.ENTER);
//
//        WebElement yearElement = driver.findElement(By.id("yearbox"));
//        Select yearDropDown = new Select(yearElement);
//        yearDropDown.selectByVisibleText("1985");
//
//        WebElement monthElement = driver.findElement(By.cssSelector("select[placeholder='Month']"));
//        Select monthDropDown = new Select(monthElement);
//        monthDropDown.selectByVisibleText("April");
//
//        WebElement dayElement = driver.findElement(By.id("daybox"));
//        Select dayDropDown = new Select(dayElement);
//        dayDropDown.selectByVisibleText("4");
//
//        WebElement firstPasswordElement = driver.findElement(By.id("firstpassword"));
//        firstPasswordElement.sendKeys("admin");
//
//        WebElement secondPasswordElement = driver.findElement(By.id("secondpassword"));
//        secondPasswordElement.sendKeys("admin");
//
//        WebElement submitElement = driver.findElement(By.id("submitbtn"));
//        submitElement.click();
//
//        //driver.quit();

    }
}
