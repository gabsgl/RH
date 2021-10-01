package com.registroEmpleados;

public class Main {
    public static void main(String[] args){
        String nombreEmpleado = "Javier";
        String apellidoEmpleado = "Morales";

        Empleado newEmpleado = new Empleado(nombreEmpleado, apellidoEmpleado);
        newEmpleado.imprimirNombre();
        newEmpleado.areaEmpleado();
        newEmpleado.departamento();
        newEmpleado.coordinacion();
        newEmpleado.salarioEmpleado();

        newEmpleado.setNombre("Juan");
        newEmpleado.setApellido("Valdez");
        newEmpleado.imprimirNombre();
        newEmpleado.areaEmpleado();
        newEmpleado.departamento();
        newEmpleado.coordinacion();
        newEmpleado.salarioEmpleado();

    }
}
