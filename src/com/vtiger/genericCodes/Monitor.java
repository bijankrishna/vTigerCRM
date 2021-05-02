package com.vtiger.genericCodes;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Monitor implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {}

	@Override
	public void onTestSuccess(ITestResult result) {}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testscript Failed");
		String testName = result.getName();
		EventFiringWebDriver efwd=new EventFiringWebDriver(BaseClass.driverForScreenShot);
		File srcFile = efwd.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./screenshot/"+testName+".png"));
			System.out.println("Screenshot Taken");
		} catch (IOException e) {
			System.out.println("Failed to take Screenshot");
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {}

	@Override
	public void onStart(ITestContext context) {}

	@Override
	public void onFinish(ITestContext context) {}

}
