package com.selenium.driver;

import com.selenium.constants.FrameworkConstants;
import com.selenium.enums.ConfigProperties;
import com.selenium.utils.PropertyUtil;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;

public final class Driver {

     private Driver() {

     }

    public static void initDriver(String browser) throws Exception {
        if(Objects.isNull(DriverManager.getDriver())) {
            if(browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", FrameworkConstants.getCHROMEDRIVERPATH());
                DriverManager.setDriver(new ChromeDriver());
            }
            else if(browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", FrameworkConstants.getGECKODRIVERPATH());
                DriverManager.setDriver(new FirefoxDriver());
            }
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
