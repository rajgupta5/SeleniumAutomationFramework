package org.example.pages;

import org.example.driver.DriverManager;
import org.example.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        return this;
    }

    public OrangeHrmLoginPage clickLogout() {
//        Thread.sleep(1000);
//        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);

//        wait.until(d->d.findElement(lnk_logout).isEnabled());
        click(lnkLogout, WaitStrategy.CLICKABLE);
        return new OrangeHrmLoginPage();
    }
}
