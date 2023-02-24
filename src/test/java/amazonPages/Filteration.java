package amazonPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class Filteration extends BaseClass{
	@FindBy(id="twotabsearchtextbox") WebElement search;
	@FindBy(css="#p_72\\/11192170011 > span > a > section > i") WebElement fourstar;
	@FindBy(id="nav-search-submit-button") WebElement go;
	@FindBy(css="#nav-link-accountList-nav-line-1") WebElement signin;
	@FindBy(css="#nav-al-your-account > a:nth-child(2) > span") WebElement youraccount;
	@FindBy(id="ap_email") WebElement email;
	@FindBy(id="continue")WebElement countinue;
	@FindBy(css="#p_89\\/Michael\\ Kors > span > a > span")WebElement brand;
	@FindBy(css="#p_36\\/12035763011 > span > a > span")WebElement price;
	@FindBy(css="#p_n_availability\\/12035748011 > span > a > span")WebElement outofstock;
	Filteration filter;
	public Filteration()
	{
		PageFactory.initElements(driver,this);
		
	}

	
	public void initsetup()
	{
		intial();
		filter = new Filteration();
		screenshots("Testclass");
	}
	public void customer_review() {
		search.sendKeys("winter jacket");
		go.click();
		fourstar.click();
		}
	public void filter_by_brand() {
		search.sendKeys("hand bags");
		go.click();
		brand.click();
	}
	public void filter_by_price() {
		search.sendKeys("hand bags");
		go.click();
		price.click();
		}
	public void filter_by_availbility() {
		search.sendKeys("hand bags");
		go.click();
		outofstock.click();

}}