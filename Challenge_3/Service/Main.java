package Challenge_3.Service;

import Challenge_3.Domains.PersonalAdmon;

public class Main {

    public static void main(String[] args) {

        PersonalAdmon admin01= new PersonalAdmon("Juan", "Perez", "12345678A", "Aux Admon", 
        1200, 0.2F,"Administrativo");
        
        System.out.println("Antiguedad:");
        admo1.CalcularAntiguedad();
        System.out.println("Salario:");
        admo1.mostarSalario();
    }
}