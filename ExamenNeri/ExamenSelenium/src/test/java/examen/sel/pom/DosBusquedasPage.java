package examen.sel.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DosBusquedasPage extends Base {

	// LOCALIZADORES
	private WebDriver driver;

	By loc_text = By.name("q");
	By loc_btn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	By loc_textB = By.name("q");
	By loc_lup = By.xpath("//button[@jsname='Tg7LZd' and @aria-label='Buscar con Google']");
	By loc_Comp = By.xpath("q");

	// CONSTRUCTOR
	public DosBusquedasPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// METODO DE PRIMER BUSQUEDA
	public void dosBusq() throws InterruptedException {

		type("test", loc_text);
		System.out.println("Se escribio en la caja de texto");

		click(loc_btn);
		System.out.println("Se dio click");
		System.out.println("Primer busqueda OK");
		

	}

	// METODO DE SEGUNDA BUSQUEDA
	public void dosBusqq() {
		type("github", loc_textB);
		System.out.println("Se escribio en la caja de texto");

		click(loc_lup);
		System.out.println("Se dio click");
		System.out.println("Segunda busqueda OK");
	}

	// METODO PARA EXTRAER EL TITULO
	public String titulo() {
		System.out.println("Es Correcto el titulo se valida la seg busqueda");
		return obtenerTit();
	}

}
