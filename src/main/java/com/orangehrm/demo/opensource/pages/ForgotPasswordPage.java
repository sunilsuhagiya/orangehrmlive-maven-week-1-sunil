package com.orangehrm.demo.opensource.pages;

import com.orangehrm.demo.opensource.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {

    By forgotPasswordLink = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
    By verifyText = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']");

    public void clickOnForgotPasswordLink() {
        clickOnElement(forgotPasswordLink);
    }

    public String textVerify() {
        return getTextFromElement(verifyText);
    }

}
