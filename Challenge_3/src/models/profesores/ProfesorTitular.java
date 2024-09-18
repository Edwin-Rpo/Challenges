package src.models.profesores;
import src.models.Profesor;

public class ProfesorTitular extends Profesor {

    public int workHours;
    public int extraHours;

    public ProfesorTitular(String name, String lastName, int age, String idCard, String subject,
                           String contractType, int workHours, int extraHours) {
        super(name, lastName, age, idCard, subject, contractType);
        this.workHours = workHours;
        this.extraHours = extraHours;
    }

    public String extraBonus(){
        return "Hice " + this.extraHours + " horas extras";
    }

}