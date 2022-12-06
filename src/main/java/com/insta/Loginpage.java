package com.insta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement LogIn;
	
	@FindBy(xpath = "//a[normalize-space()='Forgotten password?']")
	WebElement ForgotPassword;
	WebDriver driver;
	
	
	
	
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void setUserName(String username) {
		email.clear();
		email.sendKeys(username);
	}
	public void setPassword(String pass) {
		password.clear();
		password.sendKeys(pass);
	}
	public void login () {
		LogIn.click();
	}
	public void textforgotpassword() {
		String forgot=ForgotPassword.getText();
		System.out.println(forgot);
	}
	public void clickForgotPassword() {
	ForgotPassword.click();
	}
	
	
	
	
	
	
	
	
	}

