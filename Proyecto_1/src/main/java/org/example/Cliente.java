package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private List<String> destinos;

    public Cliente() {
        this.destinos = new ArrayList<>();
    }

    public Cliente(int id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion,
                   String telefono) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.destinos = new ArrayList<>();
    }

    public void agregarDestino(String destino) {
        destinos.add(destino);
    }

    public List<String> getDestinos() {
        return destinos;
    }
}
