package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Página de listagem dos produtos encontrados na busca.
 * @author Danielle
 *
 */
public class ProductListPage extends Page {
	
	public ProductListPage(WebDriver driver) { super(driver); }
	
	private By selectedConsole = By.cssSelector(".RippleContainer-sc-1rpenp9-0 a:nth-child(1)");
	
	/**
	 * Clica no primeiro elemento console encontrado na busca.
	 */
	public void clickSelectedConsole() {
		driver.findElement(selectedConsole).click();
	}
}
