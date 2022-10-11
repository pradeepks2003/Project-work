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


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.npntraining.pageobjects.homepage.HomePage;
import com.npntraining.utility.TestConfigFileReader;

public class LoginPageTest {

	private static WebDriver driver;

	static LoginPage login = null;

	@BeforeClass
	public static void setUpBeforeClass() {
		System.setProperty(TestConfigFileReader.getPropValue("driver.name"),
				TestConfigFileReader.getPropValue("driver.location"));
		driver = new FirefoxDriver();
		driver.get(TestConfigFileReader.getPropValue("aut"));
		login = new LoginPage(driver);
	}

	@Test
	public void testLogin_WithCorrectCrendentials() {
		HomePage homePage = login.clickSubmit("admin", "admin");
		Assert.assertEquals("Dashboard-Library", homePage.getPageTitle());
	}

	@AfterClass
	public static void tearDownAfterClass() {
		driver.close();
	}
} //TEST
