package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * P�gina de detalhamento do carrinho com os produtos adicionados.
 * @author Danielle
 *
 */
public class CartPage extends Page {
	
	public CartPage(WebDriver driver) { super(driver); }
	
	private By productInCart = By.cssSelector(".basket-productTitle a:nth-child(1)");
	private By productPriceSelector = By.cssSelector(".basket-productPrice");
	
	/**
	 * Obt�m o nome do produto adicionado ao carrinho.
	 * @return Nome do produto.
	 */
	public String getProductNameInCart() {
		wait(productInCart);
		return driver.findElement(productInCart).getText();
	}
	
	/**
	 * Obt�m o pre�o do produto adicionado ao carrinho.
	 * @return Pre�o do produto.
	 */
	public String getProductPriceInCart() {
		wait(productPriceSelector);
		return driver.findElement(productPriceSelector).getText();
	}


}
