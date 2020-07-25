package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends Page {
	
	public CartPage(WebDriver driver) { super(driver); }
	
	private By productInCart = By.cssSelector(".basket-productTitle a:nth-child(1)");
	private By productPriceSelector = By.cssSelector(".basket-productPrice");
	
	//Irá verificar se o carrinho está com um item, se sim, ok
	public String getProductNameInCart() {
		wait(productInCart);
		return driver.findElement(productInCart).getText();
	}
	
	public String getProductPriceInCart() {
		wait(productPriceSelector);
		return driver.findElement(productPriceSelector).getText();
	}


}
