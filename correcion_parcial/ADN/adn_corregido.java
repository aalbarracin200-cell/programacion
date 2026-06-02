package sfd;
import java.util.Scanner;

public class adn_corregido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la secuencia: ");
        String entrada = sc.nextLine();
       
        String adn = entrada.trim().toUpperCase();
        
        int a = 0, t = 0, c = 0, g = 0;
        boolean valida = true;
        
        for (int i = 0; i < adn.length(); i++) {
            char letra = adn.charAt(i);
            
            if (letra == 'A') {
                a++;
            } else if (letra == 'T') {
                t++;
            } else if (letra == 'C') {
                c++;
            } else if (letra == 'G') {
                g++;
            } else {
                valida = false; 
        }
        
        System.out.println("A: " + a);
        System.out.println("T: " + t);
        System.out.println("C: " + c);
        System.out.println("G: " + g);
        
        if (valida) {
            System.out.println("Cadena valida");
        } else {
            System.out.println("Cadena NO valida");
        }
        
        char masFrecuente = 'A';
        int mayor = a;
        
        if (t > mayor) {
            mayor = t;
            masFrecuente = 'T';
        }
        if (c > mayor) {
            mayor = c;
            masFrecuente = 'C';
        }
        if (g > mayor) {
            mayor = g;
            masFrecuente = 'G';
        }
        
        System.out.println("Base mas frecuente: " + masFrecuente);
        
        sc.close();
        }
    }
}