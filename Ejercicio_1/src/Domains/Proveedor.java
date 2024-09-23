package Ejercicio_1.src.Domains;

public class Proveedor {
    private int id;
    private String nombrePlataforma;

    public Proveedor() {}

    public Proveedor(int id, String nombrePlataforma) {
        this.id = id;
        this.nombrePlataforma = nombrePlataforma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getNombrePlataforma() {
        return nombrePlataforma;
    }

    public void setNombrePlataforma(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
    }
    
}
