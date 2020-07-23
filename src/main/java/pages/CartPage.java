package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	private WebDriver driver;
	
	public CartPage(WebDriver driver) { this.driver = driver; }
	
	private By productInCart = By.className("form-control select__quantity");
	
	//Irá verificar se o carrinho está com um item, se sim, ok
	public int getProductInCart() {
		String quantityInCart = driver.findElement(productInCart).getText();
		int quantityProductInCart = Integer.parseInt(quantityInCart);
		return quantityProductInCart;
	}

}
