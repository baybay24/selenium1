package tools;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;


public class ReadPropertyFile {

	public static Properties read(String fileName) {

		String rootPath = new ReadPropertyFile().getClass().getResource("../").getPath();

		if(!rootPath.equals("")) {

			String filePath = rootPath+fileName;
			System.out.println(filePath);
			try {
				InputStreamReader reader = new InputStreamReader(new BufferedInputStream(new FileInputStream(filePath)),"UTF-8");
				Properties properties = new Properties();
			    properties.load(reader);
			    properties.getProperty(filePath);
			    return properties;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
			}
					
		}
		return null;
	}
	
}
