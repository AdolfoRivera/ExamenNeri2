package anagramas;
import java.util.Scanner;
public class classAnagrama {

	public static void main(String[] args) {
		
		Scanner ad=new Scanner(System.in);
		
	/*	String p1="hola";
		String p2="aolh";*/
		String p1;
		String p2;
		System.out.println("Primer palabra");
		p1=ad.nextLine();
		System.out.println("Segunda palabra");
		p2=ad.nextLine();
		
		//VALIDAR SI TIENEN EL MISMO TAMAÑO
		if(p1.length()==p2.length()) {
			//RECORRE EL LARGO DE LA PRIMER PALABRA
			for(int i=0;i<p1.length();i++) {
				//VALIDACION SI LA SEGUNDA PALABRA NO CONTIENE ALGUN CARACTER DE LA PRIMERA NO ES UN ANAGRAMA Y TERMINA
				if(!p2.contains(String.valueOf(p1.charAt(i)))) {
					System.out.println("No es un anagrama");
					return;
				}
			}
			
			//SI PASA ES UN ANAGRAMA
		System.out.println("Si es un anagrama");
		}
		else {
			System.out.println("No son la misma cantidad de caracteres");
		}
		
	}
	
}
