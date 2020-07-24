package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriver driver;
	
	private By console = By.id("h_search-input");
	private By buttonSearch = By.cssSelector("#h_search-btn");
	
	public HomePage(WebDriver driver) { this.driver = driver; }
	
	public void findConsole(String text) { driver.findElement(console).sendKeys(text); }
	
	public ProductPage clickButtonSearch() {
		driver.findElement(buttonSearch).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(console));
		return new ProductPage(driver);
	}
}
