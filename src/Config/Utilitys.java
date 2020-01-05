 package Config;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utilitys {

	
	//typecase value of string and return string
	public static String fetchPropertysvalue(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("./Config/Config.properties");
		Properties property = new Properties();
		property.load(file);
	    return (String) property.get(key);
	}
	public static String fetchlocatorsvalue(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("./Config/Elements.properties");
		Properties property = new Properties();
		property.load(file);
	    return  property.get(key).toString();
	}
	
}
