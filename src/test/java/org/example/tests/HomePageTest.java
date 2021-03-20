package org.example.tests;

import org.example.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public final class HomePageTest extends BaseTest {

    private HomePageTest() {

    }

    @Test
    public void test() {
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing Mini Bytes - Youtube", Keys.ENTER);
        String title = DriverManager.getDriver().getTitle();

        assertThat(title)
                .hasSizeBetween(15,100)
                .isNotEmpty()
                .contains("Testing")
                .startsWith("Testing")
                .as("Object is null").isNotNull();


//        Assert.assertTrue(Objects.nonNull(title));
//        Assert.assertTrue(title.toLowerCase().contains("google search"));
//        Assert.assertTrue(title.length()>15);
//        Assert.assertTrue(title.length()<100);


        List<WebElement> elements = DriverManager.getDriver().findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"));

        assertThat(elements)
                .hasSize(7)
                .extracting(WebElement :: getText)
                .contains("Testing Mini Bytes - Youtube");

//        Assert.assertEquals(elements.size(), 7);

//        boolean isElementPresent = false;
//        for(WebElement element: elements ) {
//            if(element.getText().equalsIgnoreCase("Testing Mini Bytes - Youtube")) {
//                isElementPresent = true;
//            }
//        }
//        Assert.assertTrue(isElementPresent, "Testing Mini Bytes not found");

    }
}
