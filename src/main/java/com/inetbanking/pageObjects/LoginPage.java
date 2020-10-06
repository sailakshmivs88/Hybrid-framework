package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver ldriver;

public LoginPage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}

@FindBy(id="Email")
WebElement txtusername;

@FindBy(id="Password")
WebElement txtpassword;

@FindBy(css="[value=\"Log in\"]")
WebElement loginbutton;


public void setUserName(String uname) {
	txtusername.clear();
	txtusername.sendKeys(uname);
}
public void setPassWord(String password) {
	txtpassword.clear();
	txtpassword.sendKeys(password);
}

public void clickOnLoginButton() {
	loginbutton.click();
}
}

