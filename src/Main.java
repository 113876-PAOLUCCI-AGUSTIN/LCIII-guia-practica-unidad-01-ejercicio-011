/*
 * 11. Ingresar el tiempo en segundos que realizó el ganador de la clasificación de una carrera de F1.
 * Luego ingresar los tiempos de los otros 9 corredores e * informar cuántos disputarán la carrera.
 * Para que un corredor pueda participar su tiempo de clasificación no puede superar en 15 % al del ganador.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // INPUT
        System.out.println("Ingrese el tiempo en segundos del piloto ganador de la clasificación...");
        Scanner input = new Scanner(System.in);
        Double tiempoGanador = input.nextDouble();

        while(tiempoGanador < 0){
            System.out.println("No puede ingresar un tiempo negativo...");
            tiempoGanador = input.nextDouble();
        }

        System.out.println("Ingrese el tiempo en segundos de los restantes 9 pilotos...");
        Double[] restantesTiempos = new Double[9];

        int contadorClasificados = 0;
        for (int i = 0; i < restantesTiempos.length; i++) {
            Scanner ingreso = new Scanner(System.in);
            Double tiempo = ingreso.nextDouble();
            restantesTiempos[i] = tiempo;
            if (tiempo < tiempoGanador*1.15) {
                contadorClasificados += 1;
            }
        }
        // OUTPUT:
        System.out.println("El corte de la clasificación fue: "+tiempoGanador*1.15 + "segundos.");
        System.out.println("Disputaran la carrera solamente: "+contadorClasificados+ " pilotos.");
    }
}