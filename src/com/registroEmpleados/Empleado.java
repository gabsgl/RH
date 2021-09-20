package com.registroEmpleados;

public class Empleado {
    private String nombre;
    private String apellido;
    private String fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        if (!n.isEmpty())
            nombre = n;
    }

    public void setNombreCompleto(String nombreCompleto) {
        String[] partes = nombreCompleto.split(" ");
        this.nombre = partes[0];
        this.apellido = partes[1];
    }

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void imprimirNombre() {
        System.out.println("Nombre de empleado:" + nombre + " " + apellido);
    }
}

public class TestExample {
    public static void main(String[] args) {
        Empleado daniel = new Empleado("Daniel", "Galvez");
        daniel.setNombre("Gabriela");
        String nombreCompleto = "Gabriela Garcia";
        String[] partes = nombreCompleto.split(" ");
        if (!partes[0].isEmpty())
            daniel.nombre = (partes[0]);
        daniel.apellido = partes[1];
    }

}