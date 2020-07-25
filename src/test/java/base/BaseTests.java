package base;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

/**
 * Classe base de testes com métodos de inicialização e finalização dos testes.
 * @author Danielle
 *
 */
public class BaseTests {
	
	public static WebDriver driver;
	protected HomePage homePage;
	
	// Inicialização do chromedriver com abertura do Google Chrome no site das Lojas Americanas
	@BeforeAll
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\83\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.americanas.com.br/");
	}
	
	@AfterAll
	public static void closeBrowser() {
		driver.quit();
	}
}
