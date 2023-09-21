import java.io.File;

public class Ej2 {
    public static void main(String[] args) {

        // Realiza un programa que cree un directorio en el directorio actual, luego cree tres ficheros
        //en dicho directorio donde uno se borre y otro se renombre. Crearle también un subdirectorio con un
        //fichero dentro. Después mostrar la ruta absoluta de ambos directorios y sus contenidos.

        File dirMain = new File("/Users/canete574/Desktop/2ºCFGS_DAM/ACDAT/JAVA_PROJECTS/DIR");

        dirMain.mkdir();
        System.out.println("Directorio creado");

        File file1 = new File(dirMain, "file1.txt");
        File file2 = new File(dirMain, "file2.txt");
        File file3 = new File(dirMain, "file3.txt");


        file1.renameTo(file3);
        file2.delete();

        File subDir = new File("/Users/canete574/Desktop/2ºCFGS_DAM/ACDAT/JAVA_PROJECTS/DIR/SUBDIR");
        File file4 = new File(dirMain, "file4.txt");

        System.out.println(dirMain.getAbsolutePath());
        System.out.println(subDir.getAbsolutePath());

        String[] listado = dirMain.list();
        if (listado == null || listado.length == 0) {
            System.out.println("No hay elementos dentro de la carpeta actual");
            return;
        }
        else {
            for (int i=0; i< listado.length; i++) {
                System.out.println(listado[i]);
            }
        }
    }
}
