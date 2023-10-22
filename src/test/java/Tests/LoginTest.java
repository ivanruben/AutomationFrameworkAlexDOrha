package Tests;
import ObjectData.LoginObject;
import Pages.IndexPage;
import Pages.LoginPage;
import PropertieUtility.PropertieUtility;
import SharedData.Hooks;;
import org.testng.annotations.Test;

public class LoginTest extends Hooks {

    @Test
    public void metodaLogInTest(){
        LoginObject loginObject = new LoginObject(propertieUtility.getAllData());

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSignIn();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginInvalid(loginObject);

    }

}
