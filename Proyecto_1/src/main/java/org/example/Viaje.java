package org.example;

public class Viaje {
    private int id;
    private String ciudad;

    // Constructor vacío
    public Viaje() {}

    // Constructor que inicializa los atributos
    public Viaje(int id, String ciudad) {
        this.id = id;
        this.ciudad = ciudad;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCiudad() {
        return ciudad;
    }
}
