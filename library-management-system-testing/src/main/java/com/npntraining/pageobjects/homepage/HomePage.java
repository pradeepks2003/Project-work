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

package com.npntraining.pageobjects.homepage;

import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		return this.driver.getTitle();
	}
}
