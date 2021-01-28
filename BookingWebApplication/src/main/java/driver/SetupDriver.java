package driver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Format;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class SetupDriver {

	public WebDriver driver;
	public WebDriver launch() throws IOException {

		String path = "C:\\Users\\Neosoft\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();

		driver.get("https://d18cjm93x7men9.cloudfront.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		  Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		  ImageIO.write(screenshot.getImage(),"PNG",new                              
		File("C:/Users/Neosoft/Oxy_booking/BookingWebApplication/src/test/resources/screenshots/FullPageScreenshot.png"));
		
		
		
		return driver;

	}

}
