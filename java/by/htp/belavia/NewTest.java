package by.htp.belavia;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import by.htp.belavia.steps.Steps;

public class NewTest {
	private Steps steps;

	@Test
	public void f() {
		steps.selectTrip();
	}

	@BeforeClass
	public void beforeClass() {
		steps = new Steps();
		steps.initDriverr();
	}

//	@AfterClass
//	public void afterClass() {
//		steps.closeDriver();
//	}

}
