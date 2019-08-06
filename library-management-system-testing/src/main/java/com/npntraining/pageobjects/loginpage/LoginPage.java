/*
 * Created on Jul 28, 2019 by NPN
 *
 * Copyright (c) 2019 NPN Training. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of NPN Training
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the license
 * agreement you entered into with NPN Training.
 *
 */

package com.npntraining.pageobjects.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.npntraining.pageobjects.homepage.HomePage;
import com.npntraining.utility.ORPropertyFileReader;

public class LoginPage {

	private WebElement userNameTxt;

	private WebElement passwordTxt;

	private WebElement submitBtn;

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.userNameTxt = this.driver
				.findElement(By.id(ORPropertyFileReader.getPropValue("username.txt")));
		this.passwordTxt = this.driver
				.findElement(By.id(ORPropertyFileReader.getPropValue("password.txt")));
		this.submitBtn = this.driver
				.findElement(By.id(ORPropertyFileReader.getPropValue("submit.btn")));
	}

	public HomePage clickSubmit(String userName, String password) {
		this.userNameTxt.sendKeys(userName);
		this.passwordTxt.sendKeys(password);
		this.submitBtn.click();
		return new HomePage(driver);
	}
}
