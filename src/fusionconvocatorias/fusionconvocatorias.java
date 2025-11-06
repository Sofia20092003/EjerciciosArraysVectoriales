package fusionconvocatorias;

import java.util.Arrays;

public class fusionconvocatorias {
    public static void main(String[] args) {
        String[] jugadores1 = {"Messi", "Suarez", "Neymar"};
        String[] jugadores2 = {"Xavi", "Iniesta"};
        String[] convocatorias = {"Messi", "Suarez", "Neymar", "Xavi", "Iniesta"};

        System.out.println("Fusión de Convocatoria");
        System.out.println("------------------------------------");
        System.out.println("Equipo A:" + Arrays.toString(jugadores1));
        System.out.println("Equipo B:" + Arrays.toString(jugadores2));
        System.out.println("Equipo Fusión:" + Arrays.toString(convocatorias));
    }
}
