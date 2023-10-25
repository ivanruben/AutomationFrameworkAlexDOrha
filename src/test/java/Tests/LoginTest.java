package Tests;
import ObjectData.LoginObject;
import Pages.IndexPage;
import Pages.LoginPage;
import PropertieUtility.PropertieUtility;
import ReportUtility.ExtendUtility;
import SharedData.Hooks;;
import org.testng.annotations.Test;

public class LoginTest extends Hooks {

    @Test
    public void metodaLogInTest(){
        LoginObject loginObject = new LoginObject(propertieUtility.getAllData());

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSignIn();
        ExtendUtility.attachedTestLog("pass", "I click on Sing In");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginInvalid(loginObject);
        ExtendUtility.attachedTestLog("pass", "I make login process with invalid test data");

    }

}
