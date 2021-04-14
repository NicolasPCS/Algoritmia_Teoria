package POO;

import java.util.Date;

public class EjemploAuto {
    public static void main(String[] args) {
        Automovil auto = new Automovil("KIA", "TC");
        Automovil auto2 = new Automovil("Subaru", "Nose");
        Automovil auto3 = new Automovil();

        Date fecha = new Date();

        System.out.println("Simple comparacion: " + (auto == auto2));
        System.out.println("Comparacion con sobrecarga de equals " + (auto.equals(auto2)));
        System.out.println(auto3.equals(auto));

        System.out.println(auto);
        System.out.println(auto2);

        /*System.out.println(auto.getFabricante());
        System.out.println(auto.getModelo());
        System.out.println(auto.getColor());
        System.out.println(auto.getCilindrada());*/

    }
}
