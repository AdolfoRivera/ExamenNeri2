package examen.sel.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class BusquedaConSuerteTestt {

	private WebDriver driver;
	// INICIALIZACION DE VARIABLES
	MeSientoConSuertePage mesientoconsuertepage;
	String actualResult;
	String expectedResult = "Agua";

	// METODO ANTES DE
	@Before
	public void setUp() throws Exception {
		mesientoconsuertepage = new MeSientoConSuertePage(driver);
		driver = mesientoconsuertepage.chromeDriverConnection();
		driver.manage().window().maximize();
		mesientoconsuertepage.visit("https://www.google.com/");
	}

	// METODO DESPUES DE
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	// INVOCACION AL METODO .busquedaConSuerte DENTRO DEL TEST
	@Test
	public void textBuscarSuerte() throws InterruptedException {
		mesientoconsuertepage.busquedaConSuerte("Agua");
		assertEquals(expectedResult, mesientoconsuertepage.resultComp());
	}
}