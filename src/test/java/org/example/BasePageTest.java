package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.example.FrameworkConstants.getCHROMEDRIVERPATH;

public class BasePageTest {



    protected BasePageTest() {

    }

    @BeforeMethod
    public void setUp() {
        Driver.initDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException  {
        Driver.quitDriver();
    }
}
