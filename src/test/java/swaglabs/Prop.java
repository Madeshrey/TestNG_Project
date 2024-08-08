package swaglabs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop {
	public static String readProp() throws IOException {
		FileInputStream stream=new FileInputStream("C:\\Users\\rvmad\\eclipse-workspace\\Javaproject\\config.properties");
		Properties property=new Properties();
		property.load(stream);
		return property.getProperty("browser");
	}
}
