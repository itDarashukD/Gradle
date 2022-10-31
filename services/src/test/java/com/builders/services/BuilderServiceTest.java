package com.builders.services;

import com.builders.utils.BuildersUtil;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BuilderServiceTest {

    @Test
    public void testHello() {
        InputStream stream = BuildersUtil.class.getClassLoader().getResourceAsStream("service_config_test.properties");
        Properties properties = new Properties();
        try {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
         assertNotNull(properties.getProperty("test_hello"));
    }

}