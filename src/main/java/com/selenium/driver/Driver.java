package com.selenium.driver;

import com.selenium.enums.ConfigProperties;
import com.selenium.exceptions.BrowserInvocationFailedException;
import com.selenium.factories.DriverFactory;
import com.selenium.utils.PropertyUtil;

import java.net.MalformedURLException;
import java.util.Objects;

public final class Driver {

     private Driver() {

     }

    public static void initDriver(String browser,String version)  {
        if(Objects.isNull(DriverManager.getDriver())) {
            try {
                DriverManager.setDriver(DriverFactory.getDriver(browser,version));

            } catch (MalformedURLException e) {
                throw new BrowserInvocationFailedException("Please check the capabilities of browser");
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
