package com.niqsam.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FileUtils {
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/mvnCommonData.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
}
