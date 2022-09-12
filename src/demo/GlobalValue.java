package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\shital.shewale\\Downloads\\eclipse-java-2022-06-R-win32-x86_64\\Property\\src\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		//dynamically change the property file
		prop.setProperty("browser", "firefox");
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\shital.shewale\\\\Downloads\\\\eclipse-java-2022-06-R-win32-x86_64\\\\Property\\\\src\\\\data.properties");
		prop.store(fos, null);
	}

}
