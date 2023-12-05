package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        System.out.println(buscar(integerArray, 3)); // 2
        System.out.println(buscar(doubleArray, 4.4)); // 3
        System.out.println(buscar(integerArray, 6)); // -1
        System.out.println(buscar(doubleArray, 6.6)); // -1
    }

    public static <T extends Number> int buscar(T[] array, T elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
}