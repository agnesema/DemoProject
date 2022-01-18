package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static com.demo.TestDataReader.*;

public class HomePage {

    WebDriver driver;

    String username = getUsername();
    String email = getEmail();
    String password = getPassword();
    String gender = getGender();
    String DOB = getDOB();

    public HomePage (WebDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='name']")
    WebElement nameField;

    @FindBy(xpath = "//input[@name='email']")
    WebElement emailField;

    @FindBy(id = "exampleInputPassword1")
    WebElement passwordField;

    @FindBy(id = "exampleCheck1")
    WebElement checkBox;

    @FindBy(id = "exampleFormControlSelect1")
    WebElement genderSelect;

    @FindBy(id = "inlineRadio1")
    WebElement studentButton;

    @FindBy(xpath = "//input[@type='date']")
    WebElement dateOfBirth;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitButton;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement text;


    public void fillTheForm() {
        nameField.sendKeys(username);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        checkBox.click();
        Select gender = new Select (genderSelect);
        gender.selectByVisibleText("Female");
        studentButton.click();
        dateOfBirth.sendKeys(DOB);
        submitButton.click();
         }

         public String getText() {
        return text.getText();
         }
}
