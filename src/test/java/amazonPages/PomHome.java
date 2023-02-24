package amazonPages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import basePackage.BaseClass;

public class PomHome extends BaseClass {
@FindBy(id="twotabsearchtextbox") WebElement search;
@FindBy(id="nav-search-submit-button") WebElement go;
@FindBy(css="#nav-link-accountList-nav-line-1") WebElement signin;
@FindBy(css="#nav-al-your-account > a:nth-child(2) > span") WebElement youraccount;
@FindBy(id="ap_email") WebElement email;
@FindBy(id="continue")WebElement countinue;
@FindBy(id="ap_password") WebElement password;
@FindBy(id="signInSubmit")WebElement ok;
@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div") WebElement yourorder;
@FindBy(css="#a-autoid-0-announce > span.a-dropdown-prompt") WebElement sortby;
public PomHome()
{
	PageFactory.initElements(driver,this);
	
}
public void entersearch(String product) {
	search.sendKeys(product);
	
}
public void goelement()
{
	go.click();
	}
public String verify() {
	return driver.getTitle();
}

	
	

public void login() {
	Actions action = new Actions(driver);
	action.moveToElement(signin).build().perform();
	youraccount.click();
	yourorder.click();
	email.sendKeys(prop.getProperty("email"));
	countinue.click();
	password.sendKeys(prop.getProperty("password"));
	ok.click();
	
	
		
}
	
}
