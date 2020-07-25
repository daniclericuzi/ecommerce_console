package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * P�gina de detalhamento do console selecionado na p�gina de listagem.
 * @author Danielle
 *
 */
public class SelectedConsolePage extends Page {
	
	public SelectedConsolePage(WebDriver driver) { super(driver); }
	
	private By productName = By.id("product-name-default");
	private By productPrice = By.cssSelector(".price__SalesPrice-ej7lo8-2");
	private By zipCode = By.id("freight-field"); 
	private By freightButton = By.id("freight-field-button");
	private By buttonBuy = By.id("btn-buy");
	private By freightElement = By.cssSelector(".freight-options__PriceContainer-cesh2v-2 span:nth-child(2)");
	
	/**
	 * Obt�m o nome do produto selecionado.
	 * @return Nome do produto.
	 */
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	/**
	 * Obt�m o pre�o do produto selecionado.
	 * @return Pre�o do produto.
	 */
	public String getProductPrice() {
		return driver.findElement(productPrice).getText();
	}
	
	/**
	 * Preenche o campo de cep com o cep informado.
	 * @param cep Cep.
	 */
	public void fillPostalCode(String cep) { driver.findElement(zipCode).sendKeys(cep); }
	
	/**
	 * Clica no bot�o de sele��o do frete.
	 */
	public void clickPostalCodeButton() { driver.findElement(freightButton).click(); }
	
	/**
	 * Exibe o valor do frete de acordo com o cep.
	 */
	public void getFreightValue() {
		wait(freightElement);
		String freightValue = driver.findElement(freightElement).getText();
		System.out.println(freightValue);
	}
	
	/**
	 * Clica no bot�o de comprar o produto.
	 */
	public void clickButtonBuy() { driver.findElement(buttonBuy).click(); }
}