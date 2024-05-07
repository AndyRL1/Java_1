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
}
