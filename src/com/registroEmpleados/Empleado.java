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

    public Empleado setNombre(String n) {
        this.nombre = n;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Empleado setApellido(String n) {
        this.apellido = n;
        return this;
    }

    public void imprimirNombre() {
        System.out.println("Nombre de empleado:" + getNombre() + " " + getApellido());
    }
}