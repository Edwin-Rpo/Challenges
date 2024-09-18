package src;
import src.models.PersonalAdmin;
import src.models.profesores.ProfesorInterino;
import src.models.profesores.ProfesorTitular;
import src.models.voluntarios.VoluntarioExterno;
import src.models.voluntarios.VoluntarioMiembro;
public class Main {
    public static void main(String[] args) {
        PersonalAdmin jefeContable = new PersonalAdmin("Edwin", "Restrepo", 35, "12345678",
                "Jefe de Contaduria", "Contaduria",
                "Horario:7AM --> 5PM");
        jefeContable.increaseSalary(2);
        System.out.printf("Personal administrativo:\nNombre: %s \nSalario: $%s", jefeContable.getFullName(), jefeContable.getSalario());

        ProfesorTitular profeMatematicas = new ProfesorTitular("Paola", "Arboleda", 33, "1234567",
                "Matematicas", "Contrato indefinido", 40, 5);
        profeMatematicas.increaseSalary(10);
        System.out.println("\n\nProfesores: " + profeMatematicas.work());
        System.out.printf("\nProfesor Titular:\nNombre: %s\nEnseña %s \n%s", profeMatematicas.getFullName(), profeMatematicas.getSubject(), profeMatematicas.extraBonus());

        ProfesorInterino profeReemplazo = new ProfesorInterino("Salome", "Restrepo", 20, "11223344",
                "Inglés", "Contrato por horas", "En incapacidad por gripa");
        System.out.printf("\nProfesor Interino:\nNombre: %s, edad %s años", profeReemplazo.getFullName(), profeReemplazo.getAge());
        System.out.printf("\nEsta reemplazando a un profesor(a) %s", profeReemplazo.whoReplace);

        VoluntarioMiembro voluntarioLider = new VoluntarioMiembro("Juan", "Perez", 45,
                "112244", "Evento PyLadies Conf", "Comunidad Tech");
        System.out.println("\n\nVoluntarios:");
        System.out.printf("\nVoluntario Miembro:\nNombre: %s y es Lider en el %s", voluntarioLider.getFullName(), voluntarioLider.getProject());

        VoluntarioExterno voluntarioOcasional = new VoluntarioExterno("Pedro", "Melano", 28, "44556677", "EAFIT");
        System.out.printf("\nVoluntario Externo:\nNombre: %s y pertenece a %s como voluntario externo", voluntarioOcasional.getFullName(), voluntarioOcasional.getExternalOrganization());
    }
}        


