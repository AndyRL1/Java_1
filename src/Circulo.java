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
    public void calcularArea(){
        System.out.println("El area de este circulo es de: \n" + (3.14*this.Radio*this.Radio) + "cm^2");
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro de este circulo es de: \n" + (2*3.14*this.Radio) + "cm");
    }
}
