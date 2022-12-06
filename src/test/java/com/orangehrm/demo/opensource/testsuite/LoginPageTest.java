package com.orangehrm.demo.opensource.testsuite;

import com.orangehrm.demo.opensource.pages.LoginPage;
import com.orangehrm.demo.opensource.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    /**
     * Dry Test Run
     *
     * @Test public void test(){
     * System.out.println("OrangeHRM");
     * }
     */
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Dashboard";
        Assert.assertEquals(loginPage.getTextMessage(), expectedMessage, "No Dashboard text found");

    }
}
