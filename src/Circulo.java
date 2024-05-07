public class Circulo extends FiguraGeometrica{
    private double Radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        Radio = radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }
}
