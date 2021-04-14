package PyFigura;

public class Circulo extends Figura {

    static final private double PI = 3.141592653;
    private double radio;

    public Circulo( String n, double r ) {
        super(n);
        this.radio = r;
    }

    @Override
    public double area() {
        return PI * Math.pow(this.radio,2);
    }

    @Override
    public void pintar(String color) {
        System.out.println("Circulo de color " + color);
    }
}
