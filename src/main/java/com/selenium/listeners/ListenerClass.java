package com.selenium.listeners;

import com.selenium.annotations.FrameworkAnnotation;
import com.selenium.constants.FrameworkConstants;
import com.selenium.reports.ExtentLogger;
import com.selenium.reports.ExtentReport;
import org.testng.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ListenerClass implements ITestListener, ISuiteListener {

    @Override
    public void onStart(ISuite iSuite) {
        ExtentReport.initReports();
    }

    @Override
    public void onFinish(ISuite iSuite) {
        try {
            ExtentReport.flushReports();
            Desktop.getDesktop().browse(new File(FrameworkConstants.getEXTENTREPORTFILEPATH()).toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        ExtentReport.createTest(iTestResult.getMethod().getMethodName());
        ExtentLogger.pass(iTestResult.getName() + " is started successfully", true);
        ExtentReport.addAuthors(iTestResult.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class)
                .author());
        ExtentReport.addCategories(iTestResult.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class)
                .category());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        ExtentLogger.pass(iTestResult.getMethod().getMethodName() + " is passed", true);
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        iTestResult.getThrowable().getMessage();
        ExtentLogger.fail(iTestResult.getMethod().getMethodName() + " is failed", true);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        ExtentLogger.skip(iTestResult.getMethod().getMethodName() + " is skipped", true);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
