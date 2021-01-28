package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/Report.html",
		"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports" }, features = "C:\\Users\\Neosoft\\Oxy_booking\\BookingWebApplication\\src\\test\\java\\features",

		tags = "@Home_screen",
		glue = "stepdifinitions", monochrome = true, strict = false)

public class Test_Runner {

	@AfterClass
	public static void writeExtentReport() {

	}

}
