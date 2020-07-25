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
 * Classe de teste do fluxo de inclusão de Play Station 4 no carrinho de compras.
 * @author Danielle
 *
 */
public class HomePageTests extends BaseTests {
	
	// Método de teste do fluxo de inclusão de Play Station 4 no carrinho de compras.
	@Test
	public void testAddProductToCart_ProductAddedSuccessfully() {
		
		// Busca do produto PS4 na página inicial
		HomePage homePage = new HomePage(driver);
		homePage.findConsole("ps4");
		homePage.clickButtonSearch();
		
		// Página de listagem dos produtos encontrado ao clicar no botão de busca
		ProductListPage  productPage = new ProductListPage(driver);
		productPage.clickSelectedConsole();
		
		// Página de detalhamento do produto selecionado na tela de listagem de produtos
		SelectedConsolePage selectedConsolePage = new SelectedConsolePage(driver);
		String productName = selectedConsolePage.getProductName();
	    String productPrice = selectedConsolePage.getProductPrice();
		selectedConsolePage.fillPostalCode("53030-050");
	    selectedConsolePage.clickPostalCodeButton();
	    selectedConsolePage.getFreightValue();
	    selectedConsolePage.clickButtonBuy();
	    
	    // Página de seleção de garantia estendida do produto
	    ProductWarrantyPage productWarrantyPage = new ProductWarrantyPage(driver);
	    
	    // Obtenção dos campos relativos a garantia estendida estão resultando em TimeOut
		//productWarrantyPage.clickInputWarranty();
		productWarrantyPage.clickButtonContinue();
		
		// Página de detalhamento do carrinho com o produto incluído.
		CartPage carPage = new CartPage(driver);
		String productNameInCart = carPage.getProductNameInCart();
		String productPriceInCart = carPage.getProductPriceInCart();
		
		// Verificando se o nome do produto obtido na página de detalhamento é igual ao nome do produto adicionado ao carrinho
		assertEquals(productName, productNameInCart);
		
		// Verificando se o preço do produto obtido na página de detalhamento é igual ao preço do produto adicionado ao carrinho
		assertEquals(productPrice, productPriceInCart);
	}
}
