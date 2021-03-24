package com.selenium.utils;


import com.selenium.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.Base64;

public final class TestUtils {
	
	private TestUtils() {
		
	}
	
	public static  String getBase64Image() {
		return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
	}
	
	public static String decrpt(String encryptedstring) {
		return new String(Base64.getDecoder().decode(encryptedstring));
		
	}

}
