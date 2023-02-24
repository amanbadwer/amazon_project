package amazonPages;

import java.util.NoSuchElementException;

import org.apache.tools.ant.property.GetProperty;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import basePackage.BaseClass;

public class Pom_shoppingcart extends BaseClass {
	@FindBy(id="twotabsearchtextbox") WebElement search;
	@FindBy(id="nav-search-submit-button") WebElement go;
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t3.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(4) > div > div > div > div > div.a-section.a-spacing-small.puis-padding-left-small.puis-padding-right-small > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2")WebElement item;
    @FindBy(id="add-to-cart-button")WebElement addtocart;	
    @FindBy(css="#sw-subtotal > span:nth-child(2) > span > span:nth-child(2) > span.a-price-whole")WebElement total;
    @FindBy(css="#sw-gtc > span > a")WebElement go_cart;
    @FindBy(css="#a-autoid-1-announce")WebElement qty;
    @FindBy(id="quantity_3")WebElement three;
public Pom_shoppingcart()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void adding_to_cart() throws InterruptedException
{
search.sendKeys("hair brush");	
go.click();
try {
item.click();
}
catch(NoSuchElementException e){
	e.printStackTrace();
}

addtocart.click();
go_cart.click();
}

public void add_more() throws InterruptedException {
	adding_to_cart();
	qty.click();
	three.click();
	
}



	}
	
	

