package Ejercicio_1.src.Domains;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private List<String> destinos;

    public Cliente() {
        this.destinos = new ArrayList<>();
    }

    public Cliente(int id, String nombre, String apellido, String direccion, String telefono, String fechaNacimiento) {
        super(id, nombre, apellido, direccion, telefono, fechaNacimiento);
        this.destinos = new ArrayList<>();
    }

    public void agregarDestino(String destino) {
        this.destinos.add(destino);
    }

    public List<String> getDestinos() {
        return destinos;
    }
    
}
