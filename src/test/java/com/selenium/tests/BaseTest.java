package com.selenium.tests;

import com.selenium.driver.Driver;
import com.selenium.reports.ExtentReport;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;


public class BaseTest {

    protected BaseTest() {

    }

//    @BeforeSuite
//    public void beforeSuite() {
//
//    }
//
//    @AfterSuite
//    public void afterSuite() throws IOException {
//
//    }

    @BeforeMethod
    protected void setUp(Object[] data) throws Exception {
        Map<String, String> map = (Map<String, String>)data[0];
        Driver.initDriver(map.get("browser"), map.get("version"));

    }

    @AfterMethod
    protected void tearDown() throws InterruptedException  {
        Driver.quitDriver();
    }
}
