package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProductPage {
	private WebDriver driver;
	
	// List<WebElement> consolesList = new ArrayList();
	
	public ProductPage(WebDriver driver) { this.driver = driver; }
	
	private By console = By.cssSelector(".RippleContainer-sc-1rpenp9-0 a:nth-child(1)"); 
	// seleciona toda a lista de produtos, vou pegar o indice 1. Será  rolava um teste p ver se o item ta mesmo no primero?
	
	// ve a doida que eu fiz: ele carrega é tudo, depois crio um metodo q chama so o indice q quero 
	/* private void loadConsolesList() {
		consolesList = driver.findElements(consoles);		
	}
	
	private int selectFirstConsole() {
		loadConsolesList();
		return consolesList.indexOf(0); 
	}
	*/ 
	
	public SelectedConsolePage clickSelectedConsole() {
		driver.findElement(console).click();
		return new SelectedConsolePage(driver);
	}
}
