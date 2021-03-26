package com.selenium.tests;

import com.selenium.pages.AmazonHomePage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.Map;


public final class AmazonDemoTest extends BaseTest{

	/**
	 * Private constructor to avoid external instantiation
	 */
	private AmazonDemoTest() {}


	@Test
	public void amazonTest(Map<String,String> data) {
		String title =new AmazonHomePage().clickHamburger()
				.clickComputer()
				.clickOnSubMenuItem(data.get("menutext")).getTitle();
		Assertions.assertThat(title).isNotNull();	
	}

	
}
