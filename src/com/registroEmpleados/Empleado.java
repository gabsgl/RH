package com.registroEmpleados;

public class Empleado {
    private String nombre;
    private String apellido;

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String n) {
        nombre = n;
    }

    public void imprimirNombre() {
        System.out.println("Nombre de empleado:" + getNombre() + " " + getApellido());
    }
}