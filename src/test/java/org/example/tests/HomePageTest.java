package org.example.tests;

import org.example.driver.DriverManager;
import org.example.tests.BasePageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public final class HomePageTest extends BasePageTest {

    private HomePageTest() {

    }

    @Test
    public void test() {
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Facebook", Keys.ENTER);

    }
}
