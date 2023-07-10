import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /**
     * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
     *
     * Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
     *
     * Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
     *
     * Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
     *
     * Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
     *
     * Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
     *
     * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
     *
     * Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
     *
     * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
     *
     * Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
     * @param args
     */
    static String aster = "******************************************************";
    public static void main(String[] args) {
        reverse("Hola mundo");
        arrayUnidimensional();
        arrayBidimensional();
        usoVector();
        utilizandoArrayList();
        rellenandoInts();
        try {
            divideCero(4,0);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse!");
        } finally {
            System.out.println("Demo de codigo");
        }
        funcionInputOuput("C:\\Users\\Andreu\\IdeaProjects\\hola.txt", "C:\\Users\\Andreu\\IdeaProjects\\adios.txt");
    }
    public static String reverse(String texto){
        System.out.println(aster);
        String invertida = "";
        for( int i = texto.length() - 1; i >=0; i--) {
            invertida += texto.charAt(i);
        }
        System.out.println("Cadena original " + texto);
        System.out.println("Cadena invertida " + invertida);
        return invertida;
    }
    public static void arrayUnidimensional() {
        System.out.println(aster);
        String arrayUni[] = {"Andreu", "Luis", "Josepp"};
        for(String array : arrayUni) {
            System.out.println("Mostrando valor array Unidimensional: " + array);
        }
    }
    public static void arrayBidimensional(){
        System.out.println(aster);
        int arrayBi[][] = {{1, 1, 1, 1}, {2,2,2,2}};
        for(int i = 0; i < arrayBi.length; i++){
            if(i < 1) {
                System.out.println("Filas:");
            } else {
                System.out.println("Columnas:");
            }

            for (int j = 0; j < arrayBi[i].length; j++){
                System.out.println("Posicion " + j + " Valor " + arrayBi[i][j]);
            }
        }
    }
    public static void usoVector() {
        System.out.println(aster);
        Vector<Integer> vectorA = new Vector();
        vectorA.add(1);
        vectorA.add(2);
        vectorA.add(3);
        vectorA.add(4);
        vectorA.add(5);
        System.out.println("Agregado al vector " + vectorA.size() + " integers " + vectorA  );
        vectorA.remove(1);
        vectorA.remove(1);
        System.out.println("Eliminando el segundo y tercer elemento " + vectorA);
        //* Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        System.out.println("El problema de utilizar un vector con la capacidad por defecto y añadir 1000 elementos es que cada vez que superamos la capacidad por defecto se utiliza mucha carga en el dispositivo por ir copiando el array al subarray. \nLentitud y gasto de energia. \nMejor poner la capacidad del vector mas especifica.");

    }
    public static void utilizandoArrayList() {
        System.out.println(aster);
        ArrayList<String> arrayListA = new ArrayList<String>();
        arrayListA.add("Hola");
        arrayListA.add("como");
        arrayListA.add("estas");
        arrayListA.add("brother?");
        LinkedList<String> linkedListA = new LinkedList<>(arrayListA);
        for( String linked : linkedListA) {
            System.out.println(linked);
        }
        for (String array : arrayListA){
            System.out.println(array);
        }
    }
    public static void rellenandoInts() {
        System.out.println(aster);
        ArrayList<Integer> integersArray = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            integersArray.add(i);
        }
        System.out.println(integersArray);
        for(int i = 0; i <= integersArray.size(); i++) {
            if (integersArray.get(i) % 2 == 0){
                integersArray.remove(i);
            }
        }
        System.out.println(integersArray);
    }
    public static int divideCero(int a, int b) throws ArithmeticException {
        System.out.println(aster);
        return a / b;
    }
     // * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

    public static void funcionInputOuput(String fileIn, String fileOut) {
        try{
            InputStream archivoLocal = new FileInputStream(fileIn);
            byte datos[] = archivoLocal.readAllBytes();
            PrintStream destino = new PrintStream(fileOut);
            destino.write(datos);

        } catch ( Exception e) {
            System.out.println(e.getMessage());
        }

    }
}