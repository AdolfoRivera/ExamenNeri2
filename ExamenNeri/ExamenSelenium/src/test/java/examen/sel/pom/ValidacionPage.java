package examen.sel.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidacionPage extends Base {

	private WebDriver driver;

//LOCALIZADORES
	By loc_tex = By.xpath("//input[@name='q' and @aria-label='Buscar']");
	By loc_btn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	By loc_p2 = By.xpath("//a[@aria-label='Page 2' and @class='fl']");
	By loc_titComp = By.xpath("//h3");
	String t1;
	String t2;

	// CONSTRUCTOR
	public ValidacionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// METODO PARA VALIDAR LA SEGUNDA PAGINA DEL BUSCADOR
	public boolean validarSegPage() {

		type("selenium", loc_tex);
		click(loc_btn);
		System.out.println("Clik al btn");
		t1 = getText(loc_titComp);//Toma el titulo de la primer pagina  <h3> Selenium </h3>
		click(loc_p2);
		System.out.println("Clik a la segunda pestaña");
		t2 = getText(loc_titComp);//Toma el titulo de la segunda pagina <h3> Selenium with Python — Selenium </h3>

		// VALIDACION DEL METODO
		if (t1.equals(t2) != true) {
			System.out.println("Primer resutlado de la primer paguina:  <h3> Selenium </h3>");
			System.out.println("Primer resultado de la segunda paguina:  <h3> Selenium with Python — Selenium </h3>");
			System.out.println("Por la tanto se valida que sea diferente el resultado ");
			System.out.println("-------------------------------------------------");
			System.out.println("Es Diferente el resultado");
			return true;
			
		} else{
			System.out.println("Es Igual el resultado");
			return false;
		}
	}

}
