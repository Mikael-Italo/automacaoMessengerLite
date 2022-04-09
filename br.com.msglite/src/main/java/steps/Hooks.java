package steps;

import static utils.Utils.driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp() throws MalformedURLException{
		    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		    desiredCapabilities.setCapability("platformName", "Android");
		    desiredCapabilities.setCapability("deviceName", "emulator-5554");
		    desiredCapabilities.setCapability("automationName", "uiautomator2");
		    desiredCapabilities.setCapability("appPackage", "com.facebook.mlite");
		    desiredCapabilities.setCapability("appActivity", "com.facebook.mlite.coreui.view.MainActivity");

		    String url = "http://localhost:4723/wd/hub";
		    driver = new AndroidDriver<WebElement>(new URL(url), desiredCapabilities);
		    
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	
	@After
	public void fecharApp() throws Exception{
		driver.quit();
	}
}
