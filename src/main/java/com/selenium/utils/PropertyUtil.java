package com.selenium.utils;

import com.selenium.constants.FrameworkConstants;
import com.selenium.enums.ConfigProperties;
import com.selenium.exceptions.InvalidPathForExcelException;
import com.selenium.exceptions.InvalidPathForPropertyFileException;
import com.selenium.exceptions.PropertyFileUsageException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
        try( FileInputStream fileInputStream = new FileInputStream(FrameworkConstants.getCONFIGFILEPATH())) {
            properties.load(fileInputStream);
            for(Map.Entry<Object, Object> entry : properties.entrySet()) {
                CONFIGMAP.put(entry.getKey().toString(), entry.getValue().toString().trim());
            }
        }
        catch (FileNotFoundException e) {
            throw new InvalidPathForPropertyFileException("Config File you trying to read is not found");
        }
        catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static String get(ConfigProperties key)  {
        if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
            throw new PropertyFileUsageException("Property name " + key + " is not found. Please check config.properties");
        }
        return CONFIGMAP.get(key.name().toLowerCase());
    }

    public static String getValue(String key)  {
        if(Objects.isNull(properties.get(key))  || Objects.isNull(key)) {
            throw new PropertyFileUsageException("Property name " + key + " is not found. Please check config.properties");
        }
        return properties.get(key).toString();
    }

}
