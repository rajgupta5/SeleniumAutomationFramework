package org.example.pages;

import org.example.driver.DriverManager;
import org.example.enums.WaitStrategy;
import org.example.factories.ExplicitWaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.example.constants.FrameworkConstants.getEXPLICITWAIT;

public class BasePage {

    protected void click(By by, WaitStrategy waitStrategy) {
        ExplicitWaitFactory.performExplicitWait(waitStrategy, by).click();
    }

    protected void sendText(By by, String text, WaitStrategy waitStrategy) {
        ExplicitWaitFactory.performExplicitWait(waitStrategy, by).sendKeys(text);
    }

    protected String getTitleText() {
        return DriverManager.getDriver().getTitle();
    }
}
