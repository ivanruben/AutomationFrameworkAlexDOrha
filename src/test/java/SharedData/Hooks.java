package SharedData;

import Logger.LoggerUtility;
import PropertieUtility.PropertieUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class Hooks extends SharedData{

    public PropertieUtility propertieUtility;
    @BeforeMethod
    public void prepareEnvironment(){
        initiateDriver();
        String testName = this.getClass().getSimpleName();
        propertieUtility = new PropertieUtility(testName);
        LoggerUtility.startTestCase(testName);
    }

    @AfterMethod
    public void clearEnvironment(){
        clear();
        String testName = this.getClass().getSimpleName();
        LoggerUtility.endTestCase(testName);
    }

    @AfterSuite
    public void finishSuite(){
        LoggerUtility.mergeFilesIntoOne();
    }
}
