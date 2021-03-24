package com.selenium.tests;

import com.selenium.driver.Driver;
import com.selenium.reports.ExtentReport;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;


public class BaseTest {

    protected BaseTest() {

    }

    @BeforeSuite
    public void beforeSuite() {
        ExtentReport.initReports();
    }

    @AfterSuite
    public void afterSuite() throws IOException {
        ExtentReport.flushReports();
    }

    @BeforeMethod
    protected void setUp() throws Exception {
        Driver.initDriver();

    }

    @AfterMethod
    protected void tearDown() throws InterruptedException  {
        Driver.quitDriver();
    }
}
