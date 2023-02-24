package testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import amazonPages.Page2;
import amazonPages.PomHome;
import basePackage.BaseClass;
import exelPackage.Excelsheets;

public class Testclass extends BaseClass{
	PomHome home;
	Page2 page;
	public Testclass() {
		super();
	}
	@BeforeMethod 
	public void initsetup()
	{
		intial();
		home = new PomHome();
		screenshots("Testclass");
	}
	
			
	@Test
	public void accountdetail() {
		home.login();
		}
	
	
	
	@Test
	public void title() {
		String actual = home.verify();
		System.out.println(actual);
	}
	@DataProvider
	public Object[][] details(){
		Object result[][]=Excelsheets.readdata("Sheet1");
		return result;
	}
	
	
	@Test(dataProvider="details")
	public void searchfor(String product) {
		home.entersearch(product);
		home.goelement();
		}
	
	
	public void close() {
		driver.close();
	}
	
	

}
