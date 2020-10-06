package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_01_Login extends BaseClass {

@Test
public void login() {
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	lp.setPassWord(password);
	lp.clickOnLoginButton();
	Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
}
}
