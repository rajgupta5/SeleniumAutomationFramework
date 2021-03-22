package org.example.driver;

import org.example.enums.ConfigProperties;
import org.example.utilities.JsonUtil;
import org.example.utilities.PropertyUtil;
import org.openqa.selenium.chrome.ChromeDriver;

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
