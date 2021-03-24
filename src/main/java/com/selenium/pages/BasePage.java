package com.selenium.pages;

import com.selenium.driver.DriverManager;
import com.selenium.factories.ExplicitWaitFactory;
import com.selenium.enums.WaitStrategy;
import com.selenium.reports.ExtentLogger;
import org.openqa.selenium.By;

public class BasePage {

    protected void click(By by, WaitStrategy waitStrategy, String elementName) {
        ExplicitWaitFactory.performExplicitWait(waitStrategy, by).click();
        ExtentLogger.pass(elementName + " is clicked", true);
    }

    protected void sendText(By by, String text, WaitStrategy waitStrategy) {
        ExplicitWaitFactory.performExplicitWait(waitStrategy, by).sendKeys(text);
        ExtentLogger.pass(text + " is entered", true);
    }

    protected String getTitleText() {
        return DriverManager.getDriver().getTitle();
    }
}
