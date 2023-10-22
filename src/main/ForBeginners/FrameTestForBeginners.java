package ForBeginners.ForBeginners;

import Pages.IndexPage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class FrameTestForBeginners extends SharedData {

    @Test
    public void FrameTest() {

//        IndexPage indexPage = new IndexPage(driver);
//        indexPage.clickSkipSignIn();
//
//        WebElement switchToElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
//        Actions action = new Actions(driver);
//        action.moveToElement(switchToElement).perform();
//
//        WebElement windiwElement = driver.findElement(By.xpath("//a[text()='Frames']"));
//        windiwElement.click();
//
//        driver.navigate().to("https://demo.automationtesting.in/Frames.html");
//
//        List<WebElement> framesOptions = driver.findElements(By.cssSelector(".analystic"));
//        framesOptions.get(0).click();
//        driver.switchTo().frame("singleframe");
//        WebElement inputSingleElement = driver.findElement(By.xpath("//input[@type='text']"));
//        inputSingleElement.sendKeys("test");
//        driver.switchTo().defaultContent();
//
//        framesOptions.get(1).click();
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
//        WebElement inputMultipleElement = driver.findElement(By.xpath("//input[@type='text']"));
//        inputMultipleElement.sendKeys("test");



    }
}
