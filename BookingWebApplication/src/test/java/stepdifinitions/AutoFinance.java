package stepdifinitions;

import org.openqa.selenium.WebDriver;

import booking_pages.AutoFinance_Homescreen;
import booking_pages.Side_bar;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SetupDriver;

public class AutoFinance {
	
	static WebDriver driver;
	 SetupDriver setup;
	 AutoFinance_Homescreen home;
	 Side_bar sidebar;
	@Given("^Launch autofinace application$")
	public void launch_autofinace_application() throws Throwable {
		
		setup=new SetupDriver();
		
		driver=setup.launch();
	    
	}

	@When("^Verify home screen tabs$")
	public void verify_home_screen_tabs() throws Throwable {
		
		 home=new AutoFinance_Homescreen(driver);
		home.verify_search_Car_tab();
		home.verify_finance_tab();
		home.verify_how_it_work();
		home.verify_resourse_tab();
		
	}

	@When("^Click on search car tab$")
	public void click_on_search_car_tab() throws Throwable {
	   
		 home=new AutoFinance_Homescreen(driver);
		
		home.click_on_search_cars();
		
		
		
	}

	@Then("^verify sidebar menu$")
	public void verify_sidebar_menu() throws Throwable {
	 
		sidebar=new Side_bar(driver);
		
		sidebar.click_on_make_model();
	}

	@When("^Enter and search cars$")
	public void enter_and_search_cars() throws Throwable {
	   
		sidebar=new Side_bar(driver);
		
		//sidebar.filter_car();
		
		sidebar.verify_body_type();
		
		
	}


	
	
	
	
	
	

}
