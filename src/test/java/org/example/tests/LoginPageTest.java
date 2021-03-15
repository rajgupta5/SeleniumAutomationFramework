package org.example.tests;

import org.example.driver.DriverManager;
import org.example.tests.BasePageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public final class LoginPageTest extends BasePageTest {

    private LoginPageTest() {

    }

    @Test
    public void test() {
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);

    }
}
