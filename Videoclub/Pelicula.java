package Videoclub;

import JukeBox.Cancion;

public class Pelicula implements Comparable <Pelicula> {
	
	private String titulo;
	private String Genero;
	private String director;
	private int a�o;
	private  int id;
	private static int idnext=1;
	


	public Pelicula (String titulo, String Genero, String director, int a�o) {
		
		
		this.titulo = titulo;
		this.Genero = Genero;
		this.director = director;
		this.a�o = a�o;
		
		id = idnext;
		idnext++;
		
		}
	
	
	static void imprimir(Pelicula[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("numero de id-> "+ array[i].id+" T�tulo-> " + array[i].titulo + ", Genero--> " + array[i].Genero + ", El director es-> " + array[i].director + ", a�o --> " + array[i].a�o);
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		}


	static void imprimiraccion(Pelicula[] array) {
	
		for(int i=0; i<array.length; i++) {
			if (array[i].Genero.equalsIgnoreCase("Accion")){
			System.out.println("numero de id-> "+ array[i].id+" T�tulo-> " + array[i].titulo + ", Genero--> " + array[i].Genero + ", El director es-> " + array[i].director + ", a�o --> " + array[i].a�o);
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		}
		}


	static void imprimirterror(Pelicula[] array) {
		
		for(int i=0; i<array.length; i++) {
			if (array[i].Genero.equalsIgnoreCase("Terror")){
			System.out.println("numero de id-> "+ array[i].id+" T�tulo-> " + array[i].titulo + ", Genero--> " + array[i].Genero + ", El director es-> " + array[i].director + ", a�o --> " + array[i].a�o);
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		}
		}
	
	
	static void imprimirinfantil(Pelicula[] array) {
		
		for(int i=0; i<array.length; i++) {
			if (array[i].Genero.equalsIgnoreCase("Infantil")){
			System.out.println("numero de id-> "+ array[i].id+" T�tulo-> " + array[i].titulo + ", Genero--> " + array[i].Genero + ", El director es-> " + array[i].director + ", a�o --> " + array[i].a�o);
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		}
		}
	
	
	static void imprimirromantico(Pelicula[] array) {
		
		for(int i=0; i<array.length; i++) {
			if (array[i].Genero.equalsIgnoreCase("Romantica")){
			System.out.println("numero de id-> "+ array[i].id+" T�tulo-> " + array[i].titulo + ", Genero--> " + array[i].Genero + ", El director es-> " + array[i].director + ", a�o --> " + array[i].a�o);
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		}
		}
	
	public int compareTo (Pelicula pelicula) {
		
		if(a�o<pelicula.a�o) {
			return -1;
		}
		
		if(a�o>pelicula.a�o) {
			return 1;
		}
		
		return 0;
		}
	

}
