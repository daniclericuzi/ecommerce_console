package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Página inicial das Lojas Americanas.
 * @author Danielle
 *
 */
public class HomePage extends Page {
	
	private By searchInput = By.id("h_search-input");
	private By searchButton = By.cssSelector("#h_search-btn");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * Digita o texto recebido no campo de busca da página inicial.
	 * @param text Texto de busca.
	 */
	public void findConsole(String text) { driver.findElement(searchInput).sendKeys(text); }
	
	/**
	 * Clica no botão de busca.
	 */
	public void clickButtonSearch() {
		driver.findElement(searchButton).click();
	}
}
