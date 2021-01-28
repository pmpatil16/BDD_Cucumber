package test_booking;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

import driver.SetupDriver;

public class Test_Login {
	
	public static SetupDriver setupdriver;
	
	@BeforeTest
	public void launch_app() throws IOException {
		setupdriver=new SetupDriver();
		setupdriver.launch();
		
		
	}

}
