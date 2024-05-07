public class Rectangulo extends FiguraGeometrica{
    private double Base;
    private double Altura;

    public Rectangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        Base = base;
        Altura = altura;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double base) {
        Base = base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public void calcularArea(){
        System.out.println("El area de este rectangulo es de: \n" + (this.Base*this.Altura) + "cm^2");
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro de este rectangulo es de: \n" + (this.Base*2+this.Altura*2) + "cm");
    }
}
