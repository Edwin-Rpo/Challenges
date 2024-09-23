package Ejercicio_1.src.Domains;

public class Administrador extends Usuario {
    private String rol = "Administrador";

    public Administrador() {}

    public Administrador(int id, String nombre, String apellido, String direccion, String telefono, String fechaNacimiento) {
        super(id, nombre, apellido, direccion, telefono, fechaNacimiento);
    }
    
    public String getRol() {
        return rol;
    }

}
