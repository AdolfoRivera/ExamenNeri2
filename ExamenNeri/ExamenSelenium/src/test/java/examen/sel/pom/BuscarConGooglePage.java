package examen.sel.pom;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscarConGooglePage extends Base {
//LOCALIZADORES
	private WebDriver driver;

	By loc_text = By.name("q");
	By loc_page = By.xpath("//img[@src='/logos/doodles/2021/nicanor-parras-107th-birthday-6753651837109264.7-l.png']");
	By loc_btnnn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");

//CONSTRUCTOR
	public BuscarConGooglePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// METODO DE BUSQUEDA
	public void busquedaGoogle() throws InterruptedException {

		type("test", loc_text);
		System.out.println("Se escribio en la caja de texto");

		click(loc_btnnn);
		System.out.println("Se dio click");

	}

	// METODO INVOCAR EL METODO DENTRO DE BASE PARA ESTRAER EL TITULO
	public String tituloP() {
		System.out.println("Se valido el cambio de pagina");
		return obtenerTit();
		

	}

}
