package by.htp.belavia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {
	protected WebDriver driver;
	protected WebDriverWait wait;
	private int waitTime = 10;

	public abstract void openPage();

	public AbstractPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, waitTime);
	}

}
