package com.selenium.tests;

import com.selenium.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public final class LoginPageTest extends BaseTest {

    private LoginPageTest() {

    }

    @Test
    public void test() {
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);

    }
}
