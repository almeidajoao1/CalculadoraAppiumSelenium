package page;

import static core.DriverFactory.getDriver;

import core.BaseTest;
import io.appium.java_client.MobileElement;

public class PageTest {
	
	public BaseTest base = new BaseTest();
	
	public void mapear() {
		MobileElement el1 = (MobileElement) getDriver().findElementById("com.google.android.calculator:id/digit_1");
		el1.click();
		MobileElement el2 = (MobileElement) getDriver().findElementByAccessibilityId("plus");
		el2.click();
		MobileElement el3 = (MobileElement) getDriver().findElementById("com.google.android.calculator:id/digit_1");
		el3.click();
		MobileElement el4 = (MobileElement) getDriver().findElementByAccessibilityId("equals");
		el4.click();
		MobileElement el5 = (MobileElement) getDriver().findElementById("com.google.android.calculator:id/result_final");
		el5.click();
	}
}
