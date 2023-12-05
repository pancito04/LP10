package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};
        imprimirArray(stringArray);
    }

    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.println(elemento);
        }
    }

    public static void imprimirArray(String[] array) {
        int contador = 0;
        for (String elemento : array) {
            System.out.print(elemento + "\t");
            contador++;
            if (contador % 4 == 0) {
                System.out.println();
            }
        }
    }
}