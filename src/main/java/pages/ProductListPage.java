package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ProductListPage extends Page {
	
	public ProductListPage(WebDriver driver) { super(driver); }
	
	private By selectedConsole = By.cssSelector(".RippleContainer-sc-1rpenp9-0 a:nth-child(1)");
	
	public void clickSelectedConsole() {
		driver.findElement(selectedConsole).click();
		wait(selectedConsole);
	}
}
