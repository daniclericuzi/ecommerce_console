package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectedConsolePage extends Page {
	
	public SelectedConsolePage(WebDriver driver) { super(driver); }
	
	private By productName = By.id("product-name-default");
	private By productPrice = By.cssSelector(".price__SalesPrice-ej7lo8-2");
	private By zipCode = By.id("freight-field"); 
	private By freightButton = By.id("freight-field-button");
	private By buttonBuy = By.id("btn-buy");
	private By freightElement = By.cssSelector(".freight-options__PriceContainer-cesh2v-2 span:nth-child(2)");
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	public String getProductPrice() {
		return driver.findElement(productPrice).getText();
	}
	
	public void fillPostalCode(String cep) { driver.findElement(zipCode).sendKeys(cep); }
	
	public void clickPostalCodeButton() { driver.findElement(freightButton).click(); }
	
	public void getFreightValue() {
		wait(freightElement);
		String freightValue = driver.findElement(freightElement).getText();
	}
	
	public void clickButtonBuy() { driver.findElement(buttonBuy).click(); }
}