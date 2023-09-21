
import java.util.Scanner;
import java.io.File;

public class Ej3 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Introduce la ruta del directorio que deseas explorar: ");
        String directorio = scanner.nextLine();
        scanner.close();
        File directory = new File(directorio);
        explorarDirectorio(directory);
    }

    public static void explorarDirectorio(File directory) {
        if (directory.exists() && directory.isDirectory()) {
            File[] contenido = directory.listFiles();

            for (File elemento : contenido) {
                if (elemento.isDirectory()) {
                    System.out.println("Directorio: " + elemento.getAbsolutePath());
                } else {
                    System.out.println("Archivo: " + elemento.getAbsolutePath());
                }
            }
        } else {
            System.out.println("El ruta no es un directorio");
        }
    }
}