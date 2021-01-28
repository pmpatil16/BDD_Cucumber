package booking_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class AutoFinance_Homescreen {

//	public static WebDriver driver;

	public AutoFinance_Homescreen(WebDriver driver) {
		//sthis.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Search Cars')]")
	public WebElement search_car_TAB;

	@FindBy(how = How.LINK_TEXT, using = "Financing")
	public WebElement Financing_TAB;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'How It Works')]")
	public WebElement hoe_it_works_TAB;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Resources')]")
	public WebElement resources_TAB;

	public void verify_search_Car_tab() throws Throwable {

		System.out.println(search_car_TAB.isDisplayed());

		System.out.println(search_car_TAB.getText());
		
	Thread.sleep(5000);
		
	}

	public void verify_finance_tab(){

		System.out.println(Financing_TAB.getText() +"  =  " + Financing_TAB.isDisplayed());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verify_how_it_work() {

		System.out.println(hoe_it_works_TAB.getText() + " = " +hoe_it_works_TAB.isDisplayed());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verify_resourse_tab() {

		System.out.println(resources_TAB.getText() + " = " +resources_TAB.isDisplayed());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void click_on_search_cars() {

		search_car_TAB.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
