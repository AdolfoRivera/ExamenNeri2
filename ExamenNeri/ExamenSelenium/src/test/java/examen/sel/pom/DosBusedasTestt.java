package examen.sel.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DosBusedasTestt {
	// INICIALIZACION DE VARIABLES
	private WebDriver driver;

	By loc_textB = By.name("q");
	DosBusquedasPage dosbusquedas;
	String actualResult;
	String expectedResult = "github - Buscar con Google";

	// METODO ANTES DE
	@Before
	public void setUp() throws Exception {
		dosbusquedas = new DosBusquedasPage(driver);
		driver = dosbusquedas.chromeDriverConnection();
		driver.manage().window().maximize();
		dosbusquedas.visit("https://www.google.com/");
	}

	// METODO DESPES DE
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	// TEST DONDE SE INVOCA AL LOS METODO dosBusq(),dosBusqq()
	@Test
	public void testdosbusq() throws InterruptedException {
		dosbusquedas.dosBusq();
		driver.findElement(loc_textB).clear();
		dosbusquedas.dosBusqq();
		assertEquals(expectedResult, dosbusquedas.titulo());

	}
}