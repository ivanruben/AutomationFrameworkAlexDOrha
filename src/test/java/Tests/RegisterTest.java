package Tests;

import ObjectData.LoginObject;
import ObjectData.RegisterObject;
import Pages.IndexPage;
import Pages.RegisterPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class RegisterTest extends Hooks {


    @Test
    public void metodaSkipSignInTest() {
        RegisterObject registerObject = new RegisterObject(propertieUtility.getAllData());

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.clickConsent();
        List<String> languageValues = Arrays.asList(registerObject.getLanguage1(), registerObject.getLanguage2(),registerObject.getLanguage3());
        registerPage.populateBasicInfo(registerObject.getFirstName(), registerObject.getLastName(), registerObject.getAdresa(), registerObject.getEmail(), registerObject.getPhone(),
                languageValues, registerObject.getSkills(), registerObject.getCountry(), registerObject.getYearDOB(), registerObject.getMonthDOB(), registerObject.getDayDOB(),
                registerObject.getUser(),registerObject.getUser());

    }
}
