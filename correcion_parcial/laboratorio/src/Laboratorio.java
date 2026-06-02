package correcion;

/* Un laboratorio registra temperaturas durante 7 dias
 * 
 * el sistema debe:
 * 
 * calcular promedio
 * indicar temperatura mas baja
 * mostrar cuantas temperaturas fueron mayores a 30°
 * 
 * el siguiente codigo tiene errores. 
 * 
 * corrija, explique los errores encontrados y el programa deve ejecutarse correctamente
 */

import java.util.Scanner; 

public class Laboratorio { /* la clase se deve llamar igual que el archivo en el que se esta trabajando en este caso el achivo se llama "Laboratorio"
de  otro modo al ejecutarse el programa no encontrara donde esta el archivo
                            */
	
	public static void main(String[] arg) { 
		
		Scanner sc = new Scanner(System.in);
		
		
		int suma = 0;
		
		int menor = 29; /* si la variable "menor" es 0 significaria que la temperatura siempre sera <=0
		 por lo que se utiliza un numero mas grande para evitar este tipo de inconvenientes*/
		 
		int contador = 0;
		
		
		for(int i=1;i<=7; i++) {
			System.out.println("Ingrese temperatura");
			
			int temp = sc.nextInt(); /* aqui se deve cambiar el "String" por "int" para que la opracion sea posible y ambos valores sean numeros 
			 por lo tanto tambien se deve cambiar la instruccion despues del signo "=" para que tenga sentido  */
			
			suma = suma + temp ;
			
			
			
			if(temp > 30) {
				contador++;
				
			}
			
	}

		int promedio = suma / 7; 
		
		System.out.println("el promedio de la temperatura es igual a:" + promedio);
		System.out.println("la temperatura mas baja es de : " + menor);
		System.out.println("las temperaturas que pasaron los 30° son :" + contador);
		
}
		
}
