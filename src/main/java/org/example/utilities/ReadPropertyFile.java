package org.example.utilities;

import org.example.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {

    private static Properties properties = new Properties();
    private static final Map<String, String> CONFIGMAP = new HashMap<>();
    private ReadPropertyFile() {

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

    public static String get(String key) throws Exception {
        if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key))) {
            throw new Exception("Property name " + key + " is not found. Please framework.properties");
        }
        return CONFIGMAP.get(key);
    }

    public static String getValue(String key) throws Exception {
        if(Objects.isNull(properties.get(key))  || Objects.isNull(key)) {
            throw new Exception("Property name " + key + " is not found. Please framework.properties");
        }
        return properties.get(key).toString();
    }

}
