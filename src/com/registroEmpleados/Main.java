package com.registroEmpleados;

public class Main {
    public static void main(String[] args){
        String nombreEmpleado = "Javier";
        String apellidoEmpleado = "Morales";

        Empleado newEmpleado = new Empleado(nombreEmpleado, apellidoEmpleado);
        newEmpleado.imprimirNombre();

        newEmpleado.setNombre("Juan");
        newEmpleado.imprimirNombre();
    }
}
