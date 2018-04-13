package by.htp.belavia.steps;

import org.openqa.selenium.WebDriver;

import by.htp.belavia.driver.DriverSingletone;
import by.htp.belavia.pages.MainPage;

public class Steps {

	private WebDriver driver;

	public void initDriverr() {
		driver = DriverSingletone.getDriver();
	}

	public void closeDriver() {
		DriverSingletone.closeDriver();
	}

	public void selectTrip() {
		MainPage main = new MainPage(driver);
		main.openPage();
		main.selectDestionationFrom();
		main.selectDestinationTo();
		main.selectDates();
		main.submit();
	}

}
