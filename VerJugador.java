package Jugador;
import java.util.*;
public class VerJugador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner  (System.in);
		
		Jugador jugador1 = new Jugador (190,108,"Jose",10,"Betis", "Delantero");
		Jugador jugador2 = new Jugador (187,99,"Benzema",9,"Madrid", "Delantero");
		Jugador jugador3 = new Jugador (190,77,"Jose",8,"Betis", "Centrocampista");
		Jugador jugador4 = new Jugador (175,75,"Mariano",3,"Barcelona", "Defensa");
		Jugador jugador5 = new Jugador (177,76,"Rodrigo",12,"Valencia", "Delantero");
		Jugador jugador6 = new Jugador (180,77,"Gameiro",9,"Sevilla", "Delantero");
		Jugador jugador7 = new Jugador (187,86,"Cristiano",7,"Madrid", "Delantero");
		Jugador jugador8 = new Jugador (170,70,"Messi",10,"Barcelona", "Delantero");
		Jugador jugador9 = new Jugador (187,90,"Suarez",9,"Barcelona", "Delantero");
		Jugador jugador10 = new Jugador (187,91,"Banega",5,"Sevilla", "Centrocampista");
		
		System.out.println(jugador1.toString()+"\n");
		System.out.println(jugador2.toString()+"\n");
		System.out.println(jugador3.toString()+"\n");
		System.out.println(jugador4.toString()+"\n");
		System.out.println(jugador5.toString()+"\n");
		System.out.println(jugador6.toString()+"\n");
		System.out.println(jugador7.toString()+"\n");
		System.out.println(jugador8.toString()+"\n");
		System.out.println(jugador9.toString()+"\n");
		System.out.println(jugador10.toString()+"\n");
		
	}

}
