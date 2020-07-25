package homepage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import base.BaseTests;
import pages.CartPage;
import pages.HomePage;
import pages.ProductListPage;
import pages.ProductWarrantyPage;
import pages.SelectedConsolePage;

public class HomePageTests extends BaseTests {
	
	// Related to HomePage screen. This method will load the page and
	@Test 
	public void testAddProductToCart_ProductAddedSuccessfully() {
		
		HomePage homePage = new HomePage(driver);
		homePage.findConsole("ps4");
		homePage.clickButtonSearch();
		
		ProductListPage  productPage = new ProductListPage(driver);
		productPage.clickSelectedConsole();
		
		SelectedConsolePage selectedConsolePage = new SelectedConsolePage(driver);
		String productName = selectedConsolePage.getProductName();
	    String productPrice = selectedConsolePage.getProductPrice();
		selectedConsolePage.fillPostalCode("53030-050");
	    selectedConsolePage.clickPostalCodeButton();
	    selectedConsolePage.getFreightValue();
	    selectedConsolePage.clickButtonBuy();
	    
	    ProductWarrantyPage productWarrantyPage = new ProductWarrantyPage(driver);
		//productWarrantyPage.clickInputWarranty();
		productWarrantyPage.clickButtonContinue();
		
		CartPage carPage = new CartPage(driver);
		String productNameInCart = carPage.getProductNameInCart();
		String productPriceInCart = carPage.getProductPriceInCart();
		
		assertEquals(productName, productNameInCart);
		assertEquals(productPrice, productPriceInCart);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
