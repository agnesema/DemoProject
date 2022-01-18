package com.demo.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

import static com.demo.TestDataReader.*;

public class BaseTest {

    public WebDriver driver;
   // DesiredCapabilities dc;

    @BeforeMethod
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

        //String browser = getBrowser();
        String baseUrl = getUrl();

        //String nodeUrl = getNode();


        //dc = new DesiredCapabilities();
        //dc.setPlatform(Platform.WINDOWS);
        //dc.setBrowserName(browser);
        //driver = new RemoteWebDriver(new URL(nodeUrl), dc);
        //driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() {
        //driver.close();
    }


}
