package com.selenium.pages;

import com.selenium.driver.DriverManager;
import com.selenium.factories.ExplicitWaitFactory;
import com.selenium.enums.WaitStrategy;
import org.openqa.selenium.By;

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
