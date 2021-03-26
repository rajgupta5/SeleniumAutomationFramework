package com.selenium.tests;

import com.selenium.annotations.FrameworkAnnotation;
import com.selenium.enums.CategoryType;
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
	@FrameworkAnnotation(author= {"Raj","Diggy"},
			category = {CategoryType.REGRESSION,CategoryType.MINIREGRESSION})
	public void amazonTest(Map<String,String> data) {
		String title =new AmazonHomePage().clickHamburger()
				.clickComputer()
				.clickOnSubMenuItem(data.get("menutext")).getTitle();
		Assertions.assertThat(title).isNotNull();	
	}

	
}
