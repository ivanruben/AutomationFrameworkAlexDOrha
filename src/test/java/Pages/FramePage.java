package Pages;

import Logger.LoggerUtility;
import ObjectData.FrameObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasedPage{
    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".analystic")
    private List<WebElement> framesOptions;
    @FindBy(xpath = "//input[@type='text']")
    private WebElement inputSingleElement;
    @FindBy(xpath = "//input[@type='text']")
    private WebElement inputMultipleElement;

    public void interactSingelFrame(FrameObject frameObject){
        elementMethodes.clickElement(framesOptions.get(0));
        LoggerUtility.infoTest("The user clicks on first Frame option");
        frameMethodes.switchToFrame("singleframe");
        LoggerUtility.infoTest("The user switches on single IFrame");
        elementMethodes.fillElement(inputSingleElement,frameObject.getSingleIFrame());
        LoggerUtility.infoTest("The user fills in the first text box");
        frameMethodes.switchToDefaultFrame();
        LoggerUtility.infoTest("The user interacts with Single Frame");
    }

    public void interactMultipleFrame(FrameObject frameObject){
        elementMethodes.clickElement(framesOptions.get(1));
        LoggerUtility.infoTest("The user clicks on second Frame option");
        frameMethodes.switchToFrame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
        frameMethodes.switchToFrame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
        LoggerUtility.infoTest("The user switches on Multiple IFrame");
        elementMethodes.fillElement(inputMultipleElement,frameObject.getMultipleIFrame());
        LoggerUtility.infoTest("The user fills in the second text box");
    }
}
