package com.registroEmpleados;

public class Empleado extends Areas implements INivelSalarial{
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
        this.nombre = n;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String n) {
        this.apellido = n;
    }

    public void imprimirNombre() {
        System.out.println("Nombre de empleado:" + getNombre() + " " + getApellido());
    }

    @Override
    public void departamento() {
        if (this.nombre == "Javier")
        System.out.println("Direccion");
        else
            System.out.println("Administracion");
    }

    @Override
    public void coordinacion() {
        if (this.nombre == "Javier")
        System.out.println("Director General");
        else
        System.out.println("Asistente");
    }

    @Override
    public void salarioEmpleado() {
        if (this.nombre == "Javier")
            System.out.println("Rango A\n");
        else
            System.out.println("Rango B\n");
    }
}