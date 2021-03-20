package org.example.driver;

import org.example.utilities.ReadPropertyFile;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Objects;

import static org.example.constants.FrameworkConstants.getCHROMEDRIVERPATH;
import static org.example.driver.DriverManager.getDriver;

public final class Driver {

     private Driver() {

     }

    public static void initDriver() throws Exception {
        if(Objects.isNull(getDriver())) {
            System.setProperty("webdriver.chrome.driver", getCHROMEDRIVERPATH());
            DriverManager.setDriver(new ChromeDriver());
            DriverManager.getDriver().get(ReadPropertyFile.get("url"));
        }
    }

    public static void quitDriver() {
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
