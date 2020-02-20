package Jugador;

public class Jugador {
	
	private String Equipo;
	private String Demarcacion;
	private int Altura;
	private int Peso;
	private String Nombre;
	private int Dorsal;
	private float Sueldo = 1000000;
	
	public Jugador (int Altura, int Peso, String Nombre, int Dorsal, String Equipo, String Demarcacion ) {
		
		this.Equipo = Equipo;
		this.Demarcacion = Demarcacion;
		this.Nombre = Nombre;
		this.Dorsal = Dorsal; 
		this.Altura = Altura;
		this.Peso = Peso;
		
		if (Equipo.equalsIgnoreCase("Madrid") || Equipo.equalsIgnoreCase("Barcelona") || Equipo.equalsIgnoreCase("Atletico") || Equipo.equalsIgnoreCase("Valencia")) {
			Sueldo *=  4;
		}
		
		if (Equipo.equalsIgnoreCase("Betis") || Equipo.equalsIgnoreCase("Sevilla") || Equipo.equalsIgnoreCase("Getafe") || Equipo.equalsIgnoreCase("Bilbao") || Equipo.equalsIgnoreCase("Girona") || Equipo.equalsIgnoreCase("Villareal")) {
			Sueldo *=  2.5;
		}
		
		if (Equipo.equalsIgnoreCase("Celta") || Equipo.equalsIgnoreCase("Realsociedad") || Equipo.equalsIgnoreCase("Espanyol") || Equipo.equalsIgnoreCase("Leganes") || Equipo.equalsIgnoreCase("Levante")) {
			Sueldo *=  1.5;
		}
		
		if (Equipo.equalsIgnoreCase("Osasuna") || Equipo.equalsIgnoreCase("Granada") || Equipo.equalsIgnoreCase("RayoVallecano") || Equipo.equalsIgnoreCase("Mallorca") || Equipo.equalsIgnoreCase("Mirandes")) {
			Sueldo = Sueldo;
		}
		
		if(Demarcacion.equalsIgnoreCase("Delantero")) {
			Sueldo*=2.4;
		}
		
		if(Demarcacion.equalsIgnoreCase("Centrocampista")) {
			Sueldo*=1.8;
		}
		
		if(Demarcacion.equalsIgnoreCase("Defensa") || Demarcacion.equalsIgnoreCase("Portero")) {
			Sueldo*=1;
		}
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "El jugador es del -> " + Equipo + ", Juega de -> " + Demarcacion + ", Mide un total de = " + Altura + " CM y Pesa -> " + Peso
				+ ", Se llama " + Nombre + " y su Dorsal es " + Dorsal + ", Además Gana la friolera de -> " + Sueldo ;
	}

	
}
