package com.selenium.utilities;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.selenium.constants.FrameworkConstants;
import com.selenium.enums.ConfigProperties;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class JsonUtil {

    private static Map<String, String> CONFIGMAP = new HashMap<>();

    private JsonUtil() {

    }

    static {
        try {
            CONFIGMAP = new ObjectMapper().readValue(new File(FrameworkConstants.getJSONCONFIGFILEPATH()),
                    new TypeReference<HashMap<String, String>>() {});

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
}
