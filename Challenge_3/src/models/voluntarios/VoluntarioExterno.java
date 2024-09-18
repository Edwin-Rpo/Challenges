package src.models.voluntarios;

import src.domain.Voluntario;

public class VoluntarioExterno extends Voluntario {

    private String externalOrganization;

    public VoluntarioExterno(String name, String lastName, int age, String idCard, String externalOrganization) {
        super(name, lastName, age, idCard);
        this.externalOrganization = externalOrganization;
    }

    public String getExternalOrganization() {
        return externalOrganization;
    }

    public void setExternalOrganization(String externalOrganization) {
        this.externalOrganization = externalOrganization;
    }
}