package com.mislbd.testautomation.configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ExcelDataProperties {
	
	private final Properties properties = new Properties();

	public ExcelDataProperties(String resourceName) {
		final InputStream inputStream = getClass().getResourceAsStream(resourceName);
		try {
			properties.load(inputStream);
		} catch (final IOException e) {
			throw new RuntimeException(e);
		}
	}
	public String getValue(final String key) {
		return properties.getProperty(key);
	}

}
