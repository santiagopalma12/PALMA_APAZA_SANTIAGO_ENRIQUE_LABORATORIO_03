import java.util.*;
public class DemoBatalla {
    public static void main(String[] args) {
        Nave[] misNaves = new Nave[10];
        Scanner sc = new Scanner(System.in);
        String nomb, col;
        int fil, punt;
        boolean est;
        for (int i = 0; i < misNaves.length; i++) {
            System.out.println("Nave " + (i + 1));
            System.out.print("Nombre: ");
            nomb = sc.next();
            System.out.print("Fila: ");
            fil = sc.nextInt();
            System.out.print("Columna: ");
            col = sc.next();
            System.out.print("Estado (true/false): ");
            est = sc.nextBoolean();
            System.out.print("Puntos: ");
            punt = sc.nextInt();
            misNaves[i] = new Nave(); 
            misNaves[i].setNombre(nomb);
            misNaves[i].setFila(fil);
            misNaves[i].setColumna(col);
            misNaves[i].setEstado(est);
            misNaves[i].setPuntos(punt);
        }

        System.out.println("\nNaves creadas:");
        mostrarNaves(misNaves);
       //mostrarPorNombre(misNaves);
       // mostrarPorPuntos(misNaves);
       // System.out.println("\nNave con mayor número de puntos: " + mostrarMayorPuntos(misNaves).getNombre());
    }
    public static void mostrarNaves(Nave[] flota) {
        for (Nave nave : flota) {
            if (nave != null) {
                System.out.println("Nombre: " + nave.getNombre() + ", Fila: " + nave.getFila() +
                        ", Columna: " + nave.getColumna() + ", Estado: " + nave.getEstado() +
                        ", Puntos: " + nave.getPuntos());
            }
        }
    }
 

}