package com.selenium.pages;

import com.selenium.enums.WaitStrategy;
import com.selenium.utils.DecodeUtils;
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
        sendText(textboxUsername, username, WaitStrategy.PRESENCE);
        return this;
    }

    public OrangeHrmLoginPage enterPassword(String password) {
        sendText(textboxPassword, DecodeUtils.getDecodedString(password), WaitStrategy.PRESENCE);
        return this;
    }

    public OrangeHrmHomePage clickLogin() {
        click(buttonLogin, WaitStrategy.CLICKABLE, "login");
        return new OrangeHrmHomePage();
    }

    public String getTitle() {
        return getTitleText();
    }
}
