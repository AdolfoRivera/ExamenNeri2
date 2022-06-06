package Rockola;
import java.util.ArrayList;
	import java.util.InputMismatchException;
	import java.util.List;
	import java.util.Scanner;
	import java.util.stream.Collectors;
public class MainRockola {

	public static void main (String [] args) {
		
		Scanner ad = new Scanner(System.in);
		//VARIABLES QUE SE OCUPAN
		String nombre;
		String genero;
		String exito;
		String autor;
		int id;
		int numero_canciones;
		int anio;
		int duracion;
		int cantidad;
		int op=0;
		//LISTA DE TIPO CLASE DISCOS
		List<Discos> discos = new ArrayList<Discos>();
		
		//BUCLE PARA EL MENU
		do {
		System.out.println("\n#####ROCKOLA DE EXITOS##### \n"+"#1 = AGREGAR \n"+"#2 = ELIMINAR \n"+"#3 = REPRODUCIR\n"+"#4 = SALIR DE LA ROCKOLA");
		op = ad.nextInt();
		
		//CONDICIONALES DEL MENU
		switch(op) {
			case 1:
				//CUANTOS DISCOS DESEAS AGREGAR
			System.out.println("CUANTOS DISCOS DESEAS AGREGAR");
			cantidad = ad.nextInt();
			//FOR PARA RECORER TODAS LAS VARIABLES SOLICITADAS
			 	for(int i=0; i < cantidad ; i++) {
					System.out.println("#DATOS GENERALES DEL DISCO#"+i+1);
					System.out.println("ID DISCO");
					id = ad.nextInt();
					System.out.println("NOMBRE");
					nombre = ad.next();
					System.out.println("GENERO");
					genero = ad.next();
					System.out.println("CANCION");
					exito = ad.next();
					System.out.println("AUTOR");
					autor = ad.next();
					System.out.println("NUMERO DE CANCIONES");
					numero_canciones = ad.nextInt();
					System.out.println("A�O DE LANZAMIENTO");
					anio = ad.nextInt();
					//AREGLO DE OBJETOS DE TIPO DISCO
					Discos disc = new Discos(id, nombre, genero, numero_canciones,anio,exito,autor);
					discos.add(disc);
					//MUESTRA LA INF GUARDADA EN EL AREGLO
					System.out.println(disc.mostrarDiscoAgregado());
				}
			break; 
			case 2:
				//CONDICIONAL PARA VALIDAR SI EL DISCO SE ENCUENTRA 
				  if(discos.isEmpty()) {
					  System.out.print("NO HAY DISCOS EN LA ROCKOLA\n");
					  break;
				  } else  {
					  //METODO PARA BORRAR DISCO USAMOS UNAS AYUDAS DE JAVA 8 PARA HACERLO MAS FACIL Y AHORARNOS LINEAS DE CODIGO
					  System.out.println("ID DE DISCO A BORRAR");
					  int idTemp = ad.nextInt();
					  //LISTA DE TIPO CLASE DISCO PARA DETERMINAR SI LA ID INGRESADA COINCIDE CON LA GUARDADA TEMPORALMENTE
					  List<Discos> discTemp = discos.stream().filter(disc -> disc.getId() == idTemp).collect(Collectors.toList());
					  if(discTemp.isEmpty() ) {
						  //EL ID NO SE ENCONTRO 
						  System.err.println("DISCO INEXISTENTE");
					  } else {
						 //SI EL ID COINCIDE SE PROCEDE A ELIMINAR
						  discos = discos.stream().filter(disc -> disc.getId() != idTemp).collect(Collectors.toList());
						  System.out.println("EL DISCO SE ELIMINO CON EXITO");
					  }
				   }
			 break;
			case 3 :
				//CONDICIONAL PARA VALIDAR SI EL DISCO SE ENCUENTRA
				  if(discos.isEmpty()) {
					  System.out.print("EL DISCO NO SE ENCUENTRA\n");
					  break;
				  } else  {
					  //INGRESAMOS LA ID
					  System.out.println("ID DEL DISCO");
					  int idTemp = ad.nextInt();
					  //LISTA DE TIPO CLASE DISCO NOS DICE SI LA ID INGRESADA COINCIDE CON LA EXISTENTE
					  List<Discos> discTemp = discos.stream().filter(disc -> disc.getId() == idTemp).collect(Collectors.toList());
					  if(discTemp.isEmpty() ) {
						  //LA ID NO COINCIDE
						  System.err.println("NO EXISTE EL DISCO");
					  } else {
						  //SI COINCIDE PONE EN REPRODUCION LA CANCION
						  System.out.println("DISCO--->\t" + discTemp.get(0).getNombre() + "\tEN REPRODUCION");
					  }
				   }
				  
			break;
			
			case 4:
				//CASE PARA SALIR DE LA ROCKOLA
				System.out.println("#####SALIENDO DE ROKOLA#####");
				break;
			}
		//CONDICION PARA LAS OPCIONES DEL MENU
		}while(op<=3);
	    
	}
}
