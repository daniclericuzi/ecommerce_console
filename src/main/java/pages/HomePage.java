package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	private By console = By.id("h_search-input");
	private By buttonSearch = By.id("h_search-btn");
	
	public HomePage(WebDriver driver) { this.driver = driver; }
	
	public void findConsole(String text) { driver.findElement(console).sendKeys(text); }
	
	public ProductPage clickButtonSearch() {
		driver.findElement(buttonSearch).click();
		return new ProductPage(driver);
	}
}
