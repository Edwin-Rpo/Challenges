package org.example;

import java.time.LocalDate;

public class Administrador extends Usuario {
    private String rol;

    public Administrador() {}

    public Administrador(int id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion,
                         String telefono, String rol) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
