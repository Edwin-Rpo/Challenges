package Challenge_3.Domains;

import Challenge_3.Domains.abstracts.Asalariado;

public class PersonalAdmon extends Asalariado {

    private String cargo;
    private float valorBonificacion;

    public PersonalAdmon(String nombre, String apellido, String id, float salario,float porcBono, 
    String tipoAsalariado, String departamento, int fechaVinculacion) {    
        super(nombre, apellido, id, salario, porcBono, tipoAsalariado, departamento, fechaVinculacion);

    }
    
    public float getValorBonificacion() {
        return valorBonificacion;
    }

    public void setValorBonificacion(float valorBonificacion) {
        this.valorBonificacion = valorBonificacion;
    }

    @Override
    public void CalcularAntiguedad() {
        System.out.println("El empleado "+getNombre()+ " trabaja en el departamento "+getDepartamento()+" desde el "+getFechaVinculacion());
    }

    @Override
    protected void calcularBono() {
        super.calcularBono();
        valorBonificacion = getSalario() * getPorcBono();
    }

    public void mostarSalario(){
        calcularBono();
        System.out.println("La empleada "+getNombre()+" "+getApellido()+
                " tiene un salario bruto de "+getSalario()+
                " y una bonificación de "+getValorBonificacion());
    }

}
