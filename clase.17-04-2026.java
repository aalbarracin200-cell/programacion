package hola;

import java.util.Scanner;

public class hello {
	
	public static int mostrarMenu() {
		Scanner leer = new Scanner(System.in);
		System.out.println("------menu------");
		System.out.println("1. ingrese datos");
		System.out.println("2. muestre datos");
		System.out.println("3. salir");
		return leer.nextInt();
	}
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opcion = 0 ;
		boolean control = true;
		while (control) { 
			
			opcion = mostrarMenu();
			
			if (opcion == 1) {
				System.out.println("cual es tu nombre");
				String nombre = leer.nextLine();
				System.out.println("cual es tu edad?");
				String edad = leer.nextLine();
			}
			else {
				
			if (opcion ==2) { 
				System.out.print("tu nombre es" + nombre);
				System.out.print("tu edad es" + edad);
				
			}
			
			if (opcion ==3) {
				
			}
		
			
			opcion = mostrarMenu()
		}
}

	#el alcanse de las fuciones va hasta donde cierra el corchete
