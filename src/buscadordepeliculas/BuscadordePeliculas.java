package buscadordepeliculas;

import java.util.Scanner;

public class BuscadordePeliculas {
    public static void main(String[] args) {
        System.out.println("Catálogo de peliculas románticas.");
        System.out.println("--------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        String[] peliculas ={"Un paseo para recordar", "El diario de Noah", "A él no le gustas tanto", "Sidelined", "Bajo la misma estrella" +
                "","A dos metros de ti", "Ella es así", "10 cosas que odio de ti", "Como perder a un chico en 10 días"};

        boolean contenido = false;
        System.out.println("¿Qué película deseas buscar?");
        String pelicula = sc.nextLine();

        for (int i = 0; i < peliculas.length; i++) {
            if (pelicula.equalsIgnoreCase(peliculas[i])) {
                contenido = true;
                System.out.println("¡Que suerte! " + peliculas[i] + " esta en nuestro catálogo.");
                break;
            }
        }

        if (!contenido) {
            System.out.println("¡Lo lamentamos! " + pelicula + " no se encuentra en nuestro catálogo.");
        }
    }
}
