public class Gerente extends Empleado_2{
    private double bono;
    public Gerente(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    public double calcularSalario(){
        return super.calcularSalario() + bono;
    }
}
