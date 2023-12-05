package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        System.out.println(isEqualTo(1, 1)); // true
        System.out.println(isEqualTo(1.0, 1.0)); // true
        System.out.println(isEqualTo("hola", "hola")); // true
        System.out.println(isEqualTo(new Object(), new Object())); // false
    }

    public static <T> boolean isEqualTo(T obj1, T obj2) {
        return obj1.equals(obj2);
    }
}