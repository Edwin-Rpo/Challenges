package Ejercicio_1.src.Domains;

public class GestorDeViajes extends Usuario {
    private String rol = "Gestor de Viajes";

    public GestorDeViajes() {}

    public GestorDeViajes(int id, String nombre, String apellido, String direccion, String telefono, String fechaNacimiento) {
        super(id, nombre, apellido, direccion, telefono, fechaNacimiento);
    }
    
    public String getRol() {
        return rol;
    }
    
}
