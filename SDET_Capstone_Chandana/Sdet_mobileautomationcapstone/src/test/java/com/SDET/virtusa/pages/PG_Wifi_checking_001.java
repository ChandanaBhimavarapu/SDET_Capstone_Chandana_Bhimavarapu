package com.SDET.virtusa.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class PG_Wifi_checking_001 {
	
	public AndroidDriver driver;
	By Preference=AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Preference\"]");
	By prefenceDependecies=AppiumBy.accessibilityId("3. Preference dependencies");
	By CheckBox=AppiumBy.id("android:id/checkbox");
	By ClickWifiSetting=AppiumBy.xpath("(//android.widget.TextView)[4]");
	By EditBox=AppiumBy.id("android:id/edit");
	By Clickok=AppiumBy.id("android:id/button1");
	public PG_Wifi_checking_001(AndroidDriver driver) {
		this.driver=driver;
		
	}
	public void ClickOnPreference() {
		driver.findElement(Preference).click();
	}
	public void ClickOnPreferenceDepe() {
		driver.findElement(prefenceDependecies).click();
	}
	public void ClickOnCheckBox() {
		driver.findElement(CheckBox).click();
	}
	public void ClickOnWifi() {
		driver.findElement(ClickWifiSetting).click();
	}
	public void EnterName(String Wname) {
		driver.findElement(EditBox).sendKeys(Wname);
	}
	public void ClickOnOk() {
		driver.findElement(Clickok).click();
	}
	
	

}
