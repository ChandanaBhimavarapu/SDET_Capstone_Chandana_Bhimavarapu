package MobileAutomation_Capstone.Sdet_mobileautomationcapstone;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;


import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public AndroidDriver driver;
	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "MobileChandana");
		capabilities.setCapability("app",
				"C:\\Users\\CHANDANAB\\eclipse-workspace\\Sdet_mobileautomationcapstone\\Resources\\ApiDemos-debug.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
		Thread.sleep(4000);
	}

}
