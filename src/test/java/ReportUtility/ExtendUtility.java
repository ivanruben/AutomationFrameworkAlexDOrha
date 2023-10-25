package ReportUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;

public class ExtendUtility {

    private static ExtentReports extentReports;
    private static String PathProject = System.getProperty("user.dir") + "/target/report/";
    private static ConcurrentHashMap <String, ExtentTest> context = new ConcurrentHashMap<>();
    public static  synchronized void initializedReport(){
        File folder = new File(PathProject);
        if(!folder.exists()){
            folder.mkdir();
        }
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(PathProject + "ExtendReport.html");
        htmlReporter.config().setTheme(Theme.DARK);
        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);
    }
    public static synchronized void createTest(String testName){
        ExtentTest testReport = extentReports.createTest(testName + "--report");
        context.put(Thread.currentThread().getName(),testReport);
        attachedTestLog("info", "--START TEST--" + testName);
    }
    public static synchronized void finishTest(String testName){
        attachedTestLog("info", "--FINISH TEST--" + testName);
    }

    public static synchronized void generateReport(){
        extentReports.flush();
    }

    public static synchronized void attachedTestLog(String stepType, String message){
        String currentTheread = Thread.currentThread().getName();
        if(stepType.equals("info")){
            context.get(currentTheread).log(Status.INFO, message);

            if(stepType.equals("pass")){
                context.get(currentTheread).log(Status.PASS, message);
            }
        }
    }
    public static synchronized void attachedTestLog(String reportName, String message, WebDriver driver){
        String currentTheread = Thread.currentThread().getName();
        context.get(currentTheread)
                .fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenShot(driver,reportName))
                        .build());
    }
    private static synchronized String getScreenShot(WebDriver driver, String reportName){
        String path = PathProject +reportName+".pgn";
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        byte[] imageByte=null;
        try {
            FileUtils.copyFile(src, new File(path));
            imageByte= IOUtils.toByteArray(Files.newInputStream(Paths.get(path)));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return Base64.getEncoder().encodeToString(imageByte);
    }
}
