package core;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Before;

public class BaseTest {
	
	@Before
	public void conection() {
		getDriver();
		
	}
	
	@After
	public void tearDown() {
		killDriver();
	}

}
