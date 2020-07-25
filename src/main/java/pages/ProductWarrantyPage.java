package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductWarrantyPage extends Page {
	
	public ProductWarrantyPage(WebDriver driver) { super(driver); }
	
	private By buttonContinue = By.id("btn-continue");
	/*private By label = By.cssSelector(".service-options__RadioContainer-sc-6v3x4r-12");
	
	public void clickInputWarranty() { 
		List<WebElement> warrantyList = driver.findElements(label);
		for (int i = 0; i < warrantyList.size(); i++) {
			if (i == 1) {
				warrantyList.get(i).click();
			}
		} 
		} */

	public void clickButtonContinue() {
		wait(buttonContinue);
		driver.findElement(buttonContinue).click();	
	}

}
