package src.models.profesores;

import src.models.Profesor;

public class ProfesorInterino extends Profesor {

    public String whoReplace;

    public ProfesorInterino(String name, String lastName, int age, String idCard, String subject,
                            String contractType, String whoReplace) {
        super(name, lastName, age, idCard, subject, contractType);
        this.whoReplace = whoReplace;
    }
}

