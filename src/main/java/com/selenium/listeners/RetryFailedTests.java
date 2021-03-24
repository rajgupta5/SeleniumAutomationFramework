package com.selenium.listeners;


import com.selenium.enums.ConfigProperties;
import lombok.SneakyThrows;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import com.selenium.utils.PropertyUtil;
import org.testng.internal.PropertyUtils;


public class RetryFailedTests implements IRetryAnalyzer {

	private int count=0;
	private int retries = 1;
	/**
	 * Return true when needs to be retried and false otherwise.
	 * Maximum will retry for one time.
	 * Retry will happen if user desires to and set the value in the property file
	 */
	@SneakyThrows
	@Override
	public boolean retry(ITestResult result) {
		boolean value =false;

		if(PropertyUtil.get(ConfigProperties.RETRYFAILEDTESTS).equalsIgnoreCase("yes")) {
			value = count<retries ;
			count++;
		} 
		return value;
	}

}
