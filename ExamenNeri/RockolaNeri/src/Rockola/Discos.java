package Rockola;

public class Discos extends Cancion{

	//VARIABLES
	private int id;
	private String nombre;
	private String genero;
	private int año;
	private int numero_cancion;
	//COSTRUCTOR SOBRECARGADO CON LAS VARIABLES DE SU CLASE Y LAS QUE SE EXTIENDEN DE LA CLASE CANCION
	public Discos(int id, String nombre, String genero, int numero_cancion, int año, String nombre_cancion,String autor) {
		super(nombre_cancion,autor);
		this.id = id;
		this.nombre=nombre;
		this.genero=genero;
		this.numero_cancion=numero_cancion;
		this.año=año;
	}
	   //METODOS GET Y SET PARA EL RETIRNO DE LA INF
   public int getId() {
		return id;
	}
   	//--
	public void setId(int id) {
		this.id = id;
	}
	//--
	public void setGenero(String gen){
    	this.genero=gen;
    }
    //--
    public String getGenero(){
        return genero;
    }
    //--
    public void setNombre(String nom){
    	this.nombre=nom;
    }
    //--
   public String getNombre(){
       return nombre;
    }
    //--
    public void setNumero_Cancion(int num_can){
    	this.numero_cancion=num_can;
    }
    //--
    public int getNumero_Cancion(){
        return numero_cancion;
    }
    //--
    public void setAño(int año){
    	this.año=año;
    }
    //--
    public int getAño(){
        return año;
    }
    //METODO PARA RETORNAR EL DISCO GUARDADO
	public String mostrarDiscoAgregado() {
		return "\n ----------DISCO GUARDADO----------:"+"\n"+
		"ID: " + getId()+"\n"+
	    "NOMBRE: "+getNombre()+"\n"+
	    "GENERO: "+getGenero()+"\n"+
	    "NUMERO DE CANCIONES: "+getNumero_Cancion()+"\n"+
	    "A�O DE LANZAMIENTO: "+getAño()+"\n"+
		"SU EXITO ES: "+nombre_cancion+"\n"+
		"SU AUTOR ES: "+autor+"\n"+
		"\n ##--##--##--##--##--##--##--##--##--:"+"\n";
		
	}
}
