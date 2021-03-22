package org.example.factories;

import org.example.driver.DriverManager;
import org.example.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.example.constants.FrameworkConstants.getEXPLICITWAIT;

public class ExplicitWaitFactory {

    public static WebElement performExplicitWait(WaitStrategy waitStrategy, By by) {

        if(waitStrategy == WaitStrategy.CLICKABLE) {
            return new WebDriverWait(DriverManager.getDriver(), getEXPLICITWAIT())
                    .until(ExpectedConditions.elementToBeClickable(by));
        }

        else if(waitStrategy == WaitStrategy.PRESENCE) {
            return new WebDriverWait(DriverManager.getDriver(), getEXPLICITWAIT())
                    .until(ExpectedConditions.presenceOfElementLocated(by));
        }
        else if(waitStrategy == WaitStrategy.VISIBLE) {
            return new WebDriverWait(DriverManager.getDriver(), getEXPLICITWAIT())
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
        }
        else if(waitStrategy == WaitStrategy.NONE) {
            System.out.println("Not doing anything");
            return null;
        }
        return null;
    }
}
