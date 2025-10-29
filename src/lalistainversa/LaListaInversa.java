package lalistainversa;

import java.util.Scanner;

public class LaListaInversa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos nombres quiere guardar?");
        int cantidadNombres= teclado.nextInt();
        teclado.nextLine();
        String[] nombres = new String[cantidadNombres];
        System.out.println("Introduce los "+cantidadNombres+" nombres quiere guardar.");
        for (int i = 0; i < cantidadNombres; i++) {
            System.out.print("Nombre " +(i+1)+ ": ");
            nombres[i] = teclado.nextLine();
        }

        System.out.println("------Lista en orden Inverso------");
        for (int i=cantidadNombres-1; i>=0; i--) {
            System.out.println("Posición " +(i)+": "+nombres[i]);
        }
    }
}
