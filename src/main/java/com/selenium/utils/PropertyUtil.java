package com.selenium.utils;

import com.selenium.constants.FrameworkConstants;
import com.selenium.enums.ConfigProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class PropertyUtil {

    private static Properties properties = new Properties();
    private static final Map<String, String> CONFIGMAP = new HashMap<>();
    private PropertyUtil() {

    }

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream(FrameworkConstants.getCONFIGFILEPATH());
            properties.load(fileInputStream);

            for(Map.Entry<Object, Object> entry : properties.entrySet()) {
                CONFIGMAP.put(entry.getKey().toString(), entry.getValue().toString().trim());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(ConfigProperties key) throws Exception {
        if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
            throw new Exception("Property name " + key + " is not found. Please framework.properties");
        }
        return CONFIGMAP.get(key.name().toLowerCase());
    }

    public static String getValue(String key) throws Exception {
        if(Objects.isNull(properties.get(key))  || Objects.isNull(key)) {
            throw new Exception("Property name " + key + " is not found. Please framework.properties");
        }
        return properties.get(key).toString();
    }

}
