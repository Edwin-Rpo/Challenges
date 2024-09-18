package src.domain;

public abstract class Asalariado extends Persona {

    private Long SMLV = 1300000L;
    private Long salario;

    public Asalariado(String name, String lastName, int age, String idCard) {
        super(name, lastName, age, idCard);
        this.salario = SMLV;
    }

    @Override
    protected void calcularBono() {
        Long bono = this.getSalario() * 10 / 100;
        System.out.println("El bono del asalariado es: " + bono);
    }

    public Long getSMLV() {
        return SMLV;
    }

    public void setSMLV(Long SMLV) {
        this.SMLV = SMLV;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    public abstract String work();
    public abstract void increaseSalary(int value);
}
