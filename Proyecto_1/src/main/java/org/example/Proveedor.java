package org.example;

public class Proveedor {
    private int id;
    private String plataforma;

    // Constructor vacío
    public Proveedor() {}

    // Constructor que inicializa los atributos
    public Proveedor(int id, String plataforma) {
        this.id = id;
        this.plataforma = plataforma;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getPlataforma() {
        return plataforma;
    }
}
