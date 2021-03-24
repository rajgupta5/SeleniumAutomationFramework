package com.selenium.tests;

import com.selenium.driver.DriverManager;
import org.assertj.core.api.Assertions;
import com.selenium.pages.OrangeHrmLoginPage;
import com.selenium.reports.ExtentReport;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public final class OrangeHrmTest extends BaseTest {

    private OrangeHrmTest() {

    }




    @Test(dataProvider = "LoginTestDataProvider")
    public void LoginLogoutTest(String username, String password) {
        ExtentReport.createTest("loginlogouttest");
        DriverManager.getDriver().manage().window().maximize();
        OrangeHrmLoginPage ohrmp = new OrangeHrmLoginPage();
        OrangeHrmLoginPage ohrml = ohrmp.enterUsername(username).enterPassword(password).clickLogin().clickWelcome().clickLogout();
        Assertions.assertThat(ohrml.getTitle())
                .isEqualTo("OrangeHRM");
    }

    @DataProvider(name = "LoginTestDataProvider", parallel = true)
    public Object[][] getData() {
        return new Object[][] {
                {"Admin", "admin123"},
                {"Admin", "admin123"},
//                {"Admin123", "admin1234"},
//                {"Admin123", "admin1235"},
//                {"Admin123", "admin1236"}
        };

    }

}
