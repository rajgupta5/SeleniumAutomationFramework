package com.selenium.constants;

public final class FrameworkConstants {

    private FrameworkConstants() {

    }

    private static final String USERDIRPATH = System.getProperty("user.dir");
    private static final String CHROMEDRIVERPATH = USERDIRPATH + "\\src\\test\\resources\\executables\\chromedriver.exe";
    private static final String CONFIGFILEPATH = USERDIRPATH +"\\src\\test\\resources\\config\\framework.properties";
    private static final String JSONCONFIGFILEPATH = USERDIRPATH +"\\src\\test\\resources\\config\\config.json";
    private static final Integer EXPLICITWAIT = 10;

    public static String getJSONCONFIGFILEPATH() {
        return JSONCONFIGFILEPATH;
    }

    public static Integer getEXPLICITWAIT() {
        return EXPLICITWAIT;
    }

    public static String getCHROMEDRIVERPATH() {
        return CHROMEDRIVERPATH;
    }

    public static String getCONFIGFILEPATH() {
        return CONFIGFILEPATH;
    }
}
