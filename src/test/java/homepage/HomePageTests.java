package homepage;

import org.junit.jupiter.api.Test;

import base.BaseTests;
import pages.CartPage;
import pages.ProductPage;
import pages.SelectedConsolePage;

public class HomePageTests extends BaseTests {
	
	// Related to HomePage screen
	@Test
	public void testFindConsole_ps4() {
		loadHomePage();
		homePage.findConsole("ps4");
		homePage.clickButtonSearch();		
	}
	
	ProductPage productPage;
	
	@Test
	public void testSelectConsole_firstConsole() {
		productPage.clickSelectedConsole();
	} 
	
	SelectedConsolePage selectedConsolePage;
	//@Test
	
	// Pre Condição
	// O produto sendo console ps4
	// Validar item na tela
	
	// frete
	//selectedConsolePage.fillPostalCode("53030-050");
	//selectedConsolePage.clickPostalCodeButton();
	
 

	/* @Test PAGECART
	public void testCheckQuantityInCart_oneItem() {
		int quantityInCart = cartPage.getProductInCart();
		System.out.println(quantityInCart);
		assertThat(quantityInCart, is(1));
	} */
}
