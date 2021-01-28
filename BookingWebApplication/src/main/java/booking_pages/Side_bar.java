package booking_pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Side_bar {
	
	
	public Side_bar(WebDriver driver) {
		//sthis.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Make & Model')]")
	public WebElement make_module_dropdown ;

	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement All_dropdown;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Body Type')]")
	public WebElement body_type_dropdown;
	
	@FindBy(how = How.XPATH, using = "/body/div[@id='root']/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/label[1]")
	public WebElement car_type ;
	
	public void click_on_make_model() {
		
		make_module_dropdown.click();
		
	}
	
	public void filter_car() throws Throwable {
		
		All_dropdown.click();
		Thread.sleep(4000);
		All_dropdown.sendKeys("BMW");
		All_dropdown.sendKeys(Keys.ENTER);
		
		
	}
	
	public void verify_body_type() {
	
		body_type_dropdown.click();
		
	}

}
