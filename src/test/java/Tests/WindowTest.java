package Tests;

import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class WindowTest extends Hooks {


    @Test
    public void WindowTest() {

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.clickConsent();
        registerPage.navigateToWindow();

        WindowPage windowPage = new WindowPage(getDriver());
        windowPage.interactSingeTab();
        windowPage.interactSingeWindow();
        windowPage.interactMultipleTab();

    }
}