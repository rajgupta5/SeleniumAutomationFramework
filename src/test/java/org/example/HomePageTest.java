package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class HomePageTest extends BasePageTest {


    @Test
    public void test() {
        Driver.driver.findElement(By.name("q")).sendKeys("Facebook", Keys.ENTER);

    }
}
