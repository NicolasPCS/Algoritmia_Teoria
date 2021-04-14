package PyFigura;

public abstract class Figura {
    private String nombre;

    // Declarando método abstracto
    abstract public double area();
    abstract public void pintar(String color);

    public Figura( String n ){
        this.nombre = n;
    }

    // Método de instancia
    final public double compArea( Figura b ){
        return this.area() - b.area();
    }

    final public String toString() {
        return this.nombre + " de area " + area();
    }
}
