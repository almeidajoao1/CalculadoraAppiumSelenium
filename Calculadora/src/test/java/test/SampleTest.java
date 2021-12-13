package test;

import org.junit.Test;

import core.BaseTest;
import page.PageTest;

public class SampleTest extends BaseTest {
	
	public PageTest page = new PageTest();

	@Test
	public void sampleTest() {
		page.mapear();
	}
}