package examen.sel.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BusquedaTest {
	// INICIALIZACION DE VARIABLES
	private WebDriver driver;
	BuscarConGooglePage buscargoogle;
	String actualResult;
	String expectedResult = "test - Buscar con Google";

//METODO ANTES DE 
	@Before
	public void setUp() throws Exception {
		buscargoogle = new BuscarConGooglePage(driver);
		driver = buscargoogle.chromeDriverConnection();
		driver.manage().window().maximize();
		buscargoogle.visit("https://www.google.com/");
	}

//METODO DESPUES DE 
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

//METODO DONDE INVOXAMOS AL METODO .busquedaGoogle()
	@Test
	public void testBuscar() throws InterruptedException {
		buscargoogle.busquedaGoogle();
		actualResult = buscargoogle.tituloP();
		assertEquals(expectedResult, actualResult);

	}

}
