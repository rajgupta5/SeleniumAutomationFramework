package com.selenium.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.selenium.utils.TestUtils;

public final class ExtentLogger {

    private ExtentLogger() {

    }

    public static void pass(String details) {
        ExtentManager.getExtentTest().pass(details);
    }

    public static void pass(String details, boolean isScreenShotNeeded) {
        if(isScreenShotNeeded) {
            ExtentManager.getExtentTest().pass(details, MediaEntityBuilder.createScreenCaptureFromBase64String(TestUtils.getBase64Image()).build());
        }
        else {
            pass(details);
        }
    }

    public static void fail(String details) {
        ExtentManager.getExtentTest().fail(details);
    }

    public static void fail(String details, boolean isScreenShotNeeded) {
        if(isScreenShotNeeded) {
            ExtentManager.getExtentTest().fail(details, MediaEntityBuilder.createScreenCaptureFromBase64String(TestUtils.getBase64Image()).build());
        }
        else {
            fail(details);
        }
    }
    public static void skip(String details) {
        ExtentManager.getExtentTest().skip(details);
    }
    public static void info(String details) {
        ExtentManager.getExtentTest().info(details);
    }
}
