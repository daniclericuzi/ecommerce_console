package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductWarrantyPage {
	
	private WebDriver driver;
	
	public ProductWarrantyPage(WebDriver driver) { this.driver = driver; }
	
	private By buttonContinue = By.id("btn-continue");
	private By label = By.className("Input-sc-1x9td29-3");
	
	public void clickInputWarranty() { 
		List<WebElement> warrantyList = driver.findElements(label);
		for (int i = 0; i < warrantyList.size(); i++) {
			if (i == 1) {
				warrantyList.get(i).click();
			}
		}
		}

	public void clickButtonContinue() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(label));
		driver.findElement(buttonContinue).click();	
	}

}
