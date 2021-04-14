package PyFigura;

public class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    public Rectangulo( String n, double l, double a ){
        super(n);
        this.largo = l;
        this.ancho = a;
    }

    @Override
    public double area(){
        return this.largo * this.ancho;
    }

    @Override
    public void pintar(String color) {
        System.out.println("Rectángulo de color " + color);
    }
}
