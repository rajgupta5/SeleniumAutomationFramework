package org.example.tests;

import org.example.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;


public class BasePageTest {

    protected BasePageTest() {

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
