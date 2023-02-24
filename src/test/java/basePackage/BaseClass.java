package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class BaseClass {
	public static Properties prop = new Properties();
	public static WebDriver driver;
public BaseClass(){
try {
	FileInputStream file = new FileInputStream("C:\\Users\\amanb\\Downloads\\Commercial\\src\\test\\java\\veriables\\config.properties");
	prop.load(file);
	}
	catch(FileNotFoundException e) 
	    {
		e.printStackTrace();
		}
	catch(IOException a)
	    { 
		a.printStackTrace();
		}}
		
	public static void intial() {
	String Browsername = prop.getProperty("browser");
	if(Browsername.equals("Firefox")) {
		System.setProperty("WebDriver.gecko.driver", "geckodriver.exe");
		  driver = new FirefoxDriver();
	}
	else if(Browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amanb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	}
	public static void screenshots(String Filename) {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(file, new File("C:\\Users\\amanb\\Downloads\\Commercial\\src\\test\\java\\screenshots\\Screenshots" +Filename+".jpg"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}}
	
	
}


