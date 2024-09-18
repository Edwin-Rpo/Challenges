package src.models.voluntarios;

import src.domain.Voluntario;

public class VoluntarioMiembro extends Voluntario {

    private String project;
    private String institution;

    public VoluntarioMiembro(String name, String lastName, int age, String idCard, String project, String institution) {
        super(name, lastName, age, idCard);
        this.project = project;
        this.institution = institution;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
}

