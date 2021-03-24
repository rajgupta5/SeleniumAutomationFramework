package com.selenium.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.selenium.enums.ConfigProperties;
import com.selenium.utils.PropertyUtil;
import com.selenium.utils.TestUtils;
import lombok.SneakyThrows;

public final class ExtentLogger {

    private ExtentLogger() {

    }

    public static void pass(String details) {
        ExtentManager.getExtentTest().pass(details);
    }

    @SneakyThrows
    public static void pass(String details, boolean isScreenShotNeeded) {
        if(PropertyUtil.get(ConfigProperties.PASSEDSTEPSSCREENSHOT).equalsIgnoreCase("yes") &&
                isScreenShotNeeded) {
            ExtentManager.getExtentTest().pass(details, MediaEntityBuilder.createScreenCaptureFromBase64String(TestUtils.getBase64Image()).build());
        }
        else {
            pass(details);
        }
    }

    public static void fail(String details) {
        ExtentManager.getExtentTest().fail(details);
    }

    @SneakyThrows
    public static void fail(String details, boolean isScreenShotNeeded) {
        if(PropertyUtil.get(ConfigProperties.FAILEDSTEPSSCREENSHOT).equalsIgnoreCase("yes") &&
                isScreenShotNeeded) {
            ExtentManager.getExtentTest().fail(details, MediaEntityBuilder.createScreenCaptureFromBase64String(TestUtils.getBase64Image()).build());
        }
        else {
            fail(details);
        }
    }
    public static void skip(String details) {
        ExtentManager.getExtentTest().skip(details);
    }

    @SneakyThrows
    public static void skip(String details, boolean isScreenShotNeeded) {

        if(PropertyUtil.get(ConfigProperties.SKIPPEDSTEPSSCREENSHOT).equalsIgnoreCase("yes") &&
                isScreenShotNeeded) {
            ExtentManager.getExtentTest().skip(details, MediaEntityBuilder.createScreenCaptureFromBase64String(TestUtils.getBase64Image()).build());
        }
        else {
            skip(details);
        }
    }


    public static void info(String details) {
        ExtentManager.getExtentTest().info(details);
    }
}
