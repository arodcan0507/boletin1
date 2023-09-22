import java.io.File;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la ruta del directorio a buscar: ");
        String directorio = scanner.nextLine();

        System.out.println("Introduce la extensión de archivo a buscar (sin el punto): ");
        String extension = scanner.nextLine();

        scanner.close();

        buscarArchivosPorExtension(new File(directorio), extension);
    }

    public static void buscarArchivosPorExtension(File directorio, String extension) {
        if (directorio.exists() && directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isFile()) {
                        String nombreArchivo = archivo.getName();
                        if (nombreArchivo.endsWith("." + extension)) {
                            System.out.println("Archivo encontrado: " + archivo.getAbsolutePath());
                        }
                    }
                }
            }
        } else {
            System.out.println("El directorio especificado no existe.");
        }
    }
}
