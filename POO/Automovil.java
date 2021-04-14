package POO;

public class Automovil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque;

    private static String colorPatente;

    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil() { }


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public static String getColorPatente(){ return colorPatente; }

    public static void setColorPatente(String colorPatente){ Automovil.colorPatente = colorPatente; }

    public String detalle(){
        return this.fabricante +
                "\n" + this.modelo +
                "\n" + this.color +
                "\n" + colorPatente +
                "\n" + this.cilindrada;
    }

    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(203);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km/(this.capacidadTanque*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina) {
        return km/(this.capacidadTanque*(porcentajeBencina/100f));
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if (!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "POO.Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
