package com.selenium.constants;

import com.selenium.enums.ConfigProperties;
import com.selenium.utils.PropertyUtil;

public final class FrameworkConstants {

    private FrameworkConstants() {

    }

    private static final String USERDIRPATH = System.getProperty("user.dir");
    private static final String CHROMEDRIVERPATH = USERDIRPATH + "\\src\\test\\resources\\executables\\chromedriver.exe";
    private static final String GECKODRIVERPATH = USERDIRPATH + "\\src\\test\\resources\\executables\\geckodriver.exe";
    private static final String CONFIGFILEPATH = USERDIRPATH +"\\src\\test\\resources\\config\\framework.properties";
    private static final String JSONCONFIGFILEPATH = USERDIRPATH +"\\src\\test\\resources\\config\\config.json";
    private static final String EXTENTREPORTFOLDERPATH = USERDIRPATH+"\\extent-test-output";
    private static final String EXCELPATH = USERDIRPATH+"\\src\\test\\resources\\excel\\testdata.xlsx";
    private static final String RUNMANGERSHEET = "RUNMANAGER";
    private static final String ITERATIONDATASHEET = "DATA";
    private static String EXTENTREPORTFILEPATH = "";
    private static final Integer EXPLICITWAIT = 10;

    public static String getGECKODRIVERPATH() {
        return GECKODRIVERPATH;
    }

    public static String getITERATIONDATASHEET() {
        return ITERATIONDATASHEET;
    }

    public static String getRUNMANGERSHEET() {
        return RUNMANGERSHEET;
    }

    public static String getEXCELPATH() {
        return EXCELPATH;
    }

    public static String getEXTENTREPORTFILEPATH() {
        if(EXTENTREPORTFILEPATH.isEmpty()) {
            EXTENTREPORTFILEPATH = EXTENTREPORTFOLDERPATH + createExtentFilePath();
        }
        return EXTENTREPORTFILEPATH;
    }

    private static String createExtentFilePath() {
            if(PropertyUtil.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("yes")) {
                return "/" + System.currentTimeMillis() + "index.html";
            }
            else {
                return "/index.html";
            }
    }

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
