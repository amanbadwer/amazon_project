package testpackage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonPages.Pom_shoppingcart;
import basePackage.BaseClass;

public class Shopping_cart extends BaseClass {
	Pom_shoppingcart cart;
	
	public Shopping_cart(){
		super();
		
	}
	@BeforeMethod 
	public void initsetup()
	{
		intial();
		cart = new Pom_shoppingcart();
	}
	@Test
	public void add_to_cart() throws InterruptedException {
		cart.adding_to_cart();
		Assert.assertNotEquals( 0, 0);
	}
	@Test
public void adding_more() throws InterruptedException {
	cart.add_more();
	Assert.assertNotEquals(15.97, 15.97);
	
}

	

}
