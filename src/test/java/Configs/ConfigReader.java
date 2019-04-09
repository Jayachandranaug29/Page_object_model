package Configs;

import java.util.Properties;
import java.io.InputStream;

public class ConfigReader {
	 public static Properties prop;

	    public static void ReadConfig() throws Exception
	    {
	        String propFileName = "configs/config.properties";
	        prop = new Properties();
	        InputStream inputStream = ConfigReader.class.getClassLoader().getResourceAsStream(propFileName);
	        prop.load(inputStream);
	    }

	    public static String get(String key)throws Exception
	    {
	        return (String) prop.getProperty(key);
	    }
}
