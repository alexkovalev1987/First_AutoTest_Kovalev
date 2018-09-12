package listeners;

import com.gurock.testrail.TestRailConnector;
import deflogger.TestsLogger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
        TestsLogger.startTestCase(iTestResult.getMethod().getDescription());

    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {

        int resultId = 5;
        String comment = "TEST FAILD :" + iTestResult.getName() + "\n";
        String testCasedId = iTestResult.getMethod(). getDescription();

        long duration = (iTestResult.getEndMillis()-iTestResult.getStartMillis())/1000;

        TestRailConnector testRailConnector = new TestRailConnector(
                "https://itstep092018.testrail.io","alexgomel1987@gmail.com","Fktrc1987fktrc");
        testRailConnector.sendTestResult(testCasedId, resultId,comment,duration,"R13");

    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
