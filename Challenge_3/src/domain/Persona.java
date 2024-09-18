package src.domain;

public abstract class Persona {

    private String name;
    private String lastName;
    private int age;
    private String idCard; //Cedula

    public Persona(String name, String lastName, int age, String idCard) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getFullName(){
        return this.name + " " + this.lastName;
    }
    protected abstract void calcularBono();
}
