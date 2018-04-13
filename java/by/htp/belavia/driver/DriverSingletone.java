package by.htp.belavia.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingletone {

	private static WebDriver driver;
	private static final String CHROME_DRIVER = "webdriver.chrome.driver";
	private static final String CHROME_DRIVER_EX_PATH = "C:\\chromedriver_win32\\chromedriver.exe";

	private DriverSingletone() {
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			initializeDriver();
		}
		return driver;
	}

	public static void closeDriver() {
		driver.close();
		driver = null;
	}

	private static void initializeDriver() {
		System.setProperty(CHROME_DRIVER, CHROME_DRIVER_EX_PATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
}
