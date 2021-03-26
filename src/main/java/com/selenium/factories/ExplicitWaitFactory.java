package com.selenium.factories;

import com.selenium.constants.FrameworkConstants;
import com.selenium.driver.DriverManager;
import com.selenium.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class ExplicitWaitFactory {

    private ExplicitWaitFactory() {

    }

    public static WebElement performExplicitWait(WaitStrategy waitStrategy, By by) {

        if(waitStrategy == WaitStrategy.CLICKABLE) {
            return new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getEXPLICITWAIT())
                    .until(ExpectedConditions.elementToBeClickable(by));
        }

        else if(waitStrategy == WaitStrategy.PRESENCE) {
            return new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getEXPLICITWAIT())
                    .until(ExpectedConditions.presenceOfElementLocated(by));
        }
        else if(waitStrategy == WaitStrategy.VISIBLE) {
            return new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getEXPLICITWAIT())
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
        }
        else if(waitStrategy == WaitStrategy.NONE) {
            System.out.println("Not doing anything");
            return null;
        }
        return null;
    }
}
