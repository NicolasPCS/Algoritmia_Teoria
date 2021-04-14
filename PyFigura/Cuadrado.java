package PyFigura;

public class Cuadrado extends Rectangulo {
    public Cuadrado( String n, double lado ){
        super(n, lado, lado);
    }
    @Override
    public void pintar(String color) {
        System.out.println("Cuadrado de color " + color);
    }
}
