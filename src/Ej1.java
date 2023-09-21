import java.io.File;

public class Ej1 {

    // 1 Realiza un programa que dado un fichero que se le solicite al usuario, muestre su nombre, si
    //es un ejecutable, si está oculto, la ruta relativa, la ruta absoluta y el tamaño.

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        boolean isExecute, isHidden;
        String name, relativePath, absolutePath;
        long sizeFile;

        System.out.print("Introduzca el nombre del fichero: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            name = file.getName();
            isExecute = file.canExecute();
            isHidden = file.isHidden();
            relativePath = file.getPath();
            absolutePath = file.getAbsolutePath();
            sizeFile = file.length();

            System.out.println("Nombre del archivo: " + name);
            System.out.println("Es ejecutable: " + isExecute);
            System.out.println("Está oculto: " + isHidden);
            System.out.println("Ruta relativa: " + relativePath);
            System.out.println("Ruta absoluta: " + absolutePath);
            System.out.println("Tamaño del archivo: " + sizeFile + " bytes");
        } else {
            System.out.println("El archivo no existe.");
        }

        scanner.close();
    }
}