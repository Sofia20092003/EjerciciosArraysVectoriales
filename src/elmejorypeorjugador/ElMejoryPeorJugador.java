package elmejorypeorjugador;

import java.util.Scanner;

public class ElMejoryPeorJugador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("¿Cuántas puntuaciones de jugadores desea comparar?");
        int cantidad = sc.nextInt();
        sc.nextLine();

        int[] puntuaciones = new int[cantidad];

        for (int i=0; i<cantidad; i++) {
            System.out.print("Puntuacion "+(i+1)+": ");
            puntuaciones[i]=sc.nextInt();
        }

        int mayor = puntuaciones[0];
        int menor = puntuaciones[0];

        for (int i=1; i< puntuaciones.length; i++) {
            if (puntuaciones[i] > mayor) {
                mayor = puntuaciones[i];
            }
            if (puntuaciones[i] < menor) {
                menor = puntuaciones[i];
            }
        }
        System.out.println("La puntuación más alta es (MVP): "+mayor);
        System.out.println("La puntuación más baja es: "+menor);
    }
}
