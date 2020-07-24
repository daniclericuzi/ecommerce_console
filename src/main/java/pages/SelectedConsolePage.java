package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectedConsolePage {
	private WebDriver driver;
	
	public SelectedConsolePage(WebDriver driver) { this.driver = driver; }
	
	private By zipCode = By.id("freight-field"); 
	private By freightButton = By.id("freight-field-button");
	private By buttonBuy = By.id("btn-buy");
	private By freightElement = By.cssSelector(".freight-options__PriceContainer-cesh2v-2 span:nth-child(2)");
	
	public void fillPostalCode(String cep) { driver.findElement(zipCode).sendKeys(cep); }
	
	public void clickPostalCodeButton() { driver.findElement(freightButton).click(); }
	
	public void getFreightValue() { 
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(freightElement));
		String freightValue = driver.findElement(freightElement).getText();
		System.out.println(freightValue);
		}
	
	public void clickButtonBuy() { driver.findElement(buttonBuy).click(); }
}