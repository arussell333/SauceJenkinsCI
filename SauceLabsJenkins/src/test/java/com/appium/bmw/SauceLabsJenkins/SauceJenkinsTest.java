package com.appium.bmw.SauceLabsJenkins;




import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SauceJenkinsTest {
	
	private AndroidDriver driver;

	@Test
    public void testCase()throws  Exception {
		
		
		DesiredCapabilities caps = DesiredCapabilities.android();
		caps.setCapability("appiumVersion", "1.5.1");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("browserName", "");
		caps.setCapability("deviceName","HTC Evo 3D Emulator");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, System.getProperty("PlatformName"));
		caps.setCapability("platformVersion","4.0");
		caps.setCapability("app","sauce-storage:My_BMW_Remote.apk");
//		caps.setCapability("fullReset", true);
		caps.setCapability("appPackage", "com.bmw.remote");
		caps.setCapability("appActivity", "base.ui.commonwidgets.StartupActivity");
		driver= new AndroidDriver(new URL("http://arussell333:a5a8a714-4ab8-40e5-93b0-462a6912b78e@ondemand.saucelabs.com:80/wd/hub"),caps);
		
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/disclaimer_btn_ok\").text(\"Accept\")").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bmw.remote:id/username\")").sendKeys("arussell333@gmail.com");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		Thread.sleep(6000);
	driver.quit();
		
		
		
		

	}

}