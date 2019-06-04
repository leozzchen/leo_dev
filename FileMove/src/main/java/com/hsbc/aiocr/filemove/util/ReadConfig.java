package com.hsbc.aiocr.filemove.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig {
	
	private static Properties protertity = null;
	
	public static void initial() {
		try {
			FileWriter fw = new FileWriter("./config.properties",true);
			fw.flush();
			fw.close();
			InputStream is = new FileInputStream("./config.properties");
			protertity = new Properties();
			protertity.load(is);
			is.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getKey(String key) {
		return protertity.getProperty(key);
	}
	
	public static void setValue(String key,String value) {
		try {
			FileOutputStream fos = new FileOutputStream("./config.properties");
			protertity.setProperty(key, value);
			protertity.store(fos, null);
			fos.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static {
		initial();
	}
}
