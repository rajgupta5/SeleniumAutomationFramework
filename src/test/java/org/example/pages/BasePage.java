package org.example.pages;

import org.example.constants.FrameworkConstants;
import org.example.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.example.constants.FrameworkConstants.getEXPLICITWAIT;

public class BasePage {

    protected void click(By by, String waitStrategy) {
        if(waitStrategy.equalsIgnoreCase("Clickable")) {
            explicitlyWaitForElementTobeClickable(by);
        }

        if(waitStrategy.equalsIgnoreCase("Present")) {
            explicitlyWaitForElementTobePresent(by);
        }

        DriverManager.getDriver().findElement(by).click();
    }

    protected void sendText(By by, String text, String waitStrategy) {
        if(waitStrategy.equalsIgnoreCase("Clickable")) {
            explicitlyWaitForElementTobeClickable(by);
        }

        if(waitStrategy.equalsIgnoreCase("Present")) {
            explicitlyWaitForElementTobePresent(by);
        }
        DriverManager.getDriver().findElement(by).sendKeys(text);
    }

    protected String getTitleText() {
        return DriverManager.getDriver().getTitle();
    }

    private void explicitlyWaitForElementTobeClickable(By by) {
        new WebDriverWait(DriverManager.getDriver(), getEXPLICITWAIT())
                .until(ExpectedConditions.elementToBeClickable(by));
    }

    private void explicitlyWaitForElementTobePresent(By by) {
        new WebDriverWait(DriverManager.getDriver(), getEXPLICITWAIT())
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
