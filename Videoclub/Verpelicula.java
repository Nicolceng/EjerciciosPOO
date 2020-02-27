package Videoclub;

import java.util.Arrays;

import javax.swing.JOptionPane;

import JukeBox.Cancion;

public class Verpelicula {

		public static void main(String[] args) {
		
		Pelicula pelicula[] = new Pelicula [10];
		
		pelicula[0] = new Pelicula ("Joker", "Accion", "Steven Spielberg", 2019);
		pelicula[1] = new Pelicula ("Vengadores", "Accion", "Robina", 2020);
		pelicula[2] = new Pelicula ("La purga", "Terror", "Sapo", 2016);
		pelicula[3] = new Pelicula ("Titanic", "Romantica", "Sapo2", 1950);
		pelicula[4] = new Pelicula ("Doctor Strange", "Accion", "Sapo3", 2016);
		pelicula[5] = new Pelicula ("Lilo y Stich", "Accion", "Steven Spielberg", 2000);
		pelicula[6] = new Pelicula ("Monstruos SA", "Infantil", "Robina", 2003);
		pelicula[7] = new Pelicula ("La purga 2", "Terror", "Sapo4", 2018);
		pelicula[8] = new Pelicula ("IT", "Terror", "Sapo5", 2017);
		pelicula[9] = new Pelicula ("IT 2", "Terror", "Sapo6", 2019);
		
		String opcion=JOptionPane.showInputDialog("0.Salir del programa 1.Mostrar sin ordenar 2. Ordenador por duracion, 3. Genero accion 4. Genero Terror 5.Genero infantil 6.Genero Romantico");
		switch (opcion) {
		
		
		case "0": 
		
		System.out.println("HA SALIDO DEL VIDEOCLUB");
		System.exit(0);
		break;
		
		case "1":
		pelicula[0].imprimir(pelicula);
		break;
			
			
		case "2":
			
		Arrays.sort(pelicula);
		pelicula[0].imprimir(pelicula);
		break;
		
		case "3": 
		pelicula[0].imprimiraccion(pelicula);
		break;
		
		case "4": 
		pelicula[0].imprimirterror(pelicula);
		break;
			
		case "5": 
		pelicula[0].imprimirinfantil(pelicula);
		break;
			
		case "6": 
		pelicula[0].imprimirromantico(pelicula);
		break;
		
}
		
}

}
