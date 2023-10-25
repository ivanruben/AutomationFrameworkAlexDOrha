package Tests;

import ObjectData.AlertObject;
import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import ReportUtility.ExtendUtility;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class AlertTest extends Hooks {


    @Test
    public void metodaSkipSignInTest() {
        AlertObject alertObject = new AlertObject(propertieUtility.getAllData());

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();
        ExtendUtility.attachedTestLog("pass", "I click on Skip Sing In");

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.clickConsent();
        ExtendUtility.attachedTestLog("pass", "I click on Consent button");
        registerPage.navigateToAlert();
        ExtendUtility.attachedTestLog("pass", "I navigate to alert page");

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.interactOkAlert();
        ExtendUtility.attachedTestLog("pass", "I interacted with OK Alert");
        alertPage.ineractOkCancelAlert();
        ExtendUtility.attachedTestLog("pass", "I interactes with Cancel Alert");
        alertPage.ineractTextAlert(alertObject);
        ExtendUtility.attachedTestLog("pass", "I interacted with Text Alert");

    }
}
