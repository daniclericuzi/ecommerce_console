package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectedConsolePage {
	private WebDriver driver;
	
	public SelectedConsolePage(WebDriver driver) { this.driver = driver; }
	
	private By postalCode = By.id("freight-field"); 
	private By postalCodebutton = By.id("freight-field-button");
	private By buttonBuy = By.id("btn-buy");
	private By productName = By.id("product-name-default");
	
	public void fillPostalCode(String cep) { driver.findElement(postalCode).sendKeys(cep); }
	public void clickPostalCodeButton() { driver.findElement(postalCodebutton).click(); }
	
		
		public String getProductName() {
			return driver.findElement(productName).getText();	
		}
		
		//Substituir o X e selecionar o amount do produto
		 /* public String getProductAmount(String x) {
			return driver.findElement(productAmount).get.getText();
		}

		public ProductGuaranteePage clickButtonBuy() {
			driver.findElement(buttonBuy).click();
			return new ProductGuaranteePage(driver);
		} */
}
