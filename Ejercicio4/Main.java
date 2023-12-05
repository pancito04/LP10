package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = {
            new Producto("001", "Producto 1", 100.0),
            new Producto("002", "Producto 2", 200.0),
            new Producto("003", "Producto 3", 300.0)
        };
        Persona[] personas = {
            new Persona("12345678", "Juan Perez", "Av. Venezuela 123"),
            new Persona("87654321", "Maria Lopez", "Av. Miguel Grau 321")
        };
        Estudiante[] estudiantes = {
            new Estudiante("12345678", "Juan Perez", "Av. Venezuela 123", "Ingeniería"),
            new Estudiante("87654321", "Maria Lopez", "Av. Miguel Grau 321", "Medicina")
        };

        System.out.println(buscar(productos, new Producto("002", "", 0.0)));
        System.out.println(buscar(personas, new Persona("", "Maria Lopez", "")));
        System.out.println(buscar(estudiantes, new Estudiante("", "Maria Lopez", "", "Medicina")));
    }

    public static <T> int buscar(T[] array, T elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
}