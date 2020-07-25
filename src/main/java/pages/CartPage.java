package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Página de detalhamento do carrinho com os produtos adicionados.
 * @author Danielle
 *
 */
public class CartPage extends Page {
	
	public CartPage(WebDriver driver) { super(driver); }
	
	private By productInCart = By.cssSelector(".basket-productTitle a:nth-child(1)");
	private By productPriceSelector = By.cssSelector(".basket-productPrice");
	
	/**
	 * Obtém o nome do produto adicionado ao carrinho.
	 * @return Nome do produto.
	 */
	public String getProductNameInCart() {
		wait(productInCart);
		return driver.findElement(productInCart).getText();
	}
	
	/**
	 * Obtém o preço do produto adicionado ao carrinho.
	 * @return Preço do produto.
	 */
	public String getProductPriceInCart() {
		wait(productPriceSelector);
		return driver.findElement(productPriceSelector).getText();
	}


}
