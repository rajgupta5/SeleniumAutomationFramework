package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.By;

public final class OrangeHrmLoginPage extends BasePage {

    /*id
     name
     classname
     linktext
     partiallinktext
     css or xpath
     */

    private final By textboxUsername = By.id("txtUsername");
    private final By textboxPassword = By.xpath("//input[@id='txtPassword' and @type='password']");
    private final By buttonLogin = By.id("btnLogin");

    public OrangeHrmLoginPage enterUsername(String username) {
        sendText(textboxUsername, username, "Present");
        return this;
    }

    public OrangeHrmLoginPage enterPassword(String password) {
        sendText(textboxPassword, password, "Present");
        return this;
    }

    public OrangeHrmHomePage clickLogin() {
        click(buttonLogin, "Clickable");
        return new OrangeHrmHomePage();
    }

    public String getTitle() {
        return getTitleText();
    }
}
