package com.selenium.pages;

import com.selenium.enums.WaitStrategy;
import com.selenium.reports.ExtentManager;
import org.openqa.selenium.By;

public final class OrangeHrmHomePage extends BasePage {

    OrangeHrmHomePage() {

    }

     /*id
     name
     classname
     linktext
     partiallinktext
     css or xpath
     */

    private final By lnkWelcome = By.id("welcome");
    private final By lnkLogout = By.xpath("//a[text()='Logout']");

    public OrangeHrmHomePage clickWelcome() {
        click(lnkWelcome, WaitStrategy.PRESENCE);
        ExtentManager.getExtentTest().pass("welcome clicked");
        return this;
    }

    public OrangeHrmLoginPage clickLogout() {
//        Thread.sleep(1000);
//        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);

//        wait.until(d->d.findElement(lnk_logout).isEnabled());
        click(lnkLogout, WaitStrategy.CLICKABLE);
        ExtentManager.getExtentTest().pass("logout button clicked");
        return new OrangeHrmLoginPage();
    }
}
