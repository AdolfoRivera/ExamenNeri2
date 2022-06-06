package examen.sel.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusquedaImgPage extends Base {

	private WebDriver driver;

	// CONSTRUCTOR
	public BusquedaImgPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// LOCALIZADORES
	By loc_tex = By.xpath("//input[@name='q' and @aria-label='Buscar']");
	By loc_btn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	By loc_btnimgg = By.xpath("//a[text()=\"Imágenes\"] ");
	By loc_img1 = By.xpath("//img[@jsname='Q4LuWd' and @alt='Hola mundo - Wikipedia, la enciclopedia libre']");
	By loc_txtImgVis = By.xpath("//div[ @class='eYbsle' and text()='Hola mundo - Wikipedia, la enciclopedia libre']");
	By loc_cerr = By.className("hm60ue");

	// METODO PARA BUSCAR Y COMPROBAR TEXTO
	public boolean compVisVent(String texto) {
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		type(texto, loc_tex);
		click(loc_btn);
		System.out.println("Busqueda hola mundo");
		click(loc_btnimgg);
		System.out.println("clik en pestaña img");
		click(loc_img1);
		System.out.println("clic en img");
		
		if (getText(loc_txtImgVis).equals("Hola mundo - Wikipedia, la enciclopedia libre")) {
			System.out.println("Valido que se encuentre dentro de la ventana de visualizacion");
			return true;
		} else {
			return false;
		}
	}

	// METODO PARA COMPROBAR CIERRE DE VISUALIZACION
	public boolean compVisCerr() throws InterruptedException {
		    System.out.println("1");		
		    Thread.sleep(1500);
			System.out.println("2");
		    click(loc_cerr);
		    System.out.println("clic en cerrar img");
		    
		if (isDisplayed(loc_txtImgVis) != true) {
			System.out.println("True Se cerro la ventana");
			return true;
		} else {
			System.out.println("false no se cerro la ventana");
			return false;
		}

	}
}

