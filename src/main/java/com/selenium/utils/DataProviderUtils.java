package com.selenium.utils;


import com.selenium.constants.FrameworkConstants;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public final class DataProviderUtils {

	private DataProviderUtils() {}
	
	private static List<Map<String, String>> list =	new ArrayList<>();
	

	@DataProvider(parallel=true)
	public static Object[] getData(Method m) {
		String testname = m.getName();
		if(list.isEmpty()) {
			list = ExcelUtils.getTestDetails(FrameworkConstants.getITERATIONDATASHEET());
			System.out.println(list);
		}
		
		List<Map<String, String>> smalllist = new ArrayList<>();
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).get("testname").equalsIgnoreCase(testname) &&  
					list.get(i).get("execute").equalsIgnoreCase("yes")) {
						smalllist.add(list.get(i));
			}
		}
		System.out.println(smalllist);
		return smalllist.toArray();
		
	}
	
}
