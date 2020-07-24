package homepage;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import base.BaseTests;
import pages.HomePage;
import pages.ProductPage;
import pages.ProductWarrantyPage;
import pages.SelectedConsolePage;

public class HomePageTests extends BaseTests {
	
	// Related to HomePage screen. This method will load the page and
	@Test 
	@Order(1)
	public void testFindConsole_ps4() {
		HomePage homePage = new HomePage(driver);
		homePage.findConsole("ps4");
		homePage.clickButtonSearch();		
	}
	
	@Test
	@Order(2)
	public void testSelectConsole_firstConsole() {
		ProductPage  productPage = new ProductPage(driver);
		productPage.clickSelectedConsole();
	} 
	
	@Test 
	@Order(3)
	public void testShowFreighByZipCode_getFreightByZipCode() {
		SelectedConsolePage selectedConsolePage = new SelectedConsolePage(driver);
		selectedConsolePage.fillPostalCode("53030-050");
	    selectedConsolePage.clickPostalCodeButton();
	    selectedConsolePage.getFreightValue();
	    selectedConsolePage.clickButtonBuy();
	}
	
	@Test
	@Order(4)
	public void testSelectWarranty_twelveMonthsWarrantySelected () {
		ProductWarrantyPage productWarrantyPage = new ProductWarrantyPage(driver);
		productWarrantyPage.clickInputWarranty();
		productWarrantyPage.clickButtonContinue();
	
	}
 

	/* @Test PAGECART
	public void testCheckQuantityInCart_oneItem() {
		int quantityInCart = cartPage.getProductInCart();
		System.out.println(quantityInCart);
		assertThat(quantityInCart, is(1));
	} */
}
