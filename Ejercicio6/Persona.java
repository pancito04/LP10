package Ejercicio6;

public class Persona {
    private String dni;
    private String nombres;
    private String direccion;
    // Constructor
    Persona(String dni, String nombres, String direccion) {
        this.dni = dni;
        this.nombres = nombres;
        this.direccion = direccion;
    }
    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return dni.equals(persona.dni);
    }

    @Override
    public int hashCode() {
        return dni.hashCode();
    }
}