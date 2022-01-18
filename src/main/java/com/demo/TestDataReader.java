package com.demo;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestDataReader {

    static Properties properties;
    public static Properties getTestData() throws IOException {
        //FileInputStream fp = new FileInputStream("/testdata.properties");
        //Properties properties = new Properties();
        //properties.load(fp);
        if (properties == null) {
            InputStream stream = TestDataReader.class.getResourceAsStream("/testdata.properties");
            properties = new Properties();
            properties.load(stream);
        }
        return properties;
    }

    public static String getUrl() throws IOException {
        return getTestData().getProperty("baseUrl");
    }

    public static String getNode() throws IOException {
        return getTestData().getProperty("nodeUrl");
    }

    public static String getBrowser() throws IOException {
        return getTestData().getProperty("browser");
    }

    public static String getUsername() throws IOException {
        return getTestData().getProperty("username");
    }

    public static String getEmail() throws IOException {
        return getTestData().getProperty("email");

    }

    public static String getPassword() throws IOException {
        return getTestData().getProperty("password");
    }

    public static String getDOB() throws IOException {
        return getTestData().getProperty("DOB");
    }

    public static String getGender() throws IOException {
        return getTestData().getProperty("gender");
    }
}
