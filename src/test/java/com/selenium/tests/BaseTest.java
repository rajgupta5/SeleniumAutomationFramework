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
    protected void setUp() throws Exception {
        Driver.initDriver();

    }

    @AfterMethod
    protected void tearDown() throws InterruptedException  {
        Driver.quitDriver();
    }
}
