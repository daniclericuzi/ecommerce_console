package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Página de seleçaõ de garantia estendida do produto.
 * @author Danielle
 *
 */
public class ProductWarrantyPage extends Page {
	
	public ProductWarrantyPage(WebDriver driver) { super(driver); }
	
	private By buttonContinue = By.id("btn-continue");
	
	/**
	 * Clica na opção de garantia estendida de 12 meses.
	 */
	public void clickInputWarranty() { 
		List<WebElement> warrantyList = driver.findElements(By.cssSelector(".service-options__RadioContainer-sc-6v3x4r-12"));
		for (int i = 0; i < warrantyList.size(); i++) {
			if (i == 1) {
				warrantyList.get(i).click();
			}
		} 
	}

	/**
	 * Clica no botão de continuar para a página do carrinho.
	 */
	public void clickButtonContinue() {
		wait(buttonContinue);
		driver.findElement(buttonContinue).click();	
	}

}
