package examen.sel.pom;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class BusquedaImgTest {
// INICIALIZACION DE VARIABLES
	private WebDriver driver;
	BusquedaImgPage buscarimgpage;
	Boolean expectedResult = true;
	Boolean actualResult1;
	Boolean actualResult2;

	// METODO ANTES DE
	@Before
	public void setUp() throws Exception {
		buscarimgpage = new BusquedaImgPage(driver);
		driver = buscarimgpage.chromeDriverConnection();
		driver.manage().window().maximize();
		buscarimgpage.visit("https://www.google.com/");

	}

	// METODO DESPES DE
	@After
	public void tearDown() throws Exception {
		 driver.quit();
	}

	// INVOCACION AL METODO POR MEDIO DEL TEST
	@Test
	public void test() throws InterruptedException {

		actualResult1 = buscarimgpage.compVisVent("Hola mundo");
		//Thread.sleep(1500);
		
		actualResult2 = buscarimgpage.compVisCerr();

		assertEquals(expectedResult, actualResult1);
		assertEquals(expectedResult, actualResult2);

	}

}
