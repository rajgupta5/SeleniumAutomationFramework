package com.selenium.pages;

import com.selenium.enums.WaitStrategy;
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
        click(lnkWelcome, WaitStrategy.PRESENCE, "welcome");
        return this;
    }

    public OrangeHrmLoginPage clickLogout() {
//        Thread.sleep(1000);
//        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);

//        wait.until(d->d.findElement(lnk_logout).isEnabled());
        click(lnkLogout, WaitStrategy.CLICKABLE, "logout");
        return new OrangeHrmLoginPage();
    }
}
