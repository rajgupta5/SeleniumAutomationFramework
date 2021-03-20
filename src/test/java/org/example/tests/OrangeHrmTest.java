package org.example.tests;

import org.assertj.core.api.Assertions;
import org.example.driver.DriverManager;
import org.example.pages.OrangeHrmHomePage;
import org.example.pages.OrangeHrmLoginPage;
import org.testng.annotations.Test;

public final class OrangeHrmTest extends BaseTest {

    private OrangeHrmTest() {

    }


    @Test
    public void LoginLogoutTest() {
        DriverManager.getDriver().manage().window().maximize();
        OrangeHrmLoginPage ohrmp = new OrangeHrmLoginPage();
        OrangeHrmLoginPage ohrml = ohrmp.enterUsername("Admin").enterPassword("admin123").clickLogin().clickWelcome().clickLogout();
        Assertions.assertThat(ohrml.getTitle())
                .isEqualTo("OrangeHRM");


    }

}
