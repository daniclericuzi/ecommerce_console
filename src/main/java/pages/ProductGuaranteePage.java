package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductGuaranteePage {
	
	private WebDriver driver;
	
	public ProductGuaranteePage(WebDriver driver) { this.driver = driver; }
	
	private By buttonContinue = By.id("btn-continue");
	

			public CartPage clickButtonContinue() {
				driver.findElement(buttonContinue).click();
				return new CartPage(driver);
			}

}
