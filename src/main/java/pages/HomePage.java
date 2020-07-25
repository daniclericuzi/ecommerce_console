package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Page {
	
	private By console = By.id("h_search-input");
	private By buttonSearch = By.cssSelector("#h_search-btn");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void findConsole(String text) { driver.findElement(console).sendKeys(text); }
	
	public void clickButtonSearch() {
		driver.findElement(buttonSearch).click();
		wait(console);
	}
}
