package com.orangehrm.demo.opensource.testsuite;

import com.orangehrm.demo.opensource.pages.ForgotPasswordPage;
import com.orangehrm.demo.opensource.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {

    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        forgotPasswordPage.clickOnForgotPasswordLink();
        String expectedMessage = "Reset Password";
        Assert.assertEquals(forgotPasswordPage.textVerify(), expectedMessage, "No Reset Password text found");

    }
}
