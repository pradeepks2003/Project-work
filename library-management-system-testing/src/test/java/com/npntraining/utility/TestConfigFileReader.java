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

package com.npntraining.utility;

import java.io.IOException;
import java.util.Properties;

public class TestConfigFileReader {

	public static String getPropValue(String key) {
		Properties prop = new Properties();
		String propValue = "";
		try {
			prop.load(ClassLoader.getSystemResourceAsStream("testconfig.properties"));
			propValue = prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return propValue;
	}
}
