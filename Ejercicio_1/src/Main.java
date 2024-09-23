package Ejercicio_1.src;

public class Main {
    public static void main(String[] args){

        Cliente cliente = new Cliente(1, "Edwin","Restrepo,","Calle 123","123456","12/12/1990");

        cliente.agregarDestino("Paris");
        cliente.agregarDestino("Londres");

        Administrador admin = new Administrador(2, "Juan","Perez","Calle 456","123456","12/12/1990");

        GestorDeViajes gestor = new GestorDeViajes(3, "Maria","Gomez","Calle 789","123456","12/12/1990");

        Viaje viaje1 = new Viaje(1, "Roma");
        Viaje viaje2 = new Viaje(2, "Berlín");

        Proveedor proveedor1 = new Proveedor(1, "Airbnb");
        Proveedor proveedor2 = new Proveedor(2, "Booking");

        System.out.println("Viaje 1: " + viaje1.getNombreCiudad());
        System.out.println("Viaje 2: " + viaje2.getNombreCiudad());
        
        System.out.println("Proveedor 1: " + proveedor1.getNombrePlataforma());
        System.out.println("Proveedor 2: " + proveedor2.getNombrePlataforma());

        System.out.println("Cliente: "+cliente.getNombre()+" "+cliente.getApellido());
        System.out.println("Destinos Favoritos: "+cliente.getDestinos());
        System.out.println("Rol del administrador: " + admin.getRol());
        System.out.println("Rol del gestor de viajes: " + gestor.getRol());

    }
    
}
