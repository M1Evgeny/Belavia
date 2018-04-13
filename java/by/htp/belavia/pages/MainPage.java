package by.htp.belavia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends AbstractPage {

	private final String URL = "https://belavia.by/";

	By destinationFrom = By
			.xpath("//div[@class='wrapper ui-trigger-input']//a");
	By destinationTo = By.xpath("//*[@id='ibe']/form/div[1]/div[2]/div/a");
	By from = By.xpath("//*[@class='ui-menu-item']");
	By to = By.xpath("//*[@id='ui-id-3']/li");

	By dateAway = By
			.xpath("//*[@class='ui-datepicker-calendar']//*[contains(text(), '19')]");
	By dateBack = By
			.xpath("//*[@class='ui-datepicker-calendar']//*[contains(text(), '29')]");
	By submitBtn = By.xpath("//*[@class='col-group form-group']//button");

	public MainPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
		driver.navigate().to(URL);
	}

	public void selectDestionationFrom() {
		getDestinationFrom().click();
		getFrom().click();
	}

	public void selectDestinationTo() {
		getDestinationTo().click();
		getTo().click();
	}

	public void selectDates() {
		getAwayDate().click();
		getBackDate().click();
	}

	public void submit() {
		getSubmitBtn().click();
	}

	private WebElement getDestinationFrom() {
		return wait.until(ExpectedConditions
				.elementToBeClickable(destinationFrom));
	}

	private WebElement getFrom() {
		return wait.until(ExpectedConditions.elementToBeClickable(from));
	}

	private WebElement getDestinationTo() {
		return wait.until(ExpectedConditions
				.elementToBeClickable(destinationTo));
	}

	private WebElement getTo() {
		return wait.until(ExpectedConditions.elementToBeClickable(to));
	}

	private WebElement getAwayDate() {
		return wait.until(ExpectedConditions.elementToBeClickable(dateAway));
	}

	private WebElement getBackDate() {
		return wait.until(ExpectedConditions.elementToBeClickable(dateBack));
	}

	private WebElement getSubmitBtn() {
		return wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
	}
}
