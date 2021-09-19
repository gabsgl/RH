package com.registroEmpleados;

public class Empleado {
    String nombre;
    String apellido;

    public Empleado(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void imprimirNombre(){
        System.out.println("Nombre de empleado:" + nombre+ " " + apellido);
    }
}
