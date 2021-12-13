package core;

import static core.DriverFactory.getDriver;

public class BasePage {
	
	public void digitar(String by) {
		getDriver().findElementById(by);
	}
}