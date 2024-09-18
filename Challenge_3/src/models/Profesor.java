package src.models;

import src.domain.Asalariado;

public class Profesor extends Asalariado {

    private String subject;
    private String contractType;

    public Profesor(String name, String lastName, int age, String idCard, String subject, String contractType) {
        super(name, lastName, age, idCard);
        this.subject = subject;
        this.contractType = contractType;
    }

    @Override
    public String work() {
        return "Persona que ejerce o enseña una ciencia o arte";
    }

    @Override
    public void increaseSalary(int value) {
        super.setSalario(super.getSalario() + value);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }
}
