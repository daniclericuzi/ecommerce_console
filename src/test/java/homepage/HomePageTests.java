package homepage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import base.BaseTests;
import pages.CartPage;
import pages.HomePage;
import pages.ProductListPage;
import pages.ProductWarrantyPage;
import pages.SelectedConsolePage;

/**
 * Classe de teste do fluxo de inclus�o de Play Station 4 no carrinho de compras.
 * @author Danielle
 *
 */
public class HomePageTests extends BaseTests {
	
	// M�todo de teste do fluxo de inclus�o de Play Station 4 no carrinho de compras.
	@Test
	public void testAddProductToCart_ProductAddedSuccessfully() {
		
		// Busca do produto PS4 na p�gina inicial
		HomePage homePage = new HomePage(driver);
		homePage.findConsole("ps4");
		homePage.clickButtonSearch();
		
		// P�gina de listagem dos produtos encontrado ao clicar no bot�o de busca
		ProductListPage  productPage = new ProductListPage(driver);
		productPage.clickSelectedConsole();
		
		// P�gina de detalhamento do produto selecionado na tela de listagem de produtos
		SelectedConsolePage selectedConsolePage = new SelectedConsolePage(driver);
		String productName = selectedConsolePage.getProductName();
	    String productPrice = selectedConsolePage.getProductPrice();
		selectedConsolePage.fillPostalCode("53030-050");
	    selectedConsolePage.clickPostalCodeButton();
	    selectedConsolePage.getFreightValue();
	    selectedConsolePage.clickButtonBuy();
	    
	    // P�gina de sele��o de garantia estendida do produto
	    ProductWarrantyPage productWarrantyPage = new ProductWarrantyPage(driver);
	    
	    // Obten��o dos campos relativos a garantia estendida est�o resultando em TimeOut
		//productWarrantyPage.clickInputWarranty();
		productWarrantyPage.clickButtonContinue();
		
		// P�gina de detalhamento do carrinho com o produto inclu�do.
		CartPage carPage = new CartPage(driver);
		String productNameInCart = carPage.getProductNameInCart();
		String productPriceInCart = carPage.getProductPriceInCart();
		
		// Verificando se o nome do produto obtido na p�gina de detalhamento � igual ao nome do produto adicionado ao carrinho
		assertEquals(productName, productNameInCart);
		
		// Verificando se o pre�o do produto obtido na p�gina de detalhamento � igual ao pre�o do produto adicionado ao carrinho
		assertEquals(productPrice, productPriceInCart);
	}
}
