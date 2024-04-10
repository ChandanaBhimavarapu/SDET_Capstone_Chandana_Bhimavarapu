package MobileAutomation_Capstone.Sdet_mobileautomationcapstone;

import org.testng.annotations.Test;

import com.SDET.virtusa.pages.PG_Wifi_checking_001;

public class TC_Wifi_Checking_001 extends BaseClass {
	@Test
	public void WifiCheck() throws InterruptedException{
		PG_Wifi_checking_001 PW=new PG_Wifi_checking_001(driver);	
		PW.ClickOnPreference();
		Thread.sleep(3000);
		PW.ClickOnPreferenceDepe();
		Thread.sleep(3000);
		PW.ClickOnCheckBox();
		Thread.sleep(3000);
		PW.ClickOnWifi();
		Thread.sleep(3000);
		PW.EnterName("Chandana");
		Thread.sleep(3000);
		PW.ClickOnOk();
		
	}

}
