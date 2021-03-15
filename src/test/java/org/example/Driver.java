package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

import static org.example.FrameworkConstants.getCHROMEDRIVERPATH;

public class Driver {

    static WebDriver driver;

    public static void initDriver() {
        if(Objects.isNull(driver)) {
            System.setProperty("webdriver.chrome.driver", getCHROMEDRIVERPATH());
            driver = new ChromeDriver();
            driver.get("https://www.google.com");
        }
    }

    public static void quitDriver() {
        if(Objects.nonNull(driver)) {
            driver.quit();
            driver=null;
        }
    }
}
