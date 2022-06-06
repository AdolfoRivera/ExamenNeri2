package examen.sel.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MeSientoConSuertePage extends Base {
	// LOCALIZADORES
	private WebDriver driver;
	By loc_text = By.xpath("//input[@name='q' and @aria-label='Buscar']");
	By loc_btn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[2]");
	By loc_comp = By.id("firstHeading");
	

	// CONSTRUCTOR
	public MeSientoConSuertePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// METODO PARA BUSCAR
	public void busquedaConSuerte(String tex) throws InterruptedException {

		type("agua", loc_text);
		System.out.println("Se escribio en la caja de texto");

		click(loc_btn);
		System.out.println("Se dio click");

	}

	// METODO PARA RETORNAR EL TEXTO A COMPARAR
	public String resultComp() {
		System.out.println("Se valido el texto");
		return getText(loc_comp);
	}
}
