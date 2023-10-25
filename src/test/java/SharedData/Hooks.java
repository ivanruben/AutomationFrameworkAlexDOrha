package SharedData;

import Logger.LoggerUtility;
import PropertieUtility.PropertieUtility;
import ReportUtility.ExtendUtility;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Hooks extends SharedData{

    public PropertieUtility propertieUtility;
    @BeforeMethod
    public void prepareEnvironment(){
        initiateDriver();
        String testName = this.getClass().getSimpleName();
        propertieUtility = new PropertieUtility(testName);
        LoggerUtility.startTestCase(testName);
        ExtendUtility.createTest(testName);
    }

    @BeforeSuite
    public void initiateReport(){
        ExtendUtility.initializedReport();
    }
    @AfterMethod
    public void clearEnvironment(ITestResult result){
        String testName = this.getClass().getSimpleName();
        if(result.getStatus() == ITestResult.FAILURE){
            ExtendUtility.attachedTestLog(testName, result.getThrowable().getMessage(),getDriver());
        }
        clear();
        LoggerUtility.endTestCase(testName);
        ExtendUtility.finishTest(testName);
    }

    @AfterSuite
    public void finishSuite(){
        LoggerUtility.mergeFilesIntoOne();
        ExtendUtility.generateReport();
    }
}
