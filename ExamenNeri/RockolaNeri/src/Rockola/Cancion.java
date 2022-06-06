package Rockola;

public class Cancion {

//VARIABLES NECESARIAS
	protected String nombre_cancion;
	protected String autor;
	//CONSTRUCTOR SOBRECARGADO
	public Cancion(String nombre_cancion, String autor) {
		this.nombre_cancion=nombre_cancion;
		this.autor=autor;
	}
	// METODS GET DE RETIRNO DE INF
    public String getNombre_Cancion(){
        return nombre_cancion;
    }
	
    public String getAutor(){
        return autor;
    }
	
}
