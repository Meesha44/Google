package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
public static Properties prop;
public static WebDriver driver;
public static FileInputStream fis;

public Base()
{
	try {
		prop=new Properties();
fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
prop.load(fis);
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
catch( IOException e)
	{
	e.printStackTrace();
	}

}
public void Initialization() {
	String browser=prop.getProperty("browser");
	int implicitelyWait=Integer.parseInt(prop.getProperty("implicitlyWait"));
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\meesh\\Documents\\New folder\\chromedriver-win64\\chromedriver.exe"); 
		driver = new ChromeDriver();

	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(implicitelyWait ,TimeUnit.SECONDS);
	driver.get(System.getProperty("url"));
}

}
