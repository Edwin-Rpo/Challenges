package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Edwin", "Restrepo", LocalDate.of(1990, 12, 12), "Calle 123", "123456");
        Administrador admin = new Administrador(2, "Juan", "Perez", LocalDate.of(1985, 5, 20), "Calle 456", "654321", "SuperAdmin");
        GestorDeViajes gestor = new GestorDeViajes(3, "Maria", "Gomez", LocalDate.of(1992, 8, 15), "Calle 789", "789456", "ViajesExpress");

        cliente.agregarDestino("Roma");
        cliente.agregarDestino("Berlín");

        Viaje viaje1 = new Viaje(1, "Roma");
        Viaje viaje2 = new Viaje(2, "Berlín");
        Proveedor proveedor1 = new Proveedor(1, "Airbnb");
        Proveedor proveedor2 = new Proveedor(2, "Booking");

        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Destinos: " + cliente.getDestinos());
        System.out.println("Administrador: " + admin.getNombre() + ", Rol: " + admin.getRol());
        System.out.println("Gestor: " + gestor.getNombre() + ", Agencia: " + gestor.getAgencia());
        System.out.println("Viaje 1: " + viaje1.getCiudad());
        System.out.println("Viaje 2: " + viaje2.getCiudad());
        System.out.println("Proveedor 1: " + proveedor1.getPlataforma());
        System.out.println("Proveedor 2: " + proveedor2.getPlataforma());
    }
}