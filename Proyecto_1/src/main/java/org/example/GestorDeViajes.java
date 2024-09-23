package org.example;

import java.time.LocalDate;

public class GestorDeViajes extends Usuario {
    private String agencia;

    public GestorDeViajes() {}

    public GestorDeViajes(int id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String telefono, String agencia) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.agencia = agencia;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
}
