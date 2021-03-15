package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.example.FrameworkConstants.getCHROMEDRIVERPATH;

public class LoginPageTest extends BasePageTest {

    @Test
    public void test() {
        Driver.driver.findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);

    }

    @Test
    public void test1() {
        Driver.driver.findElement(By.name("q")).sendKeys("Testing Mini Bytes", Keys.ENTER);
    }
}
