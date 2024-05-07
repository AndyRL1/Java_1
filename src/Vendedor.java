public class Vendedor extends Empleado_2{
    private double comision;
    public Vendedor(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    public double calcularSalario(){
        return super.calcularSalario() + comision;
    }
}
