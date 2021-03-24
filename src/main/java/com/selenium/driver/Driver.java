package com.selenium.driver;

import com.selenium.constants.FrameworkConstants;
import com.selenium.enums.ConfigProperties;
import com.selenium.utilities.PropertyUtil;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public final class Driver {

     private Driver() {

     }

    public static void initDriver() throws Exception {
        if(Objects.isNull(DriverManager.getDriver())) {
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getCHROMEDRIVERPATH());
            DriverManager.setDriver(new ChromeDriver());
            DriverManager.getDriver().get(PropertyUtil.get(ConfigProperties.URL));
        }
    }

    public static void quitDriver() {
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
