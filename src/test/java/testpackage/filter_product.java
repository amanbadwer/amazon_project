package testpackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonPages.Filteration;
import basePackage.BaseClass;

public class filter_product extends BaseClass {
	Filteration filter;
	
	public filter_product() {
		super();
	}
	@BeforeMethod 
	public void initsetup()
	{
		intial();
		filter = new Filteration();
		screenshots("Testclass");
	}
	
			
	@Test
	public void filter_by_review() {
		filter.customer_review();
		}
	@Test
	public void Brand() {
		filter.filter_by_brand();
	}
	@Test
	public void price() {
		filter.filter_by_price();
	}
	@Test
	public void availability() {
		filter.filter_by_availbility();
	}
	
		

}
