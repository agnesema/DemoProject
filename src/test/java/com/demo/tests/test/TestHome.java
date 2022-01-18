package com.demo.tests.test;

import com.demo.base.BaseTest;
import com.demo.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHome extends BaseTest {

    HomePage homePage;

    @Test
    public void TC001() throws IOException, InterruptedException {
        homePage = new HomePage(driver);
        homePage.fillTheForm();
        Thread.sleep(2000);
        Assert.assertEquals(homePage.getText(), "×\n" +
                "Success! The Form has been submitted successfully!.", "Test not passed");
        System.out.println(homePage.getText());

    }
}
