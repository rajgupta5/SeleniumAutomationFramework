package org.example.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {

    private static Properties properties = new Properties();

    private ReadPropertyFile() {

    }

    static {
        String filepath = System.getProperty("user.dir")+"\\src\\test\\resources\\config\\framework.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(filepath);
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key) throws Exception {
        String value="";

        value = (String) properties.get(key);
        if(Objects.isNull(value)) {
            throw new Exception("Property name " + key + " is not found. Please framework.properties");
        }
        return value;
    }

}
