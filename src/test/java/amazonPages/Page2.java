package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.BaseClass;

public class Page2 extends BaseClass {
	@FindBy(id="nav-search-submit-button") WebElement go;
	@FindBy(id="twotabsearchtextbox") WebElement search;
	@FindBy(id="a-autoid-0-announce") WebElement sortby;
	@FindBy(id="s-result-sort-select_1")WebElement lowtohigh;
	public Page2()
	{
		PageFactory.initElements(driver,this);
		
	}
	public void sorting() {
		search.sendKeys("home decor");
		go.click();
		//Select select = new Select(driver.)));
	     //select.selectByVisibleText("Price: Low to high");
	   sortby.click();
	   lowtohigh.click();
		
	
		
}}
