package src.domain;

public abstract class Voluntario extends Persona {

    public Voluntario(String name, String lastName, int age, String idCard) {
        super(name, lastName, age, idCard);
    }

    @Override
    protected void calcularBono() {

        System.out.println("El voluntario no recibe bono monetario, pero recibe beneficios.");
    }
}
