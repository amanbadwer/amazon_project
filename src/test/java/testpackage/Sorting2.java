package testpackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonPages.Page2;
import basePackage.BaseClass;

public class Sorting2 extends BaseClass {
	
	Page2 page;
	public Sorting2() {
		super();
	}
	@BeforeMethod 
	public void initsetup()
	{
		intial();
		page = new Page2();
		screenshots("Testclass");
	}
	@Test
	public void sortby() {
	page.sorting();
	}
}
