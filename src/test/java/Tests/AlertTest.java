package Tests;

import ObjectData.AlertObject;
import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class AlertTest extends Hooks {


    @Test
    public void metodaSkipSignInTest() {
        AlertObject alertObject = new AlertObject(propertieUtility.getAllData());

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.clickConsent();
        registerPage.navigateToAlert();

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.interactOkAlert();
        alertPage.ineractOkCancelAlert();
        alertPage.ineractTextAlert(alertObject);

    }
}
