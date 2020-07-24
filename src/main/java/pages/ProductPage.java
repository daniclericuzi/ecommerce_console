package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ProductPage {
	private WebDriver driver;
	
	public ProductPage(WebDriver driver) { this.driver = driver; }
	
	private By selectedConsole = By.cssSelector(".RippleContainer-sc-1rpenp9-0 a:nth-child(1)");
	
	
	public SelectedConsolePage clickSelectedConsole() {
		driver.findElement(selectedConsole).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectedConsole));
		return new SelectedConsolePage(driver);
	}
}
