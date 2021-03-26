package com.selenium.tests;

import com.selenium.annotations.FrameworkAnnotation;
import com.selenium.driver.DriverManager;
import com.selenium.enums.CategoryType;
import com.selenium.listeners.RetryFailedTests;
import com.selenium.utils.DataProviderUtils;
import org.assertj.core.api.Assertions;
import com.selenium.pages.OrangeHrmLoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Map;

public final class OrangeHrmTest extends BaseTest {

    private OrangeHrmTest() {
    }


    @Test
    @FrameworkAnnotation(author= {"Raj"},
            category = {CategoryType.REGRESSION})
    public void LoginLogoutTest(Map<String, String> data) {
        DriverManager.getDriver().manage().window().maximize();
        OrangeHrmLoginPage ohrmp = new OrangeHrmLoginPage();
        OrangeHrmLoginPage ohrml = ohrmp.enterUsername(data.get("username")).enterPassword(data.get("password")).clickLogin().clickWelcome().clickLogout();
        Assertions.assertThat(ohrml.getTitle())
                .isEqualTo("OrangeHRM");
    }

    @Test
    public void newTest(Map<String, String> data) {
        DriverManager.getDriver().manage().window().maximize();
        OrangeHrmLoginPage ohrmp = new OrangeHrmLoginPage();
        OrangeHrmLoginPage ohrml = ohrmp.enterUsername(data.get("username")).enterPassword(data.get("password")).clickLogin().clickWelcome().clickLogout();
        Assertions.assertThat(ohrml.getTitle())
                .isEqualTo("OrangeHRM");
    }

//    @DataProvider(name = "LoginTestDataProvider", parallel = true)
//    public Object[][] getData() {
//        return new Object[][] {
//                {"Admin", "admin123"},
//                {"Admin", "admin123"},
//                {"Admin123", "admin1234"},
//                {"Admin123", "admin1235"},
//                {"Admin123", "admin1236"}
//        };
//
//    }

}
