package examen.sel.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ValidacionPageTest {
	
	private WebDriver driver;
	ValidacionPage validacionPageTest;
	boolean expectedResult=true;
	boolean actualResult;
	
	@Before
	public void setUp() throws Exception {
		validacionPageTest=new ValidacionPage(driver);
		driver = validacionPageTest.chromeDriverConnection();
		driver.manage().window().maximize();
		validacionPageTest.visit("https://www.google.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		//assertEquals(expectedResult,validacionPageTest.validarSegPage("test"));
		Assert.assertTrue(validacionPageTest.validarSegPage());
	}

}
