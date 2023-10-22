package Tests;

import ObjectData.FrameObject;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class FrameTest extends Hooks {

    @Test
    public void FrameTest() {
        FrameObject frameObject = new FrameObject(propertieUtility.getAllData());

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.clickConsent();
        registerPage.navigateToFrame();

        FramePage framePage = new FramePage(getDriver());
        framePage.interactSingelFrame(frameObject);
        framePage.interactMultipleFrame(frameObject);

    }
}
