package org.example.constants;

public final class FrameworkConstants {

    private static final String CHROMEDRIVERPATH = System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe";

    public static String getCHROMEDRIVERPATH() {
        return CHROMEDRIVERPATH;
    }
}
