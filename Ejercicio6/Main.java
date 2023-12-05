package Ejercicio6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] stringArray1 = {"Uno", "Dos", "Tres"};
        String[] stringArray2 = {"Dos", "Tres", "Cuatro"};
        System.out.println(Arrays.toString(copyArray(stringArray1, stringArray2)));

        Producto[] productos1 = {
            new Producto("001", "Producto 1", 100.0),
            new Producto("002", "Producto 2", 200.0)
        };
        Producto[] productos2 = {
            new Producto("002", "Producto 2", 200.0),
            new Producto("003", "Producto 3", 300.0)
        };
        System.out.println(Arrays.toString(copyArray(productos1, productos2)));

        Persona[] personas1 = {
            new Persona("12345678", "Juan Perez", "Av. Miguel Grau 123"),
            new Persona("87654321", "Maria Lopez", "Av. Ormeño 321")
        };
        Persona[] personas2 = {
            new Persona("87654321", "Maria Lopez", "Av. Ormeño 321"),
            new Persona("23456789", "Pedro Martinez", "Av. Miguel Grau 123")
        };
        System.out.println(Arrays.toString(copyArray(personas1, personas2)));
    }

    public static <T> T[] copyArray(T[] array1, T[] array2) {
        Set<T> set = new HashSet<>();
        set.addAll(Arrays.asList(array1));
        set.addAll(Arrays.asList(array2));
        return (T[]) set.toArray();
    }
}